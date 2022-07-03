package com.qa.validating.page.title;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageTitle {

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

		// Validating g the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "NxtGen A.I Academy – Learn With Clarity";

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("Both the actual and expected title same");
			System.out.println("The title of the page is " + expectedTitle);

		} else {
			System.out.println("Both the actual and expected title are not same");
			System.out.println("The title of the page is " + actualTitle);
			System.out.println("Expected Title is :" + expectedTitle);

		}

	}
}
