package TestSuite;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import resources.BaseE2E;

public class ValidationHomePage extends BaseE2E {
	public static Logger Log = LogManager.getLogger(ValidationHomePage.class.getName());
	public HomePageObjects hp;
	public WebDriver driver;

	@BeforeTest
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigate to homepage");
	}

	@Test()
	public void checkNewletters() {
		hp = new HomePageObjects(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(hp.getNewsletter()));
		Log.info("Popup Newletters is opened");
		Assert.assertTrue(hp.getNewsletter().isDisplayed());
		hp.getbuttonNot().click();
		Log.info("Click on No Thanks button");

	}

	@Test()
	public void validatePhoneNumber() {
		hp = new HomePageObjects(driver);
		Assert.assertTrue(hp.getPhonenNumber().isDisplayed());
		String phoneNumber = hp.getPhonenNumber().getText();
		Assert.assertEquals(phoneNumber, "(+1) 323-744-6780");
		Log.info("Successfully validated Phonenumber");

	}

	@Test()
	public void validateEmail() {
		hp = new HomePageObjects(driver);
		Assert.assertTrue(hp.getEmail().isDisplayed());
		String email = hp.getEmail().getText();
		Assert.assertEquals(email, "info@qaclickacademy.com");
		Log.info("Successfully validated Email address");

	}

	@Test()
	public void validateNavigationBar() {
		hp = new HomePageObjects(driver);
		Assert.assertTrue(hp.getNavigationBar().isDisplayed());
		Log.info("Navigation bar is displyed");
	}
	@Test()
	public void validateFirsttextOfHeder() {
		hp = new HomePageObjects(driver);
		String text = hp.getFirstHeder().getText();
		Assert.assertEquals(text, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		Log.info("First Text of Header is correct");
	}

	@Test()
	public void validateSecondtextOfHeder() {
		hp = new HomePageObjects(driver);
		String text = hp.getSecondHeder().getText();
		Assert.assertEquals(text, "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		Log.info("Second Text of Header is correct");
	}

	@Test()

	public void testAllCourses() throws IOException, InterruptedException {
		hp = new HomePageObjects(driver);
		Assert.assertEquals(hp.getallCourses().size(), 10);
		Log.info("Sum of all courses is corrected");

	}

	@Test()
	public void validateFooter() {

		String text = hp.getfirstTextOfFooter().getText();
		Assert.assertEquals(text, "SELF PACED ONLINE TRAINING");
		Log.info("Text of footer is correct ");

	}

	@AfterTest // Close page

	public void teardown() {
		driver.close();
		driver = null;

	}

}
