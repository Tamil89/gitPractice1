package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MyHome extends OpentapsWrappers{
	
	public MyHome (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public MyHome clickCRMSFA(){
		clickByLink("CRM/SFA");
		return new MyHome(driver, test);
	}
	
	public MyHome clickLeads(){
		clickByXpath("//a[contains(text(),'Leads')]");
		return new MyHome(driver, test);
	
	}
}
