package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.Product;
import com.capgemini.snapdeal.pageobject.Search;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepdef extends Base {

	WebDriver driver=new ChromeDriver();
	LoginPage ap=new LoginPage(driver);
	Search 	s=new Search(driver);
	Product p;
	@Test
	@Given("^User enters website link$")
	public void user_enters_web_site_link() throws Throwable {
		driver.manage().window().maximize();
	    driver.get("http://www.snapdeal.com");
	    ap.getSingin(driver);
	    ap.getLogin();
	}
     @Test
     @When("^Enter the username and Password$")
     public void enter_the_username_and_Password(DataTable arg1) throws Throwable {
		List<List<String>> ele = arg1.raw();
		ap.getUser(driver);
	    ap.getName().sendKeys(ele.get(0).get(0));
	    ap.clickContinue();
	    ap.getPassword();
		ap.getPwd().sendKeys(ele.get(0).get(1));
		ap.getSubmit();  
	}
    @Test
	@Then("^user name can be seen on the page$")
	public void user_name_can_be_seen_on_the_page() throws Throwable {  
    	ap.getWindoe(driver);
      	ap.getSleep();
	}
    @Test
	@Then("^user search for \"([^\"]*)\"$")
	public void user_searches_for(String search) throws Throwable {
		s.getsearch1();
		s.getSearch().sendKeys(search);
	}
    @Test(dependsOnMethods="user_searches_for(String search)")
	@Then("^user select the face mask$")
	public void user_select_the_face_mask() throws Throwable{
	    s.onClick();
	}
    @Test
	@Then("^user clicks on product$")
	public void user_clicks_on_product() throws Throwable {
		p=new Product(driver);
		p.getmask();	    
	}
	@Test
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}
}
