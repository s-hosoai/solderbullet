package jp.ac.jaist.kslab.sb.marte.merge.sample

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import com.google.common.collect.Iterators
import org.eclipse.emf.ecore.EClassifier
import java.util.ArrayList

class Transformer extends WorkflowComponentWithModelSlot {
	boolean toLowerCase
	override void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		var models = ctx.get(modelSlot) as ArrayList<Resource>
		for(Resource resource : models){	
			EcoreUtil::resolveAll(resource)
			var contents = EcoreUtil::getAllContents(resource, true)
			var iter = Iterators::filter(contents, typeof(EClassifier))
			while(iter.hasNext){
				var classifier = iter.next as EClassifier
				if (isToLowerCase){
					classifier.setName(classifier.name.toLowerCase)			
				}else{
					classifier.setName(classifier.name.toUpperCase)			
				}
			}
		}
	}
	
	def setToLowerCase(boolean toLowerCase){
		this.toLowerCase = toLowerCase
	}
	
	def boolean isToLowerCase(){
		return toLowerCase;
	}
}