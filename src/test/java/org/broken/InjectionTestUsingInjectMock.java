package org.broken;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
public class InjectionTestUsingInjectMock {

	@InjectMock
	MainResource mainResource;

	@BeforeAll
	public static void beforeAll() {

	}

	@Test
	public void testInjectedService() {

		assertEquals("injected", mainResource.callToInjectedBean());
	}

}