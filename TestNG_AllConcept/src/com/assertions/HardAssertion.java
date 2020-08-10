package com.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void test1(){
		System.out.println("launch browser");
		Assert.assertEquals(true, false);
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("clic on sigin button");
		Assert.assertEquals(true, false);
		
		System.out.println("validate Homepage");
		System.out.println("gp to contact page");
		System.out.println("create a contact");
		
	}

}
