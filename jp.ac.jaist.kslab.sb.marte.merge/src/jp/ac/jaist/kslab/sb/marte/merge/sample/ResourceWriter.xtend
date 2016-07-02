package jp.ac.jaist.kslab.sb.marte.merge.sample

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import java.io.IOException
import org.eclipse.emf.common.util.WrappedException
import java.util.ArrayList

class ResourceWriter extends WorkflowComponentWithModelSlot {
	String uri
	
	override void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		var models = ctx.get(modelSlot) as ArrayList<Resource>
		var fileUri = URI::createFileURI(getUri)
		for(resource : models){
			fileUri = resource.resourceSet.URIConverter.normalize(fileUri)
			resource.setURI(fileUri)
			try{
				resource.save(null)
			}catch(IOException ioe){
				throw new WrappedException(ioe)
			}
		}
	}
	
	def setUri(String uri){
		this.uri = uri
	}
	def String getUri(){
		return uri
	}
}