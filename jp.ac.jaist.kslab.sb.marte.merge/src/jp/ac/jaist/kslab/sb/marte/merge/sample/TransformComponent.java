package jp.ac.jaist.kslab.sb.marte.merge.sample;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class TransformComponent extends WorkflowComponentWithModelSlot {
	
	private String uri;

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1,
			Issues arg2) {
		
		
		Resource resource = (Resource) ctx.get(getModelSlot());
				
		/*
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(uri);
		Resource resource = resourceSet.getResource(fileURI, true);
		ctx.set(getModelSlot(), resource);
		*/
	

	}

	@Override
	public void invoke(IWorkflowContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInvoke() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preInvoke() {
		// TODO Auto-generated method stub
		
	}
}
