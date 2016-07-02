package jp.ac.jaist.kslab.sb.marte.merge.sample

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.WorkflowContext

class ResourceReader extends WorkflowComponentWithModelSlot {
	String uri
	
	override void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		var resourceSet = new ResourceSetImpl()
		var fileUri = URI::createFileURI(uri)
		var resource = resourceSet.getResource(fileUri, true)
		ctx.set(modelSlot, resource)
	}

	def setUri(String uri){
		this.uri = uri
	}
	def String getUri(){
		return uri
	}
}