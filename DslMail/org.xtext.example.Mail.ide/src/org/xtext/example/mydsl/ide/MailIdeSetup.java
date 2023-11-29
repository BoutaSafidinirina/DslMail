/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.MailRuntimeModule;
import org.xtext.example.mydsl.MailStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MailIdeSetup extends MailStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MailRuntimeModule(), new MailIdeModule()));
	}
	
}
