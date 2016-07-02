package jp.ac.jaist.kslab.sb.marte.merge.generator


import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import java.util.ArrayList
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice
import java.util.Map
import java.util.HashMap
import MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl
import MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramFactoryImpl
import org.eclipse.emf.ecore.EObject
import static extension org.eclipse.xtext.xbase.lib.IterableExtensions.*
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent
import blockdiagram.Diagram
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramFactory
import blockdiagram.MCU
import blockdiagram.Device
import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol
import org.eclipse.emf.common.util.EList
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection
import blockdiagram.Connection
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory
import org.eclipse.emf.mwe.core.WorkflowInterruptedException
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwLine
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin
import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolFactory
import org.eclipse.uml2.uml.CallOperationAction
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.DataType

class HardwareModelMerger extends AbstractWorkflowComponent {
	// slots
	String circuitSlot
	String blockSlot
	String specSlot
	String output
	
	//inter 
	Map<String, HwMCU> mcus
	Map<String, HwDevice> devices
	Map<String, HwProtocol> protocols
	Map<String, DataType> datatypes

	HwCircuitDiagram circuitdiagram
	Diagram blockdiagram
	HwHRMDiagram hardwaremodel

	// ワークフロールート，spec収集， ブロックからひな形作ってspecとマージ，circuitとマージ
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		println("loading models ...")
		mcus = new HashMap<String, HwMCU>()
		devices = new HashMap<String, HwDevice>()
		protocols = new HashMap()
		datatypes = new HashMap()
		
		var model = ctx.get(specSlot) as ArrayList<HwHRMDiagram>
		for(datasheet :  model){
			for(protocol : datasheet.protocols as EList<HwProtocol>){
				if(protocol.operations.size!=0){
					protocols.put(protocol.name, protocol)
				}
			}
			for(type : datasheet.datatypes as EList<DataType>){
				datatypes.put(type.name, type)
			}
		}
		for(datasheet :  model){
			for(com : datasheet.components){
				switch com {
					HwMCU : {
						mcus.put(com.name, com)
						println("puts mcu "+com.name)
					}
					HwDevice :{
						devices.put(com.name, com)
						for(act : com.activities as EList<Activity>){
							for(action : act.nodes){
								switch(action){
									CallOperationAction:{
										var op = findOperation(action)
										if(op!=null) action.operation=op
									}
								}
							}
						}
						println("puts dev "+com.name)
					}
				}	
			}
		}
		
		blockdiagram = ctx.get(blockSlot) as Diagram
		println("merging block model")
		hardwaremodel = createPortlevelHRM(blockdiagram)
		
		println("merging circuit model")
		circuitdiagram = getCircuitModel(ctx.get(circuitSlot) as ArrayList<Resource>)
		if (circuitdiagram==null) {
			issues.addWarning("CIRCUIT IS NULL")
		}
		
