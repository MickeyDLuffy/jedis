package com.mallon.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testHello() {
		ExampleRESTEndpoint exampleRESTEndpoint = new ExampleRESTEndpoint();
		exampleRESTEndpoint.sayHello();
		exampleRESTEndpoint.sayHello();
		Assertions.assertEquals(exampleRESTEndpoint.sayHello(), "This ----is a hello from mickey! Heroku automatic build done" );
	}
}
