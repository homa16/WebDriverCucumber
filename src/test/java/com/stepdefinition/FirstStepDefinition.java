package com.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FirstStepDefinition {
	@Given("^I initilize the firefox browser$")
	public void i_initilize_the_firefox_browser() throws Throwable {
	   
	}

	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() throws Throwable {
	    
	}

	@Then("^I validate the title of the page$")
	public void i_validate_the_title_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I quit the browser$")
	public void i_quit_the_browser() throws Throwable {
	   
	}


}
