package com.RahulShetty.TestngRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(plugin={"pretty", "html:out.html","json:cucumber-report.json"},glue="com/RahulShetty/stepdefinition/", features="src/test/resources/")
public class TestngRunner extends AbstractTestNGCucumberTests   {
	

}
