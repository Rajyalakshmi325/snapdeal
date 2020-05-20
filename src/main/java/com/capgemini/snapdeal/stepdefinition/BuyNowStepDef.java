package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.BuyNow;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.Product;
import com.capgemini.snapdeal.pageobject.Search;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyNowStepDef extends Base {
	WebDriver driver=new ChromeDriver();
	LoginPage ap=new LoginPage(driver);
	Search 	s=new Search(driver);
	Product p;
	BuyNow b;
	@Test
	@Given("^Open the website link$")
	public void open_the_website_link() throws Throwable {
		driver.manage().window().maximize();
	    driver.get("http://www.snapdeal.com");
	   
	}

	@When("^user name can be seen on page title$")
	public void user_name_can_be_seen_on_page_title() throws Throwable {
		 ap.getSingin(driver);
		    ap.getLogin();
	}

	@Then("^Enter the user details\\.$")
	public void enter_the_user_details(DataTable arg1) throws Throwable {
		List<List<String>> ele = arg1.raw();
		ap.getUser(driver);
	    ap.getName().sendKeys(ele.get(0).get(0));
	    ap.clickContinue();
	    ap.getPassword();
		ap.getPwd().sendKeys(ele.get(0).get(1));
		ap.getSubmit();
		ap.getWindoe(driver);
      	ap.getSleep();
	}

	@Then("^User search for \"([^\"]*)\"$")
	public void user_search_for(String search) throws Throwable {
		s.getsearch1();
		s.getSearch().sendKeys(search);
	}

	@Then("^user select the facemasks$")
	public void user_select_the_facemasks() throws Throwable {
	    s.onClick();
	}

	@Then("^user choose Product$")
	public void user_choose_Product() throws Throwable {
		p=new Product(driver);
		p.getmask();	
	}

	@Then("^click on buynow$")
	public void click_on_buynow() throws Throwable {
  b. getBuyNow(driver);
  
	}

	@Then("^close Browser page$")
	public void close_Browser_page() throws Throwable {
		 driver.quit();
	}
}
