package com.swn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.qa.pages.LogoutPage;
import com.swn.qa.base.TestBase;
import com.swn.qa.util.Extent_reporter;

public class MyProfile extends TestBase {
	
	@FindBy(xpath="//div[@id='SideMenuWebListbar_0_Item_0']")
	WebElement MyProfile;
	
	@FindBy(xpath="//body[@id='ctl00_ctl00_MasterPage']/form[@id='aspnetForm']/table/tbody/tr/td/table/tbody/tr/td/div[@id='ctl00_ctl00_pnlMain']/div[@id='ctl00_ctl00_Main_upPage']/table/tbody/tr/td/table[1]")
	WebElement MyProfileLogo;
	
	@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfilestd0']")
	WebElement GeneralProfileSettings;
	
	@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfilestd1']")
	WebElement DispatchSettings;
	
	@FindBy(xpath="//td[@id='ctl00_ctl00_Main_iuwtUserProfilestd2']")
	WebElement DisplaySettings;
	
	@FindBy(xpath="//img[@id='ctl00_ctl00_imgLogout']")
	WebElement Logout;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_Main_Login_Login1_UserName']")
	WebElement Username;
	
	Extent_reporter objEx;
	
	public MyProfile(){
		super();
		PageFactory.initElements(driver, this);
		objEx = new Extent_reporter();
		
	}
	public void clickmyprofile() throws Throwable
	{
		MyProfile.click();
		objEx.Menuvalidation("My Profile Page ", MyProfileLogo);
		
	}
	
	public void clickOnLogoutLink() throws Throwable{
		Logout.click();
		objEx.Menuvalidation("Loggoff Validation ", Username);
		//return new LoginPage();
	}

}
