package org.stepdefintion;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@smoke")
	public void beforeTag() {
		System.out.println("BeforTag");

	}
	@Before(order=3)
	public void before1() {
		System.out.println("Before-3");

	}
	
	@Before(order=2)
	public void before2() {
		System.out.println("Before-2");

	}
	
	@Before(order=1)
	public void before3() {
		System.out.println("Before-1");

	}
	@After(order=1)
	public void after1() {
		System.out.println("After-3");

	}
	
	@After(order=2)
	public void after2() {
		System.out.println("After-2");

	}
	
	@After(order=3)
	public void after3() {
		System.out.println("After-1");

	}
	@After("@smoke")
	public void afterTag() {
		System.out.println("AfterTag");

	}
}
