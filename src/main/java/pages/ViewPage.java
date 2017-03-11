package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class ViewPage extends OpentapsWrappers{
	
	public ViewPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public ViewPage printLeadFirstName(){
		
		getTextById("viewLead_firstName_sp");
		
		
		return new ViewPage(driver, test);
		
	}
	
	}

