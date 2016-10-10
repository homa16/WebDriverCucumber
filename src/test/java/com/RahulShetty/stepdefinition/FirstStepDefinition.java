package com.RahulShetty.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FirstStepDefinition {
	WebDriver driver;
	@Given("^I initilize the firefox browser$")
	public void i_initilize_the_firefox_browser() throws Throwable {
	   driver=new FirefoxDriver();
	}

	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() throws Throwable {
	    driver.get("http://google.com");
	}

	@Then("^I validate the title of the page$")
	public void i_validate_the_title_of_the_page() throws Throwable {
	 Assert.assertTrue(driver.getTitle().equals("Google"));
	}

	@Then("^I quit the browser$")
	public void i_quit_the_browser() throws Throwable {
	   driver.quit();
	}


}
