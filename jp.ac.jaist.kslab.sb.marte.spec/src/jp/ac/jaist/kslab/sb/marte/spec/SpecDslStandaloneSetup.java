
package jp.ac.jaist.kslab.sb.marte.spec;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpecDslStandaloneSetup extends SpecDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

