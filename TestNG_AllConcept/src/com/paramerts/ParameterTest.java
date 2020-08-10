package com.paramerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	@Test
	@Parameters({"env","browser","url","emailID","pass"})
	public void logintest(String env,String browser,String url,String emailID,String pass){
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailID);

		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
	}

}
