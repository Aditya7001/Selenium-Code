package com.qa.handle.check.box;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

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

		// Selenium Check box
		WebElement seleniumCheckBox = driver.findElement(By.id("vfb-20-0"));

		// UFT Check box
		WebElement uftCheckBox = driver.findElement(By.id("vfb-20-1"));

		// TestNg Check box
		WebElement testNgCheckBox = driver.findElement(By.id("vfb-20-2"));

		// Core Java Check box
		WebElement coreJavaCheckBox = driver.findElement(By.id("vfb-20-3"));

		// Validating selenium check box
		if (seleniumCheckBox.isDisplayed()) {
			System.out.println("Selenium CheckBox is displayed");
		} else {
			System.out.println("Selenium CheckBox is not displayed");
		}
		if (seleniumCheckBox.isEnabled()) {
			System.out.println("Selenium CheckBox is enable");
		} else {
			System.out.println("Selenium CheckBox is not enable");
		}
		if (seleniumCheckBox.isSelected()) {
			System.out.println("Selenium CheckBox is selected");
		} else {
			System.out.println("Selenium CheckBox is not selected");
			seleniumCheckBox.click();
		}

		// Validating UFT check box
		if (uftCheckBox.isDisplayed()) {
			System.out.println("UFT CheckBox is displayed");
		} else {
			System.out.println("UFT CheckBox is not displayed");
		}
		if (uftCheckBox.isEnabled()) {
			System.out.println("UFT CheckBox is enable");
		} else {
			System.out.println("UFT CheckBox is not enable");
		}
		if (uftCheckBox.isSelected()) {
			System.out.println("UFT CheckBox is selected");
		} else {
			System.out.println("UFT CheckBox is not selected");
			uftCheckBox.click();
		}

		// TestNg UFT check box
		if (testNgCheckBox.isDisplayed()) {
			System.out.println("TestNg CheckBox is displayed");
		} else {
			System.out.println("TestNg CheckBox is not displayed");
		}
		if (testNgCheckBox.isEnabled()) {
			System.out.println("TestNg CheckBox is enable");
		} else {
			System.out.println("TestNg CheckBox is not enable");
		}
		if (testNgCheckBox.isSelected()) {
			System.out.println("TestNg CheckBox is selected");
		} else {
			System.out.println("TestNg CheckBox is not selected");
			testNgCheckBox.click();
		}

		// Core Java check box
		if (coreJavaCheckBox.isDisplayed()) {
			System.out.println("Core Java CheckBox is displayed");
		} else {
			System.out.println("Core Java CheckBox is not displayed");
		}
		if (coreJavaCheckBox.isEnabled()) {
			System.out.println("Core Java CheckBox is enable");
		} else {
			System.out.println("Core Java CheckBox is not enable");
		}
		if (coreJavaCheckBox.isSelected()) {
			System.out.println("Core Java CheckBox is selected");
		} else {
			System.out.println("Core Java CheckBox is not selected");
			coreJavaCheckBox.click();
		}
		
		//Close the Driver
		driver.close();
	}

}
