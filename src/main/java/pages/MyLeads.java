package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MyLeads extends OpentapsWrappers{
	
	public MyLeads (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public MyLeads clickCreatLead(){
		clickByXpath("//a[contains(text(),'Create Lead')]");
		return new MyLeads(driver, test);
	}
	
	
	}

