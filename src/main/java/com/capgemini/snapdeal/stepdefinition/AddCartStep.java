package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.AddtoCart;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.Product;
import com.capgemini.snapdeal.pageobject.Search;

import cucumber.api.DataTable;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCartStep extends Base {
	
	WebDriver driver=new ChromeDriver();
	 AddtoCart a;
	 LoginPage l=new LoginPage(driver);
	 Search s=new Search(driver);
	 Product p=new Product(driver);
  @BeforeMethod
	@Given("^open the website link$")
	public void open_the_website_link() throws InterruptedException {
		driver.manage().window().maximize();
	    driver.get("http://www.snapdeal.com");
	    l.getSingin(driver);
		l.getLogin();
	}
	@Test
	@When("^User Enters Valid Login credentials$")
	public void user_enters_credentials(DataTable arg1) throws Throwable {
		List<List<String>> ele = arg1.raw();
		l.getUser(driver);
	     l.getName().sendKeys(ele.get(0).get(0));
	     l.clickContinue();
	     l.getPassword();
		l.getPwd().sendKeys(ele.get(0).get(1));
		l.getSubmit();
	
	}
	@Test
	@Then("^user is on the Home page$")
	public void user_is_on_the_Home_page() throws Throwable {
		l.getWindoe(driver);
	     l.getSleep();

	}
  @Test
  @Then("^Search for a Product \"([^\"]*)\"$")
  public void search_for_a_Product(String search) throws Throwable {
		s=new Search(driver);
		s.getsearch1();
		s.getSearch().sendKeys(search); 
	}
	 @Test(dependsOnMethods="search_for_a_Product(String search)")
	@Then("^user select the facemask$")
	public void user_select_the_facemask() throws Throwable {
		  s.onClick();
	}
	 
	 @Test(dependsOnMethods="user_select_the_facemask()")
	 @Then("^Select the product facemask$")
	 public void select_the_product_facemask() throws Throwable {
		p=new Product(driver);
		p.getmask();	 
		Thread.sleep(1000);
	}
	 @Test
	 @Then("^Add the product to the Cart$")
	 public void add_the_product_to_the_Cart() throws Throwable {
			a=new  AddtoCart(driver);
			Thread.sleep(1000);
			a.getAddtoCart(driver);
	}
  @AfterMethod
	@Then("^close browser page$")
	public void close_browser_page() throws Throwable {
	    driver.quit();
	}
}
