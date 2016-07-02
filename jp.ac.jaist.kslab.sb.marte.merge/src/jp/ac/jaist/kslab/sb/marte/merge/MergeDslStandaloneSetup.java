
package jp.ac.jaist.kslab.sb.marte.merge;

import jp.ac.jaist.kslab.sb.marte.merge.generator.UMLtoCodeGenerator;
import jp.ac.jaist.kslab.sb.marte.spec.SpecDslRuntimeModule;

import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MergeDslStandaloneSetup extends MergeDslStandaloneSetupGenerated{

	public static void doSetup() {
		new MergeDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new SpecDslRuntimeModule(){
			@Override
			public Class<? extends IGenerator> bindIGenerator() {
				return UMLtoCodeGenerator.class;
			}
		});
	}
}