		createDetailedHRM(hardwaremodel, circuitdiagram)
		hardwaremodel.datatypes.addAll(datatypes.values)
		ctx.set(output, hardwaremodel)
	}
	
	def findOperation(CallOperationAction act){
/* 
		for(importProtocol : diag.protocols as EList<HwProtocol>){
			var obj = protocols.get(importProtocol.name).operations.findFirst(Operation op|op.name==act.name)
			
			*/
		for(p : protocols.values){
			var obj = p.operations.findFirst(Operation op|op.name==act.name)		
			if(obj!=null){
				println("find : "+obj.name)
				return obj	
			}
		}
		return null
	}
	
	// circuit Modelが深いところにあるので，取ってきてるだけ．
	def HwCircuitDiagram getCircuitModel(ArrayList<Resource> resources){
		for(r : resources){
			for(obj : r.allContents.toIterable){
				switch obj {
					HwCircuitDiagram : return obj
				}
			}
		}
		return null
		// throw exception?
	}
	
	// block diagとspecの統合， blockにあるものをspecからHRMに移した後，port間を接続
	def create r : HwDiagramFactory::eINSTANCE.createHwHRMDiagram createPortlevelHRM(Diagram block){
		for(com : block.com){
			switch(com){
				MCU : {
					var mcu = mcus.get(com.name)
					if(mcu!=null){
						r.components.add(mcu)
					}else{
						println("not found : "+com.name)
					}
				}
				Device : {
					var dev = devices.get(com.name)
					if(dev!=null){
						r.components.add(dev)
					}else{
						println("not found : "+com.name)
					}
				}
			}
		}
		// connect port to port，現状はport名は接続名（＝Protocol名）と同じで．
		for(component : block.com as EList<blockdiagram.HwComponent>){
			for(con : component.conection as EList<Connection>){
				switch(component){
					MCU : {
						var port1 = mcus.get(component.name).ports.getPort(con.name)
						var port2 = devices.get(con.ref.name).ports.getPort(con.name)
						if(port1==null || port2==null){
							throw new WorkflowInterruptedException()
						}
						r.connections.add(createConnection(port1, port2, con))
					}
					Device : {
						var port1 = mcus.get(con.ref.name).ports.getPort(con.name)
						var port2 = devices.get(component.name).ports.getPort(con.name)
						if(port1==null || port2==null){
							throw new WorkflowInterruptedException()
						}
						r.connections.add(createConnection(port1, port2, con))
					}
				}
			}
		}
	}
	
	// HRMにcircuitレベルの接続を加える．circuitからWire一覧を入れ，コンポーネント間を接続
	def createDetailedHRM(HwHRMDiagram diag, HwCircuitDiagram circuit){
		var List<HwWire> wires = new ArrayList()
		var List<HwLine> lines = new ArrayList()
		for(w : circuit.wires as EList<HwWire>){
			wires.add(w)
			lines.add(createLine(w))
		}
		diag.connections.addAll(wires)
		diag.connections.addAll(lines)
		
		for(circuitComponent : circuit.components as EList<HwPackage>){
			var pos = circuitComponent.name.indexOf("_")
			var compName = circuitComponent.name.substring(0,pos)
			var pkgName = circuitComponent.name.substring(pos+1)
			println(compName+", "+pkgName)
			var component = getComponent(compName)
			for(circuitPin :circuitComponent.pins as EList<HwPackagePin>){
				var pkgpin = getPkgPin(component, pkgName, circuitPin.name)
				var pin = getPin(component, circuitPin.name)
				for(circuitWire : circuitPin.wire as EList<HwWire>){
					pkgpin.wire.add(wires.findFirst(w | w.name==circuitWire.name))
					pin.lines.add(lines.findFirst(l | l.name==circuitWire.name))
				}
			}
		}
		diag.protocols.addAll(protocols.values)
	}
	
	// コネクションのインスタンス作って，コンポーネントから繋ぐ
	def create r : HwCommunicationFactory::eINSTANCE.createHwConnection createConnection(HwPort p1, HwPort p2, Connection blockConnection){
		r.name = blockConnection.name
		r.protocols.add(getProtocol(blockConnection.name))
		
		p1.connectedTo.add(r)
		p2.connectedTo.add(r)
	}
	// 論理レベルの回路接続
	def create r : HwIOFactory::eINSTANCE.createHwLine createLine(HwWire wire){
		r.name = wire.name
	}
	def create r : HwProtocolFactory::eINSTANCE.createHwProtocol createProtocol(String name){
		r.name = name
	}
	
	// mcus，devicesの両リストからサーチ．　リストをマージしてからの方がスマートかも
	def getComponent(String name){
		var all = new HashMap<String, HwResource>()
		all.putAll(mcus)
		all.putAll(devices)
		all.get(name)
	}
	
	def getProtocol(String name){
		if (protocols.containsKey(name)){
			return protocols.get(name)
		}else{
//			var p = createProtocol(name)
//			protocols.put(name, p)
			return null
		}
	}
		
	def getPort(EList<HwPort> ports, String name){
		ports.findFirst(HwPort p | p.name==name)
	}
	
	//変な事してるけど，　あるmcuかdevのpkgのPinからpinnameのものを取ってきてるだけ
	def getPkgPin(HwResource res, String pkgName, String pinName){
		var EList<HwPackage> pkgs
		switch(res){
			HwMCU : pkgs = res.packages
			HwDevice : pkgs = res.packages
			default : return null
		}
		pkgs.findFirst(HwPackage p | p.name==pkgName).pins.findFirst(HwPackagePin pin | pin.name==pinName)
	}
	def getPin(HwResource res, String pinname){
		var EList<HwPin> pins
		switch(res){
			HwMCU: pins = res.pins
			HwDevice : pins = res.pins
		}
		pins.findFirst(p | p.name==pinname)
	}

	// setter, getter, others
	
	def void setSpec(String specSlot){
		this.specSlot = specSlot
	}
	def void setCircuit(String circuitSlot){
		this.circuitSlot = circuitSlot
	}
	def void setBlock(String blockSlot){
		this.blockSlot = blockSlot
	}
	def void setOutput(String output) {
		this.output = output
	}
	
	override checkConfiguration(Issues arg0) {
	}
}