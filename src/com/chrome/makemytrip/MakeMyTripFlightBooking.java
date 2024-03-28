package com.chrome.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripFlightBooking {
	public static void main(String[] args) {
		// Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"//Users/leobernard/eclipse-workspace/Comprehensive_Assignment/Drivers/chromedriver");

		// Initialize ChromeDriver
		ChromeOptions options = new ChromeOptions();
		// options.setHeadless(true); // If you want to run in headless mode
		WebDriver driver = new ChromeDriver(options);

		// Open MakeMyTrip website
		driver.get("https://www.makemytrip.com/");

		// Click on Flights tab
		clickElementByXPath(driver, "//li[@data-cy='menu_Flights']");

		// Click on OneWay option
		clickElementByXPath(driver, "//li[@data-cy='oneWayTrip']");

		// Enter 'FROM' location
		enterTextByXPath(driver, "//input[@id='fromCity']", "New York");

		// Select the first suggestion from the autocomplete dropdown
		clickElementByXPath(driver, "//li[@id='react-autowhatever-1-section-0-item-0']");

		// Enter 'TO' location
		enterTextByXPath(driver, "//input[@id='toCity']", "Los Angeles");

		// Select the first suggestion from the autocomplete dropdown
		clickElementByXPath(driver, "//li[@id='react-autowhatever-1-section-0-item-0']");

		// Close the browser
		driver.quit();
	}

	// Generic function to click element by XPath
	private static void clickElementByXPath(WebDriver driver, String xpath) {
		waitForElementVisible(driver, By.xpath(xpath));
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}

	// Generic function to enter text into element by XPath
	private static void enterTextByXPath(WebDriver driver, String xpath, String text) {
		waitForElementVisible(driver, By.xpath(xpath));
		WebElement element = driver.findElement(By.xpath(xpath));
		// element.clear();
		element.sendKeys(text);
	}

	// Generic function to wait for element to be visible
	private static void waitForElementVisible(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
