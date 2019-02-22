package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class GroupBooking {
	WebDriver driver;
	
	public GroupBooking(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "plan")
	public WebElement planLink;
	
	@FindBy(xpath = "//a[text()='Group Booking']")
	public WebElement groupBookinglink;
	
	@FindBy(xpath = "//h2[text()='Group Booking']")
	public WebElement groupBookingVerify;
	
	@FindBy(name = "GBFirstName")
	public WebElement firstName;
	
	@FindBy(name = "GBLastName")
	public WebElement lastName;
	
	@FindBy(name = "GBEmailAddr")
	public WebElement EmailAddr;
	
	@FindBy(name = "GBMobileNo")
	public WebElement MobileNo;
	
	@FindBy(name = "GBCity")
	public WebElement City;
	
	@FindBy(xpath = "//input[@value='One Way']")
	public WebElement oneWay;
	
	@FindBy(xpath = "//input[@value='Round Trip']")
	public WebElement roundTrip;
	
	@FindBy(name = "GBFrom")
	public WebElement from;
	
	@FindBy(name = "GBTo")
	public WebElement to;
	
	@FindBy(name = "travelDate")
	public WebElement departure;
	
	@FindBy(name = "returnDate")
	public WebElement returnJourneyDate;
	
	@FindBy(name = "GBNoOfPassengers")
	public WebElement noOfPassenger;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//div[@class='owl-dt-calendar-control']/button[1]")
	public WebElement leftButton;
	
	@FindBy(xpath = "//div[@class='owl-dt-calendar-control']/button[2]")
	public WebElement rightButton;
	
	@FindBy(xpath = "//div[@class='owl-dt-calendar-control-content']/button/span")
	public WebElement MonthYearSelect;
	
	@FindBy(xpath = "//span[text()='22']")
	public WebElement datepicker;
	
	@FindBy(xpath = "//li[@class='notifier__container-list ng-star-inserted']//p")                                //"//p[text()='Something went wrong!']")
	public WebElement message;
	
	public void groupBooking(String FirstName,String LastName,String emailAddr,String mobileNo,String city,String travelType,String fromCity,String toCity,String departureDate,String returnDate,String noOfPassengers) throws Exception
	{
		planLink.click();
		Thread.sleep(1000);
		groupBookinglink.click();
		Thread.sleep(1000);
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		EmailAddr.sendKeys(emailAddr);
		MobileNo.sendKeys(mobileNo);
		City.sendKeys(city);
		if (travelType.equalsIgnoreCase("One Way")) {
			oneWay.click();
		}
		if (travelType.equalsIgnoreCase("Round Trip")) {
			roundTrip.click();
			returnJourneyDate.sendKeys(returnDate);
		}
		Select fromTrip = new Select(from);
		fromTrip.selectByVisibleText(fromCity);
		Thread.sleep(5000);
		to.click();
		Select toTrip = new Select(to);
		toTrip.selectByVisibleText(toCity);
			
		departure.sendKeys(departureDate);
		noOfPassenger.sendKeys(noOfPassengers);
		Thread.sleep(1000);
		submitButton.click();
		Thread.sleep(1000);
	}
	
	
}

