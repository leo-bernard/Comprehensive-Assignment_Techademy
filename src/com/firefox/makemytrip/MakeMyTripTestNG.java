package com.firefox.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTripTestNG {
	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Set GeckoDriver path (Update with your GeckoDriver path)
		System.setProperty("webdriver.gecko.driver",
				"//Users/leobernard/eclipse-workspace/Comprehensive_Assignment/Drivers/geckodriver2");

		// Initialize FirefoxDriver
		FirefoxOptions options = new FirefoxOptions();
		driver = new FirefoxDriver(options);

		WebDriverWait wait = new WebDriverWait(driver, 10);
	}

	@AfterMethod
	public void tearDown() {
		// Quit the browser
		driver.quit();
	}

	@Test
	public void testMakeMyTripLogoPresence() {
		// Open MakeMyTrip website
		driver.get("https://www.makemytrip.com/");

		// Verify the presence of MakeMyTrip logo
		WebElement logoElement = driver.findElement(By.xpath("//*[@data-cy=\"mmtLogo\"]"));
		boolean isLogoPresent = driver.findElement(By.xpath("//*[@data-cy=\"mmtLogo\"]")).isDisplayed();
		Assert.assertTrue(isLogoPresent, "MakeMyTrip logo is not present on the page.");
	}
}
