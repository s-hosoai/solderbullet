package jp.ac.jaist.kslab.sb.marte.merge.generator;

import java.util.HashMap;

import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe2.language.Mwe2RuntimeModule;
import org.eclipse.emf.mwe2.language.parser.antlr.Mwe2Parser;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.emf.mwe2.runtime.workflow.Workflow;

public class WorkflowExecutor {
	
	
	void exec(){
		Mwe2Launcher launcher = new Mwe2Launcher();
		launcher.main(new String[]{"src/jp/ac/jaist/kslab/sb/marte/merge/generator/MergeDslGeneratorMWE.mwe2"});
	
	}
	
	public static void main(String[] args) {
		new WorkflowExecutor().exec();
	}
}
