package com.assertions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	SoftAssert softassert=new SoftAssert();
	
	@Test
	public void test1(){
		System.out.println("launch browser");
		Assert.assertEquals(true, false);
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("click on sigin button");
		Assert.assertEquals(true, false);
		
		System.out.println("validate Homepage");
		softassert.assertEquals(true, false);
		
		System.out.println("gp to contact page");
		softassert.assertEquals(true, false);
		
		System.out.println("create a contact");
		softassert.assertEquals(true, false);
		
		softassert.assertAll();
		
	}
	
	@Test
	public void test2(){
		System.out.println("logout");
		softassert.assertAll();

	}
	
	@AfterClass
	public void teardown(){
	softassert.assertAll();

	}
	

}
