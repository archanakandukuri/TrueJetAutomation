package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefGroupBooking {
	GroupBooking grbook;
	WebDriver driver;
	@Given("^url \"([^\"]*)\" and browsers \"([^\"]*)\" details$")
	public void url_and_browser_detail(String url, String Browser1) throws Throwable {

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
			driver.get(url);
		driver.manage().window().maximize();
		}
	@When("^user enters \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\".$")
	public void user_Enters(String firstname,String lastname,String email,String phone,String city,String TravelType,String fromCity,String toCity,String depatureDate,String returnDate,String noOfPassengers) throws Exception
	
	{
		
		GroupBooking grbook=new GroupBooking(driver);
		grbook.groupBooking(firstname,lastname,email,phone,city,TravelType,fromCity,toCity,depatureDate,returnDate,noOfPassengers);
		
	}
	@Then ("^User is able to do group booking$")
	public void User_is_able_to_do_group_booking()
	{
		System.out.println("Successfully booked");
		driver.close();
	}
	

}
