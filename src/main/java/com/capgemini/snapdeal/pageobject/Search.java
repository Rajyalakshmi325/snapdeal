package com.capgemini.snapdeal.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
//	@FindBy(xpath = "//span[@class='accountUserName col-xs-12 reset-padding']")
//	private WebElement getname;

	@FindBy(name = "keyword")
	private WebElement search;
	
	@FindBy(xpath = "//button[@class='searchformButton col-xs-4 rippleGrey']/span")
	private WebElement onsearch;

	@FindBy(xpath = "(//a[@class='subdiv unStructured searchKeyWord'])[1]")
	private WebElement facemask1;
  
	@FindBy(xpath = "(//img[@class=\"product-image \"])[2]")
    private WebElement facemask;

	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
		String s1 = driver.getWindowHandle();
		driver.switchTo().window(s1);
	}

	public void getsearch1() {
		search.click();
	}

	public WebElement getSearch() {
		return search;
	}

	public void onClick() {
		onsearch.click();
	}

	public void getmask() {
		facemask1.click();
	}
}
