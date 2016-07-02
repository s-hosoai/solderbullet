package jp.ac.jaist.kslab.sb.marte.merge.generator

import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import java.io.IOException
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.EObject

class MyWriter extends WorkflowComponentWithModelSlot{
	String uri
	
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		var resourceSet = new ResourceSetImpl()
		var fileUri = URI::createFileURI(getUri)
		fileUri = resourceSet.URIConverter.normalize(fileUri)
		var resource = resourceSet.createResource(fileUri)

		var models = ctx.get(modelSlot) as ArrayList<EObject>
		for(r : models){
			resource.contents.add(r)
		}
		try{
			resource.save(null)
		}catch(IOException ioe){
			throw new WrappedException(ioe)
		}
	}
	
	def setUri(String uri){
		this.uri = uri
	}
	def String getUri(){
		return uri
	}
}