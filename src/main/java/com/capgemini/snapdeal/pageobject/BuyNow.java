package com.capgemini.snapdeal.pageobject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNow {

	@FindBy(xpath="//div[@data-state='Buy Now']")
	private WebElement buynow;
	
	public WebDriver driver;
	
	public void getBuyNow(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		String str1=driver1.getWindowHandle();
		System.out.println(str1);

		Set<String> s = driver1.getWindowHandles();
		int count = 0;
		for (String str : s) {
			count++;
			if (count == 2) {
				driver1.switchTo().window(str);
			}
		}
		
	buynow.click();
	}
}