package com.in28minutes.oops;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Test {

	@BeforeSuite
	public void beforeSuiteSetup() {
		System.out.println("Before Suite Setup Done");
	}

	@AfterSuite
	public void afterSuiteTearDown() {
		System.out.println("After Suite Setup Done");
	}

	@BeforeTest
	public void beforeTestSetup() {
		System.out.println("Before Test Setup Done");
	}

	@AfterTest
	public void afterTestTearDown() {
		System.out.println("After Test Setup Done");
	}

	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("Before Class Executed");
	}

	@AfterClass
	public void afterClassTearDown() {
		System.out.println("After Class Executed");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("Before Method Executed");
	}

	@AfterMethod
	public void afterMethodTearDown() {
		System.out.println("After Method Executed");
	}

	@Test
	public void test1() {
		System.out.println("Test1 Executed");
	}

	@Test
	public void test2() {
		System.out.println("Test2 Executed");
	}

	@Test
	public void test3() {
		System.out.println("Test3 Executed");

	}

	@Test
	public void test4() {
		System.out.println("Test4 Executed");
	}
}
