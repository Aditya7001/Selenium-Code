package com.qa.handle.text.box;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	static WebDriver driver;

	public static void main(String[] args) {

		// 1. Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		// 2. Creating instance of chrome driver
		driver = new ChromeDriver();

		// 3. Maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		// Launch the application
		driver.get("https://nxtgenaiacademy.com/");

		// Click on Qa Automation link
		driver.findElement(By.xpath("//*[@id=\'menu-item-4131\']/a/span")).click();

		// Click on practice automation link
		driver.findElement(By.xpath("//*[@id='menu-item-4157']/a"));

		// Open Register For Demo link
		driver.findElement(By.xpath("//*[@id=\'menu-item-4134\']/a/span"));

		// Valaditing Register For Demo link is opened or not
		WebElement registerHeader = driver.findElement(By.xpath("//*[contains(text(),'Register For Demo')]"));

		if (registerHeader.isDisplayed()) {

			System.out.println("Successfully Enter into Register For Demo page ");
		} else {
			System.out.println("Still on Home page");
		}

		// First name
		WebElement firstNameElement = driver.findElement(By.id("vfb-5"));

		// Verify The first name is displayed or not

		if (firstNameElement.isDisplayed()) {

			System.out.println("First Name is displayed");

		} else {
			System.out.println("First Name is not displayed");

		}
		// Verify The first name is enable or not

		if (firstNameElement.isEnabled()) {

			System.out.println("First Name is enable");
			
			firstNameElement.sendKeys("Tom");

		} else {
			System.out.println("First Name is not enable");

		}
		
	     driver.close();
		
		

	}

}
