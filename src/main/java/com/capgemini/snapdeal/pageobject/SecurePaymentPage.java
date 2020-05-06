package com.capgemini.snapdeal.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.snapdeal.Base.Base;

public class SecurePaymentPage extends Base {
//	@FindBy(xpath="//p[text()='100% Secure Payments']")
  //   @FindBy(xpath="//i[@class='paymentIcon footerIconsImg']")
//	private WebElement payment1;
	@FindBy(xpath="(//div[@class='sdIconContainer'])[1]")
//	@FindBy(class=paymentIcon footerIconsImg)
	private WebElement payment;
	
	
	public SecurePaymentPage(WebDriver driver1) {
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver1, this);
		JavascriptExecutor j=(JavascriptExecutor) driver1;
		j.executeScript("window.scrollBy(0,900)");
		String s2= driver1.getWindowHandle();
		driver1.switchTo().window(s2);
	
	}
	
	public void securepayement() throws InterruptedException {
		Thread.sleep(20);
		payment.click();	
	}	
	}