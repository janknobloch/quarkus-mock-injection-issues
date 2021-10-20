package org.broken;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InjectedResource {

	public String injectedFunction() {
		return "injected";
	}
}
