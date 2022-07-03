package com.qa.handle.radiobutton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
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

		// Male radio button
		WebElement maleRadioButton = driver.findElement(By.id("vfb-8-1"));
		// Female radio button
		WebElement femaleRadioButton = driver.findElement(By.id("vfb-8-2"));

		// Male radio button
		if (maleRadioButton.isDisplayed()) {
			System.out.println("Male radio button is displayed");
		} else {
			System.out.println("Male radio button is not displayed");
		}
		if (maleRadioButton.isEnabled()) {
			System.out.println("Male radio button is enable");
		} else {
			System.out.println("Male radio button is not enable");
		}
		if (maleRadioButton.isSelected()) {
			System.out.println("Male radio button is selected");
		} else {
			System.out.println("Male radio button is not selected");
			maleRadioButton.click();
		}

		
		// Female radio button
		if (femaleRadioButton.isDisplayed()) {
			System.out.println("Female radio button is displayed");
		} else {
			System.out.println("Female radio button is not displayed");
		}
		if (femaleRadioButton.isEnabled()) {
			System.out.println("Female radio button is enable");
		} else {
			System.out.println("Female radio button is not enable");
		}
		if (femaleRadioButton.isSelected()) {
			System.out.println("Female radio button is selected");
		} else {
			System.out.println("Female radio button is not selected");
			femaleRadioButton.click();
		}

		//Close the driver
		driver.close();
	}
}
