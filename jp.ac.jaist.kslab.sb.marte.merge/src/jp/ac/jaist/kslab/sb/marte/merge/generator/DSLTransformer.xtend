package jp.ac.jaist.kslab.sb.marte.merge.generator

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramFactory
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDeviceFactory
import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolFactory
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionFactory
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackageFactory
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralFactory
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterFactory
import com.google.inject.Inject
import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslExpression
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.uml2.uml.UMLFactory
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.DataType

class DSLTransformer extends WorkflowComponentWithModelSlot {
//	@Inject extension DslBehaviorTransformer
	
	// workflow params
	private String input
	private String output

	def setInput(String inputSlot){
		this.input = inputSlot
	}
	
	def setOutput(String outputSlot){
		this.output = outputSlot
	}
	
	// transform params
	private Map<HwPort, ArrayList<String>> unresolvePortPins = new HashMap()
	private Map<String, DataType> types
	
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		var dslmodels = ctx.get(input) as ArrayList<Resource>
		var ArrayList<EObject> results = new ArrayList<EObject>()
		
		var HwHRMDiagram result
		for(r: dslmodels){
			types = new HashMap()
			for(e : r.allContents.toIterable){
				switch(e){
					Datasheet: {
						result = createDatasheet(e)
						result.pinReconnect()
					}
					DslProtocol : result = createProtocolDatasheet(e)
				}
			}
			result.datatypes.addAll(types.values)
			results.add(result)
		}		
		ctx.set(output, results)
	}
	def create r : HwDiagramFactory::eINSTANCE.createHwHRMDiagram createProtocolDatasheet(DslProtocol d){
		r.name = d.name
		r.protocols.add(createProtocol(d))
	}
	
	def create r : HwDiagramFactory::eINSTANCE.createHwHRMDiagram createDatasheet(Datasheet d){
		for(component : d.components){
			switch(component){
				DslDevice : r.components.add(createComponent(component))
				DslMcu : r.components.add(createComponent(component))
			}
		}
		
		for(imp : d.imports){
			if(!imp.importedNamespace.contains("*")){
				r.protocols.add(createProtocol(imp.importedNamespace))
				println("add protocol "+imp.importedNamespace)
			}
		}
	}
		
	def create r : HwComputingFactory::eINSTANCE.createHwMCU createComponent(DslMcu mcu){
		r.name = mcu.name
		for(pin : mcu.pins){
			r.pins.add(createPin(pin))
		}
		for(port : mcu.ports){
			r.ports.add(createPort(port))
		}
		for(pkg : mcu.packages){
			r.packages.add(createPackage(pkg))
		}
		for(reg : mcu.sfr){
			r.sfr.add(createRegister(reg))
		}
		for(peripheral : mcu.peripherals){
			r.peripherals.add(createPeripheral(peripheral))
		}		
	}
	
	//@DONE
	def create r : HwDeviceFactory::eINSTANCE.createHwDevice createComponent(DslDevice dev){
		r.name = dev.name
		for(pin : dev.pins){
			r.pins.add(createPin(pin))
		}
		for(port : dev.ports){
			r.ports.add(createPort(port))
		}
		for(pkg : dev.packages){
			r.packages.add(createPackage(pkg))
		}
		for(reg : dev.registers){
			r.registers.add(createRegister(reg))
		}
		for(func : dev.functions){
			var devfunc = createFunction(func)
			var devact = createActivity(func)
			devfunc.methods.add(devact)
			devact.specification = devfunc
			r.operations.add(devfunc)
			r.activities.add(devact)
		}
	}
	
	def create r : HwProtocolFactory::eINSTANCE.createHwProtocol createProtocol(DslProtocol protocol){
		r.name = protocol.name
		for(op : protocol.operations){
			r.operations.add(createOperation(op))
		}
	}

	//create dummy protocol
	def create r : HwProtocolFactory::eINSTANCE.createHwProtocol createProtocol(String name){
		r.name = name
	}

// for common elements
//Pin
	def create r : HwIOFactory::eINSTANCE.createHwPin createPin(DslPin pin){
		r.name = pin.name
		//pkg, portのpinとはpinreconnectで．
	}
//Port
	def create r : HwCommunicationFactory::eINSTANCE.createHwPort createPort(DslPort port){
		r.name = port.name
		var pins = new ArrayList<String>()
		for(p : port.pins){
			pins.add(p.name)
		}
		unresolvePortPins.put(r, pins)
	}
//Package
	def create r : HwPackageFactory::eINSTANCE.createHwPackage createPackage(DslPackage pkg){
		r.name = pkg.names.head
		r.packageType = pkg.names.head
		
		for(pin : pkg.pins){
			r.pins.add(createPkgPin(pin))
		}
	}
//PkgPin
	def create r : HwPackageFactory::eINSTANCE.createHwPackagePin createPkgPin(DslPackagePin pin){
		r.name = pin.name
		r.pinNo = pin.pinNo
		for(alt : pin.altNames){
			r.altNames.add(alt)
		}
	}
//Register	
	def create r : HwRegisterFactory::eINSTANCE.createHwRegister createRegister(DslRegister register){
		r.name = register.name
		r.address = register.address		
	}

	// for mcu elements
	def create r : HwDeviceFactory::eINSTANCE.createHwPeripheral createPeripheral(DslPeripheral peripheral){
		r.name = peripheral.name
		for(op : peripheral.operations){
			var opimpl = createOperationImpl(op)
			var actimpl = createPeripheralActivities(op)
			opimpl.methods.add(actimpl)
			actimpl.specification = opimpl
			r.operationimpls.add(opimpl)
			r.activities.add(actimpl)
		}
//		r.refports = 
//		r.refsfr //@TODO
	}
	
		//@TODO
