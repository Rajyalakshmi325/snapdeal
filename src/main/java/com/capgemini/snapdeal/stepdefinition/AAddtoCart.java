package com.capgemini.snapdeal.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capgemini.snapdeal.Base.Base;
import com.capgemini.snapdeal.pageobject.AddtoCart;
import com.capgemini.snapdeal.pageobject.CategoriesPage;
import com.capgemini.snapdeal.pageobject.HomePage;
import com.capgemini.snapdeal.pageobject.LoginPage;
import com.capgemini.snapdeal.pageobject.RemoveCartProduct;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AAddtoCart extends Base {
	WebDriver driver = new ChromeDriver();
	AddtoCart ac;
	LoginPage l = new LoginPage(driver);
	HomePage hp;
	CategoriesPage cp;
	RemoveCartProduct r = new RemoveCartProduct(driver);

	@BeforeMethod
	@Given("^User Opens chrome Browser$")
	public void user_Opens_chrome_Browser() throws Throwable {
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "user_Opens_chrome_Browser()")
	@When("^User enters the url$")
	public void user_enters_the_url() throws Throwable {
		driver.get("http://www.snapdeal.com");
	}

	@Test(priority = 0)
	@Then("^User mouse hover Account$")
	public void user_mouse_hover_Account() throws Throwable {
		l.getSingin(driver);
	}

	@Test(priority = 1)
	@When("^the User clicks on Sigin Button$")
	public void the_User_clicks_on_Sigin_Button() throws Throwable {
		l.getLogin();
	}

	@Test(priority = 2)
	@Then("^Enter the Enter userName and j_password_login_uc$")
	public void enter_the_Enter_userName_and_j_password_login_uc(DataTable arg1) throws Throwable {
		List<List<String>> ele = arg1.raw();
		l.getUser(driver);
		l.getName().sendKeys(ele.get(0).get(0));
		l.clickContinue();
		l.getPassword();
		l.getPwd().sendKeys(ele.get(0).get(1));
	}

	@Test(priority = 3)
	@Then("^Login to application$")
	public void login_to_application() throws Throwable {
		l.getSubmit();
	}

	@Test(priority = 4)
	@Given("^MOve to the categories$")
	public void move_to_the_categories() throws Throwable {
		hp = new HomePage(driver);
		hp.getLaptop(driver);
		hp.getlaptop();
	}

	@Test(dependsOnMethods ="move_to_the_categories()")
	@Then("^user SElect The Product$")
	public void user_SElect_The_Product() throws Throwable {
		cp = new CategoriesPage(driver);
		Thread.sleep(1000);
	}

	@Test(dependsOnMethods ="user_SElect_The_Product()")
	@When("^user CLicks On Product$")
	public void user_CLicks_On_Product() throws Throwable {
		cp = new CategoriesPage(driver);
		cp.itemSelect();
	}

	@Test(dependsOnMethods ="user_CLicks_On_Product()")
	@Then("^user wants to ADD the product to cart$")
	public void user_wants_to_ADD_the_product_to_cart() throws Throwable {
		ac = new AddtoCart(driver);
		ac.getAddtoCart(driver);
	}

	@AfterClass
	@Then("^close THe BRowser$")
	public void close_THe_BRowser() throws Throwable {
		driver.quit();
	}

	@Test
	@Given("^rEMOve the product from the Cart$")
	public void rEMove_the_product_from_the_Cart() throws Throwable {
		Thread.sleep(1000);
		r.getcart();
		r.getremoveproduct();
	}

}
