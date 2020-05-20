package com.capgemini.snapdeal.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToPayment {
	
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	private WebElement procedingPaymnt;
	
	public ProceedToPayment(WebDriver driver1){
		PageFactory.initElements(driver1, this); 
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	public void proceedingToPayment(){ 
			procedingPaymnt.click();
	}

}
