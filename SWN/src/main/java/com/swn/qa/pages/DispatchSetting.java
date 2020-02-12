package com.swn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swn.qa.base.TestBase;
import com.swn.qa.util.Extent_reporter;

public class DispatchSetting extends TestBase{
	Extent_reporter objEx;
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl1_Tab2_btnSetDefaultCarrier']")
	WebElement DistpatchBtn;
	
	public DispatchSetting(){
		PageFactory.initElements(driver, this);
		objEx = new Extent_reporter();
	}
	
	
	public void DispaFunction() throws Throwable{
		objEx.Menuvalidation("Dispatch Setting  ", DistpatchBtn);
	}
}
