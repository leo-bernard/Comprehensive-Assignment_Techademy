package com.firefox.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripLogoVerification {
	public static void main(String[] args) throws InterruptedException {
		// Set GeckoDriver path
		System.setProperty("webdriver.gecko.driver",
				"//Users/leobernard/eclipse-workspace/Comprehensive_Assignment/Drivers/geckodriver2");

		// Create FirefoxOptions to configure the browser
		FirefoxOptions options = new FirefoxOptions();
		// options.setHeadless(true); // If you want to run in headless mode

		// Create FirefoxDriver
		WebDriver driver = new FirefoxDriver(options);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Open the MakeMyTrip website
		driver.get("https://www.makemytrip.com/");

		// Check if the logo is present
		// WebElement logoElement = driver.findElement(By.cssSelector(".chHeaderLogo"));
		// WebElement logoElement = driver.findElement(By.className("chMmtLogo"));
		WebElement logoElement = driver.findElement(By.xpath("//*[@data-cy=\"mmtLogo\"]"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-cy=\"mmtLogo\"]")));
		if (logoElement.isDisplayed()) {
			System.out.println("MakeMyTrip logo is present on the page");
		} else {
			System.out.println("MakeMyTrip logo is not present on the page");
		}

		// Quit the browser
		driver.quit();
	}
}