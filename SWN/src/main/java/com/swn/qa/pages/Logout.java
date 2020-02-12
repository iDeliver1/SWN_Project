package com.swn.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.swn.qa.base.TestBase;

public class Logout extends TestBase {

	@FindBy(xpath="//img[@id='ctl00_ctl00_imgLogout']")
	WebElement Logout;

	
//driver.close();
	
}

	