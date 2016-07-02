
package jp.ac.jaist.kslab.sb.marte.dsl.circuit;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CircuitDslStandaloneSetup extends CircuitDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CircuitDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

