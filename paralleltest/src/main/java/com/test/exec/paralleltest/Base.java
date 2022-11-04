package com.test.exec.paralleltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void setDriver() {
		WebDriver wdriver = WebDriverManager.chromedriver().create();
		wdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wdriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wdriver.manage().window().maximize();
		driver.set(wdriver);
	}
	
	public WebDriver getWebDriver() {
		return driver.get();
	}
	
	
	

}
