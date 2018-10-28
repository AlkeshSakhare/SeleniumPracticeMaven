package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Sikulidemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://youtube.com");
		driver.findElement(By.id("search")).sendKeys("lahu munh lag gaya");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Lahu Munh Lag Gaya | Full Video Song | Goliyon Ki Rasleela Ram-leela']")).click();
		Screen screen = new Screen();

		try {
			Thread.sleep(5000);
			screen.find("MuteBtn.png");
			screen.click();
			Thread.sleep(15000);
			screen.find("unmuteBtn.png");
			screen.click();
			Thread.sleep(15000);
			screen.find("pauseBtn.png");
			Thread.sleep(5000);
			screen.click();
			screen.find("playBtn.png");
			Thread.sleep(5000);
			screen.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
