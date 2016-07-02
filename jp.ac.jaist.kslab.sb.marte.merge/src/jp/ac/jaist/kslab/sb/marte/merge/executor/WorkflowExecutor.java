package jp.ac.jaist.kslab.sb.marte.merge.executor;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import jp.ac.jaist.kslab.sb.marte.dsl.circuit.CircuitDslStandaloneSetup;
import jp.ac.jaist.kslab.sb.marte.merge.MergeDslStandaloneSetup;
import jp.ac.jaist.kslab.sb.marte.merge.generator.DSLTransformer;
import jp.ac.jaist.kslab.sb.marte.merge.generator.HRMtoSRMTransformer;
import jp.ac.jaist.kslab.sb.marte.merge.generator.HardwareModelMerger;
import jp.ac.jaist.kslab.sb.marte.merge.generator.HardwareModelWriter;
import jp.ac.jaist.kslab.sb.marte.merge.generator.ModelToResource;
import jp.ac.jaist.kslab.sb.marte.merge.generator.SRMtoUMLTransformer;
import jp.ac.jaist.kslab.sb.marte.spec.SpecDslStandaloneSetup;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.xtext.generator.GeneratorComponent;
import org.eclipse.xtext.generator.GeneratorComponent.Outlet;
import org.eclipse.xtext.mwe.NameBasedFilter;
import org.eclipse.xtext.mwe.ResourceLoadingSlotEntry;

import com.google.inject.Injector;

public class WorkflowExecutor {
	static final String specExtension = "spec";
	
	private IWorkflowContext ctx;
	private StandaloneSetup setup;
	
	// slots
	String dslSlot = "DSLSlot";
	String specSlot = "specModelSlot";
	String circuitSlot = "circuitModelSlot";
	String blockSlot = "blockModelSlot";	
	String hwSlot = "hardwareModelSlot";
	
	String gwSlot = "gatewayModelSlot";
	
	String umlSlot = "umlModelSlot";
	
	String resourceSlot = "resourceSlot";
	
	public WorkflowExecutor() {
		ctx = new WorkflowContextImpl();
		setup = new StandaloneSetup();
	}
	
	public void runMergeWF(String modelPath, String circuitPath, String blockPath, String output){
		
		setup.addRegisterGeneratedEPackage("MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage");
		setup.addRegisterGeneratedEPackage("blockdiagram.BlockdiagramPackage");
		
		org.eclipse.xtext.mwe.Reader specReader = new org.eclipse.xtext.mwe.Reader();
		specReader.addPath(modelPath);
		NameBasedFilter filter = new NameBasedFilter();
		filter.setExtension(specExtension);
		specReader.setUriFilter(filter);
		specReader.addRegister(new SpecDslStandaloneSetup());
		ResourceLoadingSlotEntry slot = new ResourceLoadingSlotEntry();
		slot.setSlot(dslSlot);
		specReader.addLoadResource(slot);
		
		DSLTransformer trans = new DSLTransformer();
		trans.setInput(dslSlot);
		trans.setOutput(specSlot);
		trans.setModelSlot(specSlot);
		
		org.eclipse.xtext.mwe.Reader circuitReader = new org.eclipse.xtext.mwe.Reader();
		circuitReader.addPath(modelPath);
		NameBasedFilter circuitfilter = new NameBasedFilter();
		circuitfilter.setRegularExpression(circuitPath);
		circuitReader.setUriFilter(circuitfilter);
		circuitReader.addRegister(new CircuitDslStandaloneSetup());
		ResourceLoadingSlotEntry cSlot = new ResourceLoadingSlotEntry();
		cSlot.setSlot(circuitSlot);
		circuitReader.addLoadResource(cSlot);
		
		Reader blockReader = new Reader();
		blockReader.setUri(blockPath);
		blockReader.setModelSlot(blockSlot);
		
		HardwareModelMerger merger = new HardwareModelMerger();
		merger.setSpec(specSlot);
		merger.setBlock(blockSlot);
		merger.setCircuit(circuitSlot);
		merger.setOutput(hwSlot);
		
		HardwareModelWriter writer = new HardwareModelWriter();
		writer.setModelSlot(hwSlot);
		writer.setUri(output);
		
		// execute
		specReader.invoke(ctx);
		trans.invoke(ctx);
		circuitReader.invoke(ctx);
		blockReader.invoke(ctx);
		merger.invoke(ctx);
		writer.invoke(ctx);
	}
	
	public void runToGatewayWF(String hardwareUri, String gatewayUri){

		setup.addRegisterGeneratedEPackage("MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage");
		
		Reader reader = new Reader();
		reader.setUri(hardwareUri);
		reader.setModelSlot(hwSlot);
		
		HRMtoSRMTransformer transformer = new HRMtoSRMTransformer();
		transformer.setHardwareModel(hwSlot);
		transformer.setGatewayModel(gwSlot);
		
		HardwareModelWriter writer = new HardwareModelWriter();
		writer.setModelSlot(gwSlot);
		writer.setUri(gatewayUri);
		
		reader.invoke(ctx);
		transformer.invoke(ctx);
		writer.invoke(ctx);
	}
	
	public void runToUMLWF(String gatewayUri, String umlUri){
		
		setup.addRegisterGeneratedEPackage("MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage");

		Reader reader = new Reader();
		reader.setUri(gatewayUri);
		reader.setModelSlot(gwSlot);
		
		SRMtoUMLTransformer trans = new SRMtoUMLTransformer();
		trans.setGatewayModel(gwSlot);
		trans.setUmlModel(umlSlot);
		
		HardwareModelWriter writer = new HardwareModelWriter();
		writer.setUri(umlUri);
		writer.setModelSlot(umlSlot);

		reader.invoke(ctx);
		trans.invoke(ctx);
		writer.invoke(ctx);
	}
	
	public void runCodeGenerateWF(String umlUri, String srcDirPath){
		Reader reader = new Reader();
		reader.setUri(umlUri);
		reader.setModelSlot(umlSlot);
		
		ModelToResource trans = new ModelToResource();
		trans.setIn(umlSlot);
		trans.setOut(resourceSlot);
		
		GeneratorComponent generator = new GeneratorComponent();
		generator.addSlot(resourceSlot);
		generator.setRegister(new MergeDslStandaloneSetup());
		Outlet outlet = new Outlet();
		outlet.setPath(srcDirPath);
		generator.addOutlet(outlet);
		
		reader.invoke(ctx);
		trans.invoke(ctx);
		generator.invoke(ctx);

	}
	
	public static void main(String[] args) {
		WorkflowExecutor exe = new WorkflowExecutor();
		exe.testWorkflow();
	}
	
	private void testWorkflow(){
		runMergeWF("model","model/acc_logger.circuit", "model/motionlogger.blockdiagram", "genmodel/hardware.xmi");
		runToGatewayWF("genmodel/hardware.xmi","genmodel/gateway.xmi");
		runToUMLWF("genmodel/gateway.xmi","genmodel/uml.xmi");
		runCodeGenerateWF("genmodel/uml.xmi", "generated-src");
	}
}
