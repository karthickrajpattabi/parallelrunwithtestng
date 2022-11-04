package com.test.exec.paralleltest;

import static org.testng.Assert.assertTrue;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import listeners.Retry;

public class App extends Base
{
   
   public void setup() {
	   
	   getWebDriver().get("https://www.linkedin.com");
	   
   }
	
	@Test 
	public void test5() {
		setup();
		System.out.println("test5-thread name : "+Thread.currentThread().getId());
		if(getWebDriver().getTitle().equalsIgnoreCase("Sign Up | LinkedIn")) {
			
			   System.out.println("title displayed successfully");
		   }else {
			   System.out.println("title not displayed successfully");
			   assertTrue(false);
		   }
		
		
	}
	
	
	@AfterMethod
   public void quit() {
		if(getWebDriver() != null) {
			getWebDriver().quit();
		}
	   
   }
	
	
	
	
	
	
	
	
	
	
}
