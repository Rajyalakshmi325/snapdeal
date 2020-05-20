package com.capgemini.snapdeal.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.snapdeal.Base.Base;

public class SecurePaymentPage {

	@FindBy(xpath="(//div[@class=\"col-xs-6 individualTupple\"])[1]")
	private WebElement payment;
	
	//(//div[@class=\"col-xs-6 individualTupple\"])[1]")
	
	public SecurePaymentPage(WebDriver driver1) {
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver1, this);
		JavascriptExecutor j=(JavascriptExecutor) driver1;
		j.executeScript("window.scrollBy(0,900)");
		String s2= driver1.getWindowHandle();
		driver1.switchTo().window(s2);
	
	}
	
	public void securepayement() throws InterruptedException {
		Thread.sleep(1000);
		payment.click();	
	}	
	}