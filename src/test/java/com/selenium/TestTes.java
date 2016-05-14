package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTes {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		driver = new FirefoxDriver();
			
	}
	@Test
	public void demoTest() throws InterruptedException{
		driver.get("http://www.way2automation.com/demo.html");
		
       System.out.println("title is- "+ driver.getTitle()); 
       Thread.sleep(5000L);
	}

	
	@AfterTest
	public void quit(){
		driver.quit();
	}
}
