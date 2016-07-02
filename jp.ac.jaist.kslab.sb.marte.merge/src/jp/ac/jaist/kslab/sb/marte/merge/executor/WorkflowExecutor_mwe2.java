package jp.ac.jaist.kslab.sb.marte.merge.executor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import jp.ac.jaist.kslab.sb.marte.merge.Activator;
import jp.ac.jaist.kslab.sb.marte.merge.generator.HardwareModelWriter;
import jp.ac.jaist.kslab.sb.marte.merge.generator.SRMtoUMLTransformer;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.emf.mwe2.runtime.workflow.Workflow;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class WorkflowExecutor_mwe2 {
	private static final String mergeWF = "src/jp/ac/jaist/kslab/sb/marte/merge/generator/MergeWorkflow.mwe2";
	private static final String toGatewayWF = "src/jp/ac/jaist/kslab/sb/marte/merge/generator/ToGatewayWorkflow.mwe2";
	private static final String toUmlWF = "src/jp/ac/jaist/kslab/sb/marte/merge/generator/ToUmlWorkflow.mwe2";
	private static final String codeGenWF = "src/jp/ac/jaist/kslab/sb/marte/merge/generator/CodeGenerateWorkflow.mwe2";
	
	Mwe2Runner runner;
	
	
	public WorkflowExecutor_mwe2() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		runner = injector.getInstance(Mwe2Runner.class);
	}
	
	public void runMergeWF(String modelPath, String circuitPath, String blockPath, String output){
		File file = getFileinPlugin(mergeWF);
		Map<String, String> props = new HashMap<String, String>();
		props.put("modelPath", modelPath);
		props.put("circuitFile", circuitPath);
		props.put("blockFile", blockPath);
		props.put("hardwareModelUri", output);
		runner.run(URI.createFileURI(file.getAbsolutePath()), props);
	}
	public void runMergeWF2(String modelPath, String circuitPath, String blockPath, String output){
		File file = getFileinPlugin(mergeWF);
		Map<String, String> props = new HashMap<String, String>();
		props.put("modelPath", modelPath);
		props.put("circuitFile", circuitPath);
		props.put("blockFile", blockPath);
		props.put("hardwareModelUri", output);
		runner.run(URI.createFileURI(file.getAbsolutePath()), props);
	}
	
	public void runToGatewayWF(String hardwareUri, String gatewayUri){
		File file = getFileinPlugin(toGatewayWF);
		Map<String, String> props = new HashMap<String, String>();
		props.put("hardwareModelUri", hardwareUri);
		props.put("gatewayModelUri", gatewayUri);
		runner.run(URI.createFileURI(file.getAbsolutePath()), props);		
	}
	
	public void runToUMLWF(String gatewayUri, String umlUri){
		File file = getFileinPlugin(toUmlWF);
		Map<String, String> props = new HashMap<String, String>();
		props.put("gatewayModelUri", gatewayUri);
		props.put("umlUri", umlUri);
		runner.run(URI.createFileURI(file.getAbsolutePath()), props);		
	}
	public void runToUMLWF2(String gatewayUri, String umlUri){
		IWorkflowContext ctx = new WorkflowContextImpl();
		StandaloneSetup setup = new StandaloneSetup();
		setup.addRegisterGeneratedEPackage("MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage");
		Reader reader = new Reader();
		reader.setUri(gatewayUri);
		reader.setModelSlot("gatewayModel");
		reader.invoke(ctx);
		
		SRMtoUMLTransformer trans = new SRMtoUMLTransformer();
		trans.setGatewayModel("gatewayModel");
		trans.setUmlModel("umlModel");
		trans.invoke(ctx);
		
		HardwareModelWriter writer = new HardwareModelWriter();
		writer.setUri(umlUri);
		writer.setModelSlot("umlModel");
		writer.invoke(ctx);
	}
	
	public void runCodeGenerateWF(String umlUri, String srcDirPath){
		File file = getFileinPlugin(codeGenWF);
		Map<String, String> props = new HashMap<String, String>();
		props.put("umlUri", umlUri);
		props.put("srcUri", srcDirPath);
		runner.run(URI.createFileURI(file.getAbsolutePath()), props);		
	}
	
	public static void main(String[] args) {
		WorkflowExecutor_mwe2 exe = new WorkflowExecutor_mwe2();
//		exe.testWorkflow();
		exe.testComponentFlow();
	}
	
	private void testComponentFlow(){
		runToUMLWF2("genmodel/gateway.xmi","genmodel/uml.xmi");
	}
	
	private void testWorkflow(){
		runMergeWF("model","model/acc_logger.circuit", "model/motionlogger.blockdiagram", "genmodel/hardware.xmi");
		runToGatewayWF("genmodel/hardware.xmi","genmodel/gateway.xmi");
		runToUMLWF("genmodel/gateway.xmi","genmodel/uml.xmi");
		runCodeGenerateWF("genmodel/uml.xmi", "generated-src");		
	}
	
	private File getFileinPlugin(String localpath){
		URL url;
		try {
			url = FileLocator.toFileURL(Activator.getDefalut().getBundle().getEntry(localpath));
			return new File(url.getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
