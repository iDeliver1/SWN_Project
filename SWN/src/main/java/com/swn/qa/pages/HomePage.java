package com.swn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swn.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[@id='ctl00_ctl00_Main_Login_lblWelcomeGreeting']")
	WebElement WelcomeHome;

	
	@FindBy(xpath="//div[@id='SideMenuWebListbar_0_Item_0']")
	WebElement MyProfile;
	
	@FindBy(xpath="//div[@id='SideMenuWebListbar_0_Item_1']")
	WebElement ReadNews;
	
	@FindBy(xpath="//div[@id='SideMenuWebListbar_0_Item_2']']")
	WebElement ViewTermsCondition;
	
	@FindBy(xpath="//div[@id='SideMenuWebListbar_0_Item_3']")
	WebElement TakeSurvey;
	

	//Initializing the Page Objects:
	
	public HomePage() 
	{
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	//Actions:


	public MyProfile profile(String SWNHomePage) throws Throwable {
		// TODO Auto-generated method stub
		String welcometest = WelcomeHome.getText();
		

		if (welcometest.equals(SWNHomePage)) {
			//System.out.println("Successfully logged in");
			Reporting("Pass"," User logged in ", "Logged in Successful "+welcometest, "User Should be able to login "+welcometest);
			return new MyProfile();
			
		} else {
			//System.out.println(welcometest);
			//System.out.println(SWNHomePage);
			Reporting("FAIL"," User logged in ", "Logged in Successful "+welcometest, "User Should be able to login "+welcometest);
			driver.close();
		}
		
		return new MyProfile();
		
	}
	
//	public boolean verifyCorrectUserName(){
//		return WelcomeHome.isDisplayed();
	
	
	
}
