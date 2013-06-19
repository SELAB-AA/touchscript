
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class WebAppDSLStandaloneSetup extends WebAppDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new WebAppDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

