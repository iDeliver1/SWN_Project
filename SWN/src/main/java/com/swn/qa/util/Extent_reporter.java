package com.swn.qa.util;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.swn.qa.util.Gernric_functions;
import com.swn.qa.base.TestBase;



public class Extent_reporter extends TestBase {
	static ExtentTest logger,child_logger,parent_logger;
	  private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	  private static ThreadLocal<ExtentReports>  extent1 =new ThreadLocal<ExtentReports>();
	  ExtentHtmlReporter htmlReporter;
	  public static ExtentReports extent;
	  public static String Report_Folder_path = "C:\\Reporting\\Report"+Gernric_functions.fTimestamp();
	  static int Stepnumber=1,i=1,functioncall=1,j=1;
	  
	 
	//Getting TestName
	  
	  public static ExtentReports createins() {
			 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(Report_Folder_path + "\\testReport.html");
	       extent = new ExtentReports();
	       extent.attachReporter(htmlReporter);
	       extent.setSystemInfo("OS", "OS");
	       extent.setSystemInfo("Browser", "browser");
	       
	       //htmlReporter.config().setChartVisibilityOnOpen(true);
	       htmlReporter.config().setDocumentTitle("Extent Report Demo");
	       htmlReporter.config().setReportName("Test Report");
	       //htmlReporter.config().setTestViewChartLocation(CharacterSection.TOP);
	       htmlReporter.config().setTheme(Theme.STANDARD);
	       return extent;
	     
	}
	  
	  
	  
	  public static ExtentTest CreateRoportname(String Step_details){
		  logger = extent.createTest(Step_details);
		  functioncall=1;
		  j=1;
		 
			return logger;
			
	  }
	  
	  
	/*  public static ExtentTest CreateParentRoportname(String Step_details,ExtentReports extent1){
			parent_logger = logger.createNode("Step Number "+i+" "+Step_details);
			i=i+1;
			return parent_logger;
			
		}
		
	/*	public static ExtentTest CreateChildRoportname(String Step_details,ExtentReports extent1){
			if(functioncall==1){ //For Checking Parent Logger is called or not
				Stepnumber=1;
			}
			child_logger = parent_logger.createNode("Step Number "+j+"."+Stepnumber+" "+Step_details);
			Stepnumber=Stepnumber+1;
			functioncall=functioncall+1;
			return child_logger;
			
		}*/
		
		
	//Reporting for Pass & Fail Event 
		/*public static void Report(String Status1,String Description,String ActualStep,String ExpectedStep,String TestName) throws Throwable{

			
			//For Parallel Browsing
			if(TestName.equalsIgnoreCase("Login")){
				loglp=logger;

				String ReportStatus = "<b>Step Number "+Stepnumber+"<br>Description :</b> "+Description+"<br><b>Expected :</b> "+ExpectedStep+"<br><b>Actual :</b> "+ActualStep;
				if(Status1.equalsIgnoreCase("PASS")){
					 
					
					loglp.log(Status.PASS, ReportStatus);
					//logger.log(Status.PASS, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
					loglp.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
					
				}
				else{
					
					loglp.log(Status.FAIL, ReportStatus);
					loglp.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
					closeBrowser();
					//logger.log(Status.FAIL, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
					
				}
				Stepnumber=Stepnumber+1;
			}
			else if(TestName.equalsIgnoreCase("Edit")){
				logep=logger;
				
				String ReportStatus = "<b>Step Number "+i+"<br>Description :</b> "+Description+"<br><b>Expected :</b> "+ExpectedStep+"<br><b>Actual :</b> "+ActualStep;
				if(Status1.equalsIgnoreCase("PASS")){
					 
					
					logep.log(Status.PASS, ReportStatus);
					//logger.log(Status.PASS, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
					logep.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
					
				}
				else{
					
					logep.log(Status.FAIL, ReportStatus);
					logep.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
					closeBrowser();
					//logger.log(Status.FAIL, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
					
				}
				i=i+1;
			}
			
			else{
				String ReportStatus = "<b>Step Number "+functioncall+"<br>Description :</b> "+Description+"<br><b>Expected :</b> "+ExpectedStep+"<br><b>Actual :</b> "+ActualStep;
				if(Status1.equalsIgnoreCase("PASS")){
					 
					
					logep.log(Status.PASS, ReportStatus);
					//logger.log(Status.PASS, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
					logep.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
					
				}
				else{
					
					logep.log(Status.FAIL, ReportStatus);
					logep.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
					closeBrowser();
					//logger.log(Status.FAIL, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
					
				}
				functioncall=functioncall+1;
			}
			
	}
		*/
	  public synchronized  ExtentTest getTest() {
	      return extentTest.get();
	  }
	  
	  public  void Report(String Status1,String Description,String ActualStep,String ExpectedStep) throws Throwable{
			
		  
		  
		  String ReportStatus = "<b>Step Number "+functioncall+"<br>Description :</b> "+Description+"<br><b>Expected :</b> "+ExpectedStep+"<br><b>Actual :</b> "+ActualStep;
			
			try{
			if(Status1.equalsIgnoreCase("PASS")){	
				logger.log(Status.PASS, ReportStatus);
				//logger.log(Status.PASS, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
				logger.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
				
			}
			else{
				
				logger.log(Status.FAIL, ReportStatus);
				logger.addScreenCaptureFromPath(Gernric_functions.fScreenReport());
				closeBrowser();
				//logger.log(Status.FAIL, ReportStatus, MediaEntityBuilder.createScreenCaptureFromPath(Gernric_functions.fScreenReport()).build());
				
			}
			
			}catch(Exception e){
				System.out.println(e);
			}
			functioncall=functioncall+1;
		}
	  
		//Validation for actual and expected 
		public  void validation(String StepName,String Actual,String Expected) throws Throwable{
			
			try{
				Assert.assertEquals(true, Actual.contains(Expected));
				Report("PASS",StepName,"Page launch Successfull "+ Actual ,"Should be able to launch "+Expected);
				}catch(Exception e){ 
					String cause = e.toString();
					Report("FAIL",StepName,"Page launch unsuccessfull "+ Actual+" Because of "+cause.substring(1, 88) ,"Should be able to launch "+Expected);
				}
		
		}
		
	public  void Argvalidation(String StepName,String Actual,String Expected) throws Throwable{
			
			try{
				Assert.assertEquals(Actual, Expected);
				Report("PASS","Verifying "+StepName,StepName+" is equal to "+Actual,StepName+"should be equal to "+Expected);
				
				//log(StepName+" Validation     "+Actual + " is equal to " +Expected);
				
				}catch(Exception e){ 
				//	log(StepName+"  Validation    "+ Actual + " is not  equal to " +Expected+" because "+e);
					
					Report("FAIL","Verifying "+StepName,StepName+"is equal to "+Actual+""+e,StepName+"should be equal to "+Expected);
				}
		
		}

	public  void Menuvalidation(String StepName,WebElement element) throws Throwable{
		
		try{
			 Assert.assertEquals(true, element.isDisplayed());
			Report("PASS","Verifying "+ StepName,StepName+" is Visible ",StepName+" Must be visible");
			//log(StepName + " is Visible ");
			}catch(Exception e){ 
				String cause = e.toString();
				//log(StepName+" is not Visible ");
				Report("FAIL","Verifying "+StepName, StepName+" is not visible because "+cause.substring(1, 88) ,StepName+" Must be visible");
				
			}
	}
	
	
	

	}