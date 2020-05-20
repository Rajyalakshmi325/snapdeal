package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.AddtoCart;
import com.capgemini.snapdeal.pageobject.BuyNow;
import com.capgemini.snapdeal.pageobject.CategoriesPage;
import com.capgemini.snapdeal.pageobject.HomePage;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.Product;
import com.capgemini.snapdeal.pageobject.RemoveCartProduct;
import com.capgemini.snapdeal.pageobject.Search;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioStepDef extends Base {
	WebDriver driver = new ChromeDriver();
	BuyNow ac;
	LoginPage l = new LoginPage(driver);
	Search 	s=new Search(driver);
	Product p;

	@Given("^User OPEN Browser$")
	public void user_OPEN_Browser() throws Throwable {
		driver.manage().window().maximize();
	}

	@When("^User enters the URL$")
	public void user_enters_the_URL() throws Throwable {
		driver.get("http://www.snapdeal.com");
	}

	@Then("^User mouse hover ACCOUNT$")
	public void user_mouse_hover_ACCOUNT() throws Throwable {
		l.getSingin(driver);
	}

	@When("^the User clicks on SIGNIN$")
	public void the_User_clicks_on_SIGNIN() throws Throwable {
		l.getLogin();
	}

	@Then("^Enter  \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
		l.getUser(driver);
		l.getName().sendKeys(arg1);
		l.clickContinue();
		l.getPassword();
		l.getPwd().sendKeys(arg2);
	}

	@Then("^Login to APPLICATION$")
	public void login_to_APPLICATION() throws Throwable {
		l.getSubmit();
	}

	@Given("^uSER name can be seen on the page$")
	public void user_name_can_be_seen_on_the_page() throws Throwable {
		l.getWindoe(driver);
      	l.getSleep();
	}

	@When("^uSER  search for \"([^\"]*)\"$")
	public void user_search_for(String search) throws Throwable {
		s.getsearch1();
		s.getSearch().sendKeys(search);
	}

	@Then("^uSER  select the face mask$")
	public void user_select_the_face_mask() throws Throwable {
		  s.onClick();
	}

	@Then("^uSER  clicks on product$")
	public void user_clicks_on_product() throws Throwable {
		p=new Product(driver);
		p.getmask();	
	}

	@Then("^uSER wants to ADD the product to cart$")
	public void user_wants_to_ADD_the_product_to_cart() throws Throwable {
		ac = new BuyNow();
		ac.getBuyNow(driver);
	
	}

	@Then("^cLOSE THe BRowseR$")
	public void close_THe_BRowseR() throws Throwable {
		driver.quit();
	}


}
