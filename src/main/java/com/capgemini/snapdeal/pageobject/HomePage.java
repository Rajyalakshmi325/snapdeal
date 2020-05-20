package com.capgemini.snapdeal.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//span[text()=\"Computers & Gaming\"]")
	WebElement laptop;

	
	
	//@FindBy(xpath = "//span[text()=\"Cooling Pads\"]")
	@FindBy(xpath = "//span[contains(text(),\"Core i5/i7 Laptops\")]")
	WebElement core;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getLaptop(WebDriver driver1) throws InterruptedException {
		PageFactory.initElements(driver1, this);
		Actions action = new Actions(driver1);
		Thread.sleep(1000);
		action.moveToElement(laptop).perform();
		laptop.click();

	}

	public void getlaptop() {
		core.click();
	}
}
