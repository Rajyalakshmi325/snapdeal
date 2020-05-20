package com.capgemini.snapdeal.pageobject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {

	@FindBy(xpath = "(//div[@id='add-cart-button-id']/span)[1]")

	private WebElement addtocart;

	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	
	public void getAddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> s = driver.getWindowHandles();
		int count = 0;
		for (String str : s) {
			count++;
			if (count == 2) {
				driver.switchTo().window(str);
			}
		}
		addtocart.click();
	}
}