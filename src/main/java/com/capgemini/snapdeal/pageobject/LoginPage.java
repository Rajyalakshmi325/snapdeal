package com.capgemini.snapdeal.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capgemini.snapdeal.Base.Base;

public class LoginPage{
	
	WebDriver driver;
	@FindBy(xpath="//span[@class='accountUserName col-xs-12 reset-padding']")
	private WebElement signin;
	
	@FindBy(xpath="//span[@class='accountBtn btn rippleWhite']/a")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement name;
	
	@FindBy(id="checkUser")
	private WebElement continues;
	
	@FindBy(id="j_password_login_uc")
	private WebElement pwd;
	
	@FindBy(id="submitLoginUC")
	private WebElement submit;
		
	public LoginPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void getSingin(WebDriver driver1) throws InterruptedException {
		PageFactory.initElements(driver1, this);
		Actions action=new Actions(driver1);
	    Thread.sleep(1000);
	    action.moveToElement(signin).perform();	
	}
	
	public void getLogin() {
		login.click();
	}
	public void getUser(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.switchTo().frame(0);
		name.click();
	}
	
	public WebElement getName(){
		return name;
	}
	public void clickContinue() {
		continues.click();
	}
	public void getPassword() {
		pwd.click();
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	
	public void getSubmit() {
		submit.click();
	}
	public void getSleep() throws InterruptedException {
		Thread.sleep(3000);	
	}
	public void getWindoe(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		String s1 = driver1.getWindowHandle();
		driver1.switchTo().window(s1);
	}

//	public String getTitle() throws Exception {
//		Thread.sleep(3000);
//		return driver.getTitle();
//	}
}