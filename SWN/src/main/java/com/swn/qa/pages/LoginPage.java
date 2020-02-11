package com.swn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swn.qa.pages.HomePage;
import com.swn.qa.util.Extent_reporter;
import com.swn.qa.util.Gernric_functions;
import com.swn.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//nobr[contains(text(),'Home')]")
	WebElement SWNHomeLogo;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_Login_Login1_UserName']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_Login_Login1_Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_Login_Login1_LoginButton']")
	WebElement LogIn;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSWNLogo(){
		return SWNHomeLogo.isDisplayed();
	}
	
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String usr, String pwd) throws Throwable 
	{
		log("Logging testing with username - "+usr);
		log("Logging testing with password - "+pwd);
		
		Username.sendKeys(usr);
		Password.sendKeys(pwd);
		Gernric_functions.fScreenReport();
		LogIn.click();
		try {
		if(validateSWNLogo()){

			log("Successful logging with username -  "+usr);
			Reporting("Pass"," Enter Username & Password ", "Entered Username "+usr+" & password "+pwd, "User Should be able to enter Username "+usr+" & password "+pwd);
			
			return new HomePage();

			}
		}
		
		catch(Exception e)
		{
			Reporting("FAIL"," Enter Username & Password ", "Failed with enter Username"+usr+ " & password "+pwd, "User Should be able to login with Username"+usr+" & password"+pwd);
			//return new LoginPage();
			}
		return null;
	
	}
	
}
