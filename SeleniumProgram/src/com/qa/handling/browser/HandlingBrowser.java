package com.qa.handling.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

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

		// Click on Python for data science link
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();

		// Validating g the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Python – NxtGen A.I Academy";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Both the actual and expected title same");
			System.out.println("The title of the page is " + expectedTitle);

		} else {
			System.out.println("Both the actual and expected title are not same");
			System.out.println("The title of the page is " + actualTitle);
			System.out.println("Expected Title is :" + expectedTitle);

		}
		driver.navigate().back();

		// Validating g the title
		String homePageTitle = driver.getTitle();
		String homePagexpectedTitle = "NxtGen A.I Academy – Learn With Clarity";

		if (homePageTitle.equals(homePagexpectedTitle)) {

			System.out.println("Both the actual and expected title same");
			System.out.println("The title of the page is " + expectedTitle);

			// Navigate to data science page
			driver.navigate().to("https://nxtgenaiacademy.com/python/");
           
			//Only for demo purpose
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Both the actual and expected title are not same");
			System.out.println("The title of the page is " + homePageTitle);
			System.out.println("Expected Title is :" + homePagexpectedTitle);

		}

		    // Back to home page
		    driver.navigate().back();
		    driver.quit();

	}
}
