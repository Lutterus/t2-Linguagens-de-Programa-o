/**
 * generated by Xtext 2.14.0.RC1
 */
package org.example.domainmodel.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.example.domainmodel.DomainmodelRuntimeModule;
import org.example.domainmodel.DomainmodelStandaloneSetup;
import org.example.domainmodel.ide.DomainmodelIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DomainmodelIdeSetup extends DomainmodelStandaloneSetup {
  @Override
  public Injector createInjector() {
    DomainmodelRuntimeModule _domainmodelRuntimeModule = new DomainmodelRuntimeModule();
    DomainmodelIdeModule _domainmodelIdeModule = new DomainmodelIdeModule();
    return Guice.createInjector(Modules2.mixin(_domainmodelRuntimeModule, _domainmodelIdeModule));
  }
}
