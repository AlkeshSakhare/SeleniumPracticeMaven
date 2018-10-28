package com.qa;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDMTestDemo {
	static WebDriver driver;

	public static void main(String[] args) {
		// Run in Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Run in Firefox browser
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		// Run in IE browser
		// WebDriverManager.iedriver().setup();
		// driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://github.com/");

	}
}
