package com.capgemini.snapdeal.pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveCartProduct {
	@FindBy(xpath ="//div[@class=\"cartContainer col-xs-11 reset-padding\"]")
	//div[@class="cartContainer col-xs-11 reset-padding"]

	//@FindBy(xpath ="//div[@class=\"cartInner\"]")
	private WebElement cart;
	

	@FindBy(xpath ="(//span[@class=\"remove-item-shortlist\"])[1]")
	private WebElement removeproduct;
	
	public RemoveCartProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void getcart() {
		cart.click();
	}
	public void getremoveproduct() {
		removeproduct.click();
	}

}

