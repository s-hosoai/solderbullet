package jp.ac.jaist.kslab.sb.marte.merge.generator

import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram
import MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringFactory
import org.eclipse.uml2.uml.UMLFactory
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramFactory
import org.eclipse.emf.common.util.EList
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral
import org.eclipse.uml2.uml.Operation
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.typesystem.emf.EcoreUtil2
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.CallOperationAction
import MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram
import MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker
import java.util.Map
import java.util.HashMap
import java.util.Set
import java.util.HashSet

class HRMtoSRMTransformer extends AbstractWorkflowComponent {
	
	private String hardwareSlot
	private String gatewaySlot
	
	private DeviceBroker mcu
	private Set<DeviceBroker> devs = new HashSet()
	
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		println("HRM to SRM transforming")
		var model = ctx.get(hardwareSlot) as HwHRMDiagram
		var srmdiagram = createSRMDiagram
		for(com : model.components){
			switch(com){
				HwMCU:{
					var broker = createSRMComponent(com)
					srmdiagram.devices.add(broker)
					mcu =broker
				}
				HwDevice:{
					var broker = createSRMComponent(com)
					srmdiagram.devices.add(broker)
					devs.add(broker)
				}
			}
		}
		
		callReconnect()
		
		ctx.set(gatewaySlot, srmdiagram)
	}
	
	def create r: HwDiagramFactory::eINSTANCE.createSRMDiagram() createSRMDiagram(){}
	
	def create r: SW_BrokeringFactory::eINSTANCE.createDeviceBroker() createSRMComponent(HwMCU mcu){
		r.name = mcu.name
//		r.devices.add(mcu)
		for(peripheral : mcu.peripherals as EList<HwPeripheral>){
			r.operations.addAll(EcoreUtil::copyAll(peripheral.operationimpls))
			r.activities.addAll(EcoreUtil::copyAll(peripheral.activities))
		}
		for(op:r.operations as EList<Operation>){
			var act = r.activities.findFirst(Activity a | a.name==op.name)
			act.specification=op
			op.methods.add(act)
		}
	}

	def create r: SW_BrokeringFactory::eINSTANCE.createDeviceBroker() createSRMComponent(HwDevice dev){
		r.name = dev.name
//		r.devices.add(dev)
		r.operations.addAll(EcoreUtil::copyAll(dev.operations))
		r.activities.addAll(EcoreUtil::copyAll(dev.activities))
		for(op:r.operations as EList<Operation>){
			var act = r.activities.findFirst(Activity a | a.name==op.name)
			act.specification=op
			op.methods.add(act)
		}
	}
	
	
	def callReconnect(){
		for(d : devs){
			for(act : d.activities as EList<Activity>){
				for(call : act.nodes){
					switch(call){
						CallOperationAction : {
							call.operation = mcu.operations.findFirst(Operation o | o.name==call.operation.name)	 
						}
					}
				}
			}
		}
	}
	
	// setter & check
	def setHardwareModel(String hardwareSlot){
		this.hardwareSlot = hardwareSlot
	}
	def setGatewayModel(String gatewaySlot){
		this.gatewaySlot = gatewaySlot
	}
	
	override checkConfiguration(Issues issues) {
		if(hardwareSlot==null){
			issues.addError("Hardware Slot is empty")
		}
		if(gatewaySlot==null){
			issues.addError("Gateway Slot is empty")
		}		
	}	
}