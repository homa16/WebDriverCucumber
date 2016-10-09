package com.RahulShetty.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenChromeTest {
WebDriver driver;
	
	
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/homayoun/Documents/All Jars/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void firefoxTest(){
		driver.get("http://amazon.com");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
