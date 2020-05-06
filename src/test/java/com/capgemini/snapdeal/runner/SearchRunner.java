package com.capgemini.snapdeal.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/java/Feature/Search.feature", glue = {
		"com.capgemini.snapdeal.stepdefinition" }, format = { "pretty",
				"html:test-output", }, monochrome = true, dryRun = false, strict = true, tags = {})
public class SearchRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		// this returns object of the same class
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeatures) {
		testNGCucumberRunner.runCucumber(cucumberFeatures.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
		// these data provider is not for test data these is for only to fetch the
		// feature files
	}

	@AfterClass(alwaysRun = true)
	public void testDownclass() {
		testNGCucumberRunner.finish();
	}
}
