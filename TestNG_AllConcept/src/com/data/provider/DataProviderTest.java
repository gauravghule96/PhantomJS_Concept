package com.data.provider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


import java.lang.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.TestUtil;

public class DataProviderTest {
	

	  WebDriver driver;

	@BeforeMethod
	public void SetUp(){
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		driver=new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///E:/JBK/Selenium/Offline%20Website/pages/examples/register.html");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestdata(){
		ArrayList<Object[]> testdata=TestUtil.getDataFromExcel();
		return testdata.iterator();
	}
		
		
	
	@Test(dataProvider="getTestdata")
	public void f(String firstname,String mobilenumber,String emailID,String password){
		
		driver.findElement(By.xpath("//input[@name='name']")).clear();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@name='mobile']")).clear();
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(mobilenumber);

		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailID);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}
	
	
	@AfterMethod
	public void tearDown(){
	 driver.quit();
	}
	
	
		
  /*  return new Object[][]{{"Gaurav.G","Gaurav@gmail.com","123456"},
	 	{"Ram.L","Ram@gmail.com","6789098"},{"Lakhan.L","lakan@gmail.com","84176128"},
	 	{"Ganesh.W","Ganesh@gmail.com","4288682"},
	 	{"Vaibhav.G","Vaibhav@gmail.com","4982748"}};*/
	 
	

}
