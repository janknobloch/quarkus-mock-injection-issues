package org.broken;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MainResource {

	@Inject
	public InjectedResource injectedResource;

	public String callToInjectedBean() {
		return injectedResource.injectedFunction();
	}
}