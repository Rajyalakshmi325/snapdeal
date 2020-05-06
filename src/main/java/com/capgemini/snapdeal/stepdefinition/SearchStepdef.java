package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.Product;
import com.capgemini.snapdeal.pageobject.Search;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepdef extends Base {

	WebDriver driver=new ChromeDriver();
	LoginPage a=new LoginPage(driver);
	Search s;
	Product p;
	
	@Given("^User enters website link$")
	public void user_enters_web_site_link() throws Throwable {
		driver.manage().window().maximize();
	    driver.get("http://www.snapdeal.com");
	    a.getSingin(driver);
	    a.getLogin();
	}

	@When("^User enters credentials$")
	public void user_enters_credentials(DataTable credentials) throws Throwable {
		List<List<String>> ele = credentials.raw();
		a.getUser(driver);
	     a.getUserName().sendKeys(ele.get(0).get(0));
	     a.clickContin();
	     a.getPass();
		a.getPwd().sendKeys(ele.get(0).get(1));
		a.getSubmit();
	    
	}

	@Then("^user name can be seen on the page$")
	public void user_name_can_be_seen_on_the_page() throws Throwable {
		a.getWindoe(driver);
		a.getName1();	   
	}

	@Then("^user search for \"([^\"]*)\"$")
	public void user_searches_for(String search) throws Throwable {
		s=new Search(driver);
		s.getsearch();
		s.getSearch().sendKeys(search);   
	}

	@Then("^user select the face mask$")
	public void user_select_the_face_mask() throws Throwable{
	    s.onClick();
	}

	@Then("^user clicks on product$")
	public void user_clicks_on_product() throws Throwable {
		p=new Product(driver);
		p.getmask();	    
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}
}
