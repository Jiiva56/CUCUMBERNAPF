package org.napf.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	@Before("@smoke")
	public void be() {
		System.out.println("run beforesmoke tag");
	}
	
	@Before("@sanity")
	public void bef() {
		System.out.println("run beforesanity tag");
	}
	
	@After("@smoke")
	public void af() {
		System.out.println("run after smoke tag");
	}
	
	@After("@sanity")
	public void aft() {
		System.out.println("run after sanity tag");
	}
	
}
