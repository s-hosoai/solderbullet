package jp.ac.jaist.kslab.sb.marte.merge.generator

import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram
import org.eclipse.uml2.uml.UMLFactory
import MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker
import org.eclipse.emf.ecore.util.EcoreUtil

class SRMtoUMLTransformer extends AbstractWorkflowComponent {
	private String srmSlot
	private String umlSlot

	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		println("SRM Transforming to UML")
		var model = ctx.get(srmSlot) as SRMDiagram
		var uml = createPackage()
		
		for(d : model.devices){
			switch(d){
				DeviceBroker:uml.packagedElements.add(createClass(d))
			}
		}
		
		ctx.set(umlSlot, uml)
	}
	
	def create r : UMLFactory::eINSTANCE.createPackage() createPackage(){
		r.name = "gateway"
	}

	def create r : UMLFactory::eINSTANCE.createClass() createClass(DeviceBroker dev){
		r.name = dev.name
//		r.applyStereotype(createStereoType("DeviceBroker"))
		r.ownedOperations.addAll(EcoreUtil::copyAll(dev.operations))
		r.ownedBehaviors.addAll(EcoreUtil::copyAll(dev.activities))
	}
	
	def create r : UMLFactory::eINSTANCE.createStereotype() createStereoType(String name){
		r.name = name
	}
	
	//setter & checcker
	def setGatewayModel(String srmSlot){
		this.srmSlot = srmSlot
	}
	def setUmlModel(String umlSlot){
		this.umlSlot = umlSlot
	}
	override checkConfiguration(Issues arg0) {
	}	
}