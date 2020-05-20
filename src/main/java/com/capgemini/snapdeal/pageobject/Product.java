package com.capgemini.snapdeal.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.snapdeal.Base.Base;

public class Product {
	
	@FindBy(xpath = "//img[@class='product-image ']")
	private WebElement facemask;

		// initializing page objects
		public Product(WebDriver driver) {
			PageFactory.initElements(driver, this);
			String s1 = driver.getWindowHandle();
			driver.switchTo().window(s1);
		}
		public void getmask() {
			facemask.click();
		}
	}

