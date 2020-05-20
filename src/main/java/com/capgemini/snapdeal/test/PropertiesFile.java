package com.capgemini.snapdeal.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.snapdeal.pageobject.LoginPage;

public class PropertiesFile {
	public static Properties p;
	public static WebDriver driver;

	public PropertiesFile() {
		try {
			p = new Properties();
			FileInputStream f = new FileInputStream(
					"E:\\Project\\snapdealproject\\src\\main\\resources\\properties\\testdata.properties");
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public static void setUp() {
		driver.get(p.getProperty("url"));
	}


	public static void closebrowser() {
		driver.close();
	}
}
