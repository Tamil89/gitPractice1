package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class CreatLead extends OpentapsWrappers{
	
	public CreatLead (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public CreatLead enterCompanyName(String companyName){
		
		enterById("createLeadForm_companyName", companyName);
		return new CreatLead(driver, test);
		
	}
	
public CreatLead enterFirstName(String firstName){
		
		enterById("createLeadForm_firstName",firstName);
		return new CreatLead(driver, test);
		
	}
public CreatLead enterLastName(String lastName){
		
		enterById("createLeadForm_lastName", lastName);
		return new CreatLead(driver, test);
		
	}

public CreatLead clickCreatLead(){
	
	clickByClassName("smallSubmit");
	return new CreatLead(driver, test);
	
}
	
	}

