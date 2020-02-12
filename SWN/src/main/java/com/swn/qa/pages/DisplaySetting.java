package com.swn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swn.qa.base.TestBase;
import com.swn.qa.util.Extent_reporter;

public class DisplaySetting extends TestBase {

Extent_reporter objEx;
@FindBy(xpath="//table[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettings_tbl']")
WebElement DisplayTabs;

//Xpath for Available Tab
@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettingstd1']")
WebElement AvialbleTab;

//Xpath for Assigned Tab
@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettingstd2']")
WebElement AssignedTab;

//Xpath for Historical Tab
@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettingstd3']")
WebElement HistoricalTab;

//Xpath for Invoice Tab
@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettingstd4']")
WebElement InvoiceTab;

//Xpath for Load Tab
@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettingstd5']")
WebElement LoadTab;

//Xpath for Lane Tab
@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfiles__ctl2_Tab3_iuwtLoadDisplaySettingstd6']")
WebElement LaneTab;
	

	public DisplaySetting(){
		PageFactory.initElements(driver, this);
		objEx = new Extent_reporter();
	}
	
	public void DisplFunction(String Displaytab) throws Throwable{
		objEx.Menuvalidation("Display Setting  ", DisplayTabs);
		
		//Clicking on Tab
				if(Displaytab.equalsIgnoreCase("Available")){
					AvialbleTab.click();
				}
				
				else if(Displaytab.equalsIgnoreCase("Assigned")){
					AssignedTab.click();
				}
				else if(Displaytab.equalsIgnoreCase("Historical")){
					HistoricalTab.click();
				}
				else if(Displaytab.equalsIgnoreCase("Invoice")){
					InvoiceTab.click();
				}
				
				else if(Displaytab.equalsIgnoreCase("Load")){
					LoadTab.click();
				}
				else if(Displaytab.equalsIgnoreCase("Lane")){
					LaneTab.click();
				}
	}
}
