package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="login")
	public WebElement mainLoginButton;
	
	@FindBy(xpath="//a[text()='Customer Login']")
	public WebElement customerLogin;
	
	@FindBy(id="login_username")
	public WebElement emailAddress;
	
	@FindBy(id="login_password")
	public WebElement  passWord;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(xpath ="//p[text()='Login Successfull!']")
	public WebElement successMessage;
	
	@FindBy(xpath="//p[text()='Invalid Email id.']")
	public WebElement ErrorMessage;
	/*---------------------------------------------------------------------
	@FindBy(how=How.ID,using ="txtUserName")
	public WebElement Username;
	

	@FindBy(id = "txtLPassword")
	public WebElement Password;

	@FindBy(id = "Header1_btnLogin")
	public WebElement LoginButton;

	@FindBy(xpath = "//span[text()='TruFliers, Login']")
	public WebElement TruFliersLogin;

	@FindBy(xpath = "//span[@id='spnLogin']")
	public WebElement TruFliersLogout;

	@FindBy(xpath = "//a[text()='Log Out']")
	public WebElement LogoutButton;
	
	@FindBy(xpath = "//span[starts-with(text(),'Hello')]")
	public WebElement LoginVerify;
		
		*/
	
	
}