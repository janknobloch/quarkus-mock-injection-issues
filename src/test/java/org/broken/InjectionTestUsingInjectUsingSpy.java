package org.broken;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class InjectionTestUsingInjectUsingSpy {

	@Inject
	MainResource mainResource;

	@BeforeAll
	public static void beforeAll() {
		MainResource spy = Mockito.spy(MainResource.class);
		when(spy.callToInjectedBean()).thenCallRealMethod();
		QuarkusMock.installMockForType(spy, MainResource.class);
	}

	@Test
	public void testInjectedService() {

		assertEquals("injected", mainResource.callToInjectedBean());
	}

}