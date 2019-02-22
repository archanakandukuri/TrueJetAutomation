package com.gluecode;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.stepdefinition.LoginPage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features/",
				glue = {"com.stepdefinition/"}
				)

public class TestRunner{
	
}
