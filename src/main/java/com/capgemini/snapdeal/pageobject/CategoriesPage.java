package com.capgemini.snapdeal.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {
	public WebDriver driver;

	@FindBy(xpath ="//label[@for=\"Resolution_s-1920x1080 (Full HD)\"]")
	WebElement checkBox;
	
//	@FindBy(xpath ="//label[@for=\"discount-20%20-%2030\"]")
//	WebElement discountOption;

	
	@FindBy(xpath="//div[@class=\"sort-selected\"]")
	WebElement sortBy;

	@FindBy(xpath = "(//img[@class=\"product-image wooble\"])[1]")
	//@FindBy(xpath = "(//img[@class=\"product-image \"])[1]")
	WebElement selectItem;

	public CategoriesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
//       String s1 = driver.getWindowHandle();
//		driver.switchTo().window(s1);
	}

	public void checkBoxSelect() {
		checkBox.click();
	}

	public void itemSelect() {
		selectItem.click();
	}

}
