package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.AddtoCart;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.Product;
import com.capgemini.snapdeal.pageobject.RemoveCartProduct;
import com.capgemini.snapdeal.pageobject.Search;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveProductStepDef extends Base {

	WebDriver driver = new ChromeDriver();

	LoginPage lp = new LoginPage(driver);
	RemoveCartProduct r = new RemoveCartProduct(driver);

	@Test
	@Given("^Open the browser And Enter the Url$")
	public void open_the_browser_And_Enter_the_Url() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com");
		lp.getSingin(driver);
		lp.getLogin();
	}

	@Test
	@When("^Get the title of the page$")
	public void get_the_title_of_the_page() throws Throwable {
		lp.getWindoe(driver);
		lp.getSleep();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected, "UnexpectedTitle");
	}

	@Test
	@Then("^Enter The User Details$")
	public void enter_The_User_Details(DataTable arg1) throws Throwable {
		List<List<String>> ele = arg1.raw();
		lp.getUser(driver);
		lp.getName().sendKeys(ele.get(0).get(0));
		lp.clickContinue();
		lp.getPassword();
		lp.getPwd().sendKeys(ele.get(0).get(1));
		lp.getSubmit();
		lp.getWindoe(driver);
		lp.getSleep();
	}

	@Test(dependsOnMethods = "enter_The_User_Details(DataTable arg1)")
	@Then("^Remove the product from the Cart$")
	public void remove_the_product_from_the_Cart() throws Throwable {
		r.getcart();
		Thread.sleep(1000);
		r.getremoveproduct();
	}

	@Test
	@Then("^Close Browser Page$")
	public void close_Browser_Page() throws Throwable {
		driver.quit();

	}
}
