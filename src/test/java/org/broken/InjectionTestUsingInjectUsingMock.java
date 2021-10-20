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
public class InjectionTestUsingInjectUsingMock {

	@Inject
	MainResource mainResource;

	@BeforeAll
	public static void beforeAll() {
		MainResource mock = Mockito.mock(MainResource.class);
		when(mock.callToInjectedBean()).thenCallRealMethod();
		QuarkusMock.installMockForType(mock, MainResource.class);
	}

	@Test
	public void testInjectedService() {

		assertEquals("injected", mainResource.callToInjectedBean());
	}

}