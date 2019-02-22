package com.stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefLogin {

	WebDriver driver;
	LoginPage loginPage;
	GroupBooking grbook;

	public StepDefLogin() {
	}

	@Given("^url \"([^\"]*)\" and browser \"([^\"]*)\" details$")
	public void url_and_browser_details(String Url1, String Browser1) throws Throwable {

		if (Browser1.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\softwares\\Selenium_Practise\\Lib\\Drivers\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (Browser1.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\softwares\\Selenium_Practise\\Lib\\Drivers\\selenium\\IEdriver.exe");
			driver = new InternetExplorerDriver();
		}
		loginPage = new LoginPage(driver);
		driver.get(Url1);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_has_valid_and_credentials(String emailAddress1, String passWord1) throws Throwable {
		loginPage = new LoginPage(driver);

		loginPage.mainLoginButton.click();
		loginPage.customerLogin.click();
		Thread.sleep(2000);

		loginPage.emailAddress.sendKeys(emailAddress1);
		loginPage.passWord.sendKeys(passWord1);
		loginPage.loginButton.click();
		Thread.sleep(1000);

	/*
	 * loginPage.TruFliersLogin.click(); Thread.sleep(3000);
	 * loginPage.Username.sendKeys(Username1);
	 * loginPage.Password.sendKeys(Password1); loginPage.LoginButton.click();
	 * Thread.sleep(1000);
	 */

	}

	@Then("^User should successfully logged in$")
	public void user_should_successfully_logged_in() throws Throwable {
		loginPage = new LoginPage(driver);
		String Expected = "Login Successfull!";
		Thread.sleep(5000);
		
		Assert.assertEquals(Expected,loginPage.successMessage.getText());
		System.out.println("Successfully Logged in");
		driver.close();
	}
	
	@Then("^Error message has to show$")
	public void Error_message_has_to_show() throws Exception
	{
		loginPage = new LoginPage(driver);
		String Expected="Invalid Email id.";
		Thread.sleep(1000);
		Assert.assertEquals(Expected,loginPage.ErrorMessage.getText());
		driver.close();
	}
			

}
