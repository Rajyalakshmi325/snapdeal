package com.capgemini.snapdeal.stepdefinition;

import com.capgemini.snapdeal.pageobject.AddtoCart;
import com.capgemini.snapdeal.pageobject.CategoriesPage;
import com.capgemini.snapdeal.pageobject.HomePage;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.test.PropertiesFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PropertyStepDef extends PropertiesFile{

	HomePage hp;
	CategoriesPage cp;
	 AddtoCart ac;
	 LoginPage lp;
	@Given("^open the website PAGE and enter the url$")
	public void open_the_website_PAGE_and_enter_the_url() throws Throwable {
		openbrowser();
		setUp();
	}

	@When("^User enters the VAILD DETAILS$")
	public void user_enters_the_VAILD_DETAILS() {
		lp=new LoginPage(driver);
		try {
			lp.getSingin(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.getLogin();
		lp.getUser(driver);
		lp.getName().sendKeys(p.getProperty("username"));
		lp.clickContinue();
		lp.getPassword();
		lp.getPwd().sendKeys(p.getProperty("password"));
		lp.getSubmit();
	}

	@Then("^user name on the HOME page$")
	public void user_name_on_the_HOME_page() throws Throwable {
		lp.getWindoe(driver);
		lp.getSleep();
	}

	@Then("^move to the CATEGORIES$")
	public void move_to_the_CATEGORIES() throws Throwable {
		hp=new HomePage(driver);
		hp.getLaptop(driver);
		hp.getlaptop();
	}

	@Then("^user select The PRODUCT$")
	public void user_select_The_PRODUCT() throws Throwable {
		cp = new CategoriesPage(driver);
		cp.itemSelect();
	}

	@Then("^user clicks On PRODUCT$")
	public void user_clicks_On_PRODUCT() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^user wants to add the PRODUCT to cart$")
	public void user_wants_to_add_the_PRODUCT_to_cart() throws Throwable {
		ac=new  AddtoCart(driver);
		ac.getAddtoCart(driver);
	}

	@Then("^close The BROWSER$")
	public void close_The_BROWSER()  {
		closebrowser();
	}
}
