package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.HomePage;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.AddtoCart;
import com.capgemini.snapdeal.pageobject.CategoriesPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoriesStepDef extends Base {

	WebDriver driver = new ChromeDriver();
	HomePage hp;
	CategoriesPage cp;
	 AddtoCart ac=new  AddtoCart(driver);
	LoginPage lp=new LoginPage(driver);

	@BeforeMethod
	@Given("^open the website Page and enter the url$")
	public void open_the_website_Page_and_enter_the_url() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com");
		  lp.getSingin(driver);
		    lp.getLogin();
	}
	@Test(priority=0)
	@When("^User enters the Credentials$")
	public void user_enters_the_Credentials(DataTable arg1) throws Throwable {
		List<List<String>> ele = arg1.raw();
		lp.getUser(driver);
	    lp.getName().sendKeys(ele.get(0).get(0));
	    lp.clickContinue();
	    lp.getPassword();
		lp.getPwd().sendKeys(ele.get(0).get(1));
		lp.getSubmit();  
	
	}
	@Test(priority=1)
	@Then("^user name on the Home page$")
	public void user_name_on_the_Home_page() throws InterruptedException  {
		lp.getWindoe(driver);
		lp.getSleep();
	
	}
	
	@Test(priority=2)
	@And("^move to the categories$")
	public void move_to_the_categories() throws Throwable {
		hp=new HomePage(driver);
		hp.getLaptop(driver);
		hp.getlaptop();
	}

//	@Test
//	@Then("^it naviagtes to particular page$")
//	public void it_naviagtes_to_particular_page() throws Throwable {
//		cp = new CategoriesPage(driver);
//		cp.checkBoxSelect();
//	}

	@Test
	@Then("^user select The Product$")
	public void user_select_the_Product() throws Throwable {
		cp = new CategoriesPage(driver);
		cp.checkBoxSelect();
		cp.itemSelect();
		cp.gettouch();
		

	}
	@Test(dependsOnMethods="user_select_the_Product()")
	@Then("^user clicks On Product$")
	public void user_clicks_On_Product() throws Throwable {
		Thread.sleep(1000);
	}
	@Test
	@Then("^user wants to add the product to cart$")
	public void user_wants_to_add_the_product_to_cart() throws Throwable {
		ac=new  AddtoCart(driver);
		ac.getAddtoCart(driver);
	}
	
    @AfterMethod
	@And("^Close The Browser$")
	public void close_The_Browser() throws Throwable {
		driver.quit();
	}

}
