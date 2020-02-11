package com.swn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swn.qa.base.TestBase;

public class GeneralProfileSettings extends TestBase {
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl0_tbFirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl0_tbLastName']")
	WebElement LastName;
	
	@FindBy(xpath="//textarea[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl0_tbAddress']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl0_tbContactNumber']")
	WebElement ContactNumber;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl0_tbEmail']")
	WebElement Email;

}
