package com.capgemini.snapdeal.stepdefinition;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.SecurePaymentPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurePaymentStepDef  extends Base{
	WebDriver driver=new ChromeDriver();
	LoginPage a=new LoginPage(driver);
	
	SecurePaymentPage s;
	@Test
	@Given("^open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url() throws InterruptedException  {
		driver.manage().window().maximize();
	    driver.get("http://www.snapdeal.com");
	    a.getSingin(driver);
	    a.getLogin();  
	}
@Test
@When("^User enters valid login credentials$")
public void user_enters_valid_login_credentials(DataTable arg1) throws Throwable {
		List<List<String>> ele =arg1.raw();
		a.getUser(driver);
	     a.getName().sendKeys(ele.get(0).get(0));
	     a.clickContinue();
	     a.getPassword();
		a.getPwd().sendKeys(ele.get(0).get(1));
		a.getSubmit();
	}
	@Test
	@Then("^user name is the page$")
	public void user_name_is_the_page() throws InterruptedException {
		a.getWindoe(driver);
		a.getSleep();
	}
	@Test
	@Then("^Click on the Snapdeal SecurePayment$")
	public void click_on_the_Snapdeal_SecurePayment() throws InterruptedException {
		Thread.sleep(1000);
		s=new SecurePaymentPage(driver);
	   s.securepayement();
	}
	@Test
	@Then("^close the web browser$")
    public void close_the_web_browser() throws Throwable {
	    driver.quit();
	}

}
