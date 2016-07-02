package jp.ac.jaist.kslab.sb.marte.merge.generator

import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource

class ModelToResource extends AbstractWorkflowComponent {
	private String in
	private String out
		
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		var model = ctx.get(in) as EObject
		var r = new ResourceImpl()
		r.contents.add(model)
		var list = new ArrayList<Resource>()
		list.add(r)
		ctx.set(out, list)
	}
	
	override checkConfiguration(Issues arg0) {
	}
	
	def setIn(String in){
		this.in = in
	}
	def setOut(String out){
		this.out = out
	}
}