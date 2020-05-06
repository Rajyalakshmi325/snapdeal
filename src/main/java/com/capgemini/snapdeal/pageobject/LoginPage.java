package com.capgemini.snapdeal.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.snapdeal.Base.Base;

public class LoginPage extends Base{
	@FindBy(xpath="//span[@class='accountUserName col-xs-12 reset-padding']")
	private WebElement signin;
	
	@FindBy(xpath="//span[@class='accountBtn btn rippleWhite']/a")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement username;
	
	@FindBy(id="checkUser")
	private WebElement continu;
	
	@FindBy(id="j_password_login_uc")
	private WebElement pwd;
	
	@FindBy(id="submitLoginUC")
	private WebElement submit;
		
	public LoginPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
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
		username.click();
	}
	
	public WebElement getUserName() {
		return username;
	}
	
	
	public void clickContin() {
		continu.click();
	}
	public void getPass() {
		pwd.click();
	}
	public void getWindoe(WebDriver driver1) {
		
		PageFactory.initElements(driver1, this);
		String s1 = driver1.getWindowHandle();
		driver1.switchTo().window(s1);
		
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	
	public void getSubmit() {
		submit.click();
	}
	public void getName1() throws InterruptedException {
		Thread.sleep(3000);
		
	}
}