//OperationImpl
	def create r : HwPeripheralFactory::eINSTANCE.createOperationImpl createOperationImpl(DslOperationImpl op){
		r.name = op.implOperation.name
		r.type = getType(op.rettype)
		
		for(param : op.params){
//			r.parameterableElements.add(createParameter(param))
		}
	}
	
	//@TODO
	def create r : HwPeripheralFactory::eINSTANCE.createPeripheralActivity createPeripheralActivities(DslOperationImpl op){
		r.name = op.implOperation.name
		
		for(param : op.params){
			r.nodes.add(createPin(param))
		}
		r.nodes.add(UMLFactory::eINSTANCE.createInitialNode)
		for(exp : op.expression){
			r.nodes.add(createAction(exp))
		}
		r.nodes.add(UMLFactory::eINSTANCE.createActivityFinalNode)
		if (op.rettype!=null){
			var result = UMLFactory::eINSTANCE.createOutputPin()
			result.name = op.rettype.type
			r.nodes.add(result)	
		}
	}
	
	def createAction(DslPeripheralExpression exp){
		switch(exp){
			DslRegisterRead:createAction(exp)
			DslRegisterWrite:createAction(exp)
			default : createActionAnyOther(exp)
		}
	}
	def create r : HwPeripheralFactory::eINSTANCE.createReadRegisterAction() createAction(DslRegisterRead exp){
		var ref = exp.ref
		switch(ref){
			DslRegister:r.name = "read : "+ref.name
		}
	}
	def create r : HwPeripheralFactory::eINSTANCE.createWriteRegisterAction() createAction(DslRegisterWrite exp){
		var ref = exp.ref
		switch(ref){
			DslRegister:r.name = "write : "+ref.name
		}		
	}
	
	def create r : UMLFactory::eINSTANCE.createStructuredActivityNode createActionAnyOther(DslPeripheralExpression exp){
		r.name = exp.toString
	}

	// for device elements
	def create r : HwDeviceFunctionFactory::eINSTANCE.createHwDeviceFunction createFunction(DslFunction function){
		r.name = function.name
		r.setIsAbstract(false)
		r.type = getType(function.type)
		r.ownedParameters //TODO パラメータ		
	}
	
	def create r : UMLFactory::eINSTANCE.createOperation createOperation(DslOperation operation){
		r.name = operation.name
		r.setIsAbstract(true)
		r.type = getType(operation.type)
		r.ownedParameters //TODO パラメータ
	}
	
	//TODO
	def create r : UMLFactory::eINSTANCE.createActivity createActivity(DslFunction func){
		r.name = func.name
		// input pins from parameter
		for(param : func.params){
			r.nodes.add(createPin(param))
		}
		r.nodes.add(UMLFactory::eINSTANCE.createInitialNode)
		for(exp : func.expressions){
			r.nodes.add(createAction(exp))
		}
		r.nodes.add(UMLFactory::eINSTANCE.createActivityFinalNode)
		
		if (func.type!=null){
			var result = UMLFactory::eINSTANCE.createOutputPin()
			result.name = func.type.type
			r.nodes.add(result)	
		}
	}
	
	def create r : UMLFactory::eINSTANCE.createInputPin createPin(DslTypedParameter param){
		r.name = param.name
//		r.type = param.paramType
	}
	
	def createAction(DslExpression exp){
		switch(exp){
			DslCallFunction:createAction(exp)
			DslDefineVariable:createAction(exp)
			default : createActionAnyOther(exp)
		}
	}
	
	def create r : UMLFactory::eINSTANCE.createCallOperationAction createAction(DslCallFunction exp){
		r.name = exp.function.name
	}
	
	def create r : UMLFactory::eINSTANCE.createInputPin createAction(DslDefineVariable exp){
		r.name = exp.name
	}
	
	def getType(DslType t){
		if(t!=null){
			if(types.containsKey(t.type)){
				return types.get(t.type)
			}else{
				var type = createType(t.type)
				types.put(t.type, type)
				return type
			}
		}else{
			var v = createType("void")
			types.put("void", v)
			
		}
	}
	
	def create r : UMLFactory::eINSTANCE.createDataType createType(String name){
		r.name = name
	}
	
	def pinReconnect(HwHRMDiagram d){
		for(comp : d.components){
			var EList<HwPin> pins
			var EList<HwPackagePin> pkgpins
			var HwPackage pkg
			var EList<HwPort> ports
			switch (comp){
				HwMCU:{
					pins = comp.pins
					pkg = comp.packages.head
					pkgpins = pkg.pins
					ports = comp.ports
				}
				HwDevice:{
					pins = comp.pins
					pkg = comp.packages.head
					pkgpins = pkg.pins
					ports = comp.ports
				}
			}
			for(p : pins){
				var refPkgPin = pkgpins.findFirst(pkgp | 
					pkgp.altNames.contains(p.name)||pkgp.name==p.name)
				if(refPkgPin!=null){
					p.pkgPin = refPkgPin
					refPkgPin.refpin.add(p)
				}else{
					println("unresolv pin : "+p.name)
				}
			}
			for(port : ports){
				for(portpin : unresolvePortPins.get(port)){
					port.pins.add(pins.findFirst(p | p.name==portpin))
				}
			}
		}
	}
}