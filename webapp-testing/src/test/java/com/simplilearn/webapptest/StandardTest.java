package com.simplilearn.webapptest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StandardTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("--- Before All Test . ---");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("--- After All Test . ---");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("--- Before Each Test . ---");
	}
	
	@AfterEach
	public void cleanUp() {
		System.out.println("--- After Each Test . ---");
	}
	
	@Test
	public void testOne() {
		System.out.println("--- Test one is executed . ---");
	}	
	
	@Test
	public void testTwo() {
		System.out.println("--- Test two is executed . ---");
	}
	
	@Test
	public void testThree() {
		System.out.println("--- Test three is executed . ---");
	}
}
