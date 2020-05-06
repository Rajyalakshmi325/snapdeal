package com.capgemini.snapdeal.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/java/Feature/SecurePayment.feature", glue = {
		"com.capgemini.snapdeal.stepdefinition" }, format = { "pretty",
				"html:test-output", }, monochrome = true, dryRun = false, strict = true, tags = {})
public class SecurePaymentRunner extends AbstractTestNGCucumberTests {

	
}


