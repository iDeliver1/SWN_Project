package test.SWN;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.swn.qa.pages.HomePage;
import com.swn.qa.pages.LoginPage;
import com.swn.qa.pages.MyProfile;
import com.swn.qa.util.Extent_reporter;
import com.swn.qa.util.TestUtil;
import com.swn.qa.base.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	MyProfile myprofile;

	public LoginPageTest(){
		super();
	}
	
	//Initializing
	
	@BeforeTest
	public void setUp() throws Throwable{
		SetUP("SWNLogin");
		loginPage = new LoginPage();
	}
	
	
	//Login Test
	@Test(priority=1)
	public void LoginTest() throws Throwable{
		log("-----------------------"+new Object(){}.getClass().getEnclosingMethod().getName()+"--------------");
		
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
			
	}
	
	@Test(priority=2,dependsOnMethods = "LoginTest")

	public void ProfileTest() throws Throwable{
	
			log("-----------------------"+new Object(){}.getClass().getEnclosingMethod().getName()+"--------------");
	
			//getReportname(new Object(){}.getClass().getEnclosingMethod().getName());
	
			myprofile = homepage.profile(prop.getProperty("profile"));	
			myprofile.clickmyprofile();
			myprofile.clickOnLogoutLink();
	}
	
//	@Test(priority=3)
//
//	public void GeneralProfileSettings() throws Throwable{
//	
//			log("-----------------------"+new Object(){}.getClass().getEnclosingMethod().getName()+"--------------");
//	
//			//getReportname(new Object(){}.getClass().getEnclosingMethod().getName());
//	
//			GeneralProfileSettings = homepage.GeneralProfileSettings(prop.getProperty("profile"));	
//		
//	}
	
	//Closing Browser and saving report 
	@AfterTest
	public void Flush()
	{
		closeBrowser();
	}

}
