package com.chrome.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTripFlightBookingTestNG {
	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Set ChromeDriver path (Update with your ChromeDriver path)
		System.setProperty("webdriver.chrome.driver",
				"//Users/leobernard/eclipse-workspace/Comprehensive_Assignment/Drivers/chromedriver");

		// Initialize ChromeDriver
		ChromeOptions options = new ChromeOptions();
		// options.setHeadless(true); // If you want to run in headless mode
		driver = new ChromeDriver(options);
	}

	@AfterMethod
	public void tearDown() {
		// Quit the browser
		driver.quit();
	}

	@Test
	public void testFlightBooking() {
		// Open MakeMyTrip website
		driver.get("https://www.makemytrip.com/");

		// Click on Flights tab
		clickElementByXPath("//li[@data-cy='menu_Flights']");

		// Click on OneWay option
		clickElementByXPath("//li[@data-cy='oneWayTrip']");

		// Enter 'FROM' location
		enterTextByXPath("//input[@id='fromCity']", "New York");

		// Select the first suggestion from the autocomplete dropdown
		clickElementByXPath("//li[@id='react-autowhatever-1-section-0-item-0']");

		// Enter 'TO' location
		enterTextByXPath("//input[@id='toCity']", "Los Angeles");

		// Select the first suggestion from the autocomplete dropdown
		clickElementByXPath("//li[@id='react-autowhatever-1-section-0-item-0']");
	}

	// Generic function to click element by XPath
	private void clickElementByXPath(String xpath) {
		waitForElementVisible(driver, By.xpath(xpath));
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}

	// Generic function to enter text into element by XPath
	private void enterTextByXPath(String xpath, String text) {
		waitForElementVisible(driver, By.xpath(xpath));
		WebElement element = driver.findElement(By.xpath(xpath));
		// element.clear();
		element.sendKeys(text);
	}

	// Generic function to wait for element to be visible
	private static void waitForElementVisible(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
