package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;


		public class FindLead extends OpentapsWrappers{
			
			public FindLead (RemoteWebDriver driver, ExtentTest test){
				this.driver = driver;
				this.test = test;

				if(!verifyTitle("Opentaps Open Source ERP + CRM")){
					reportStep("This is not Home Page", "FAIL");
					
					
					}
				}
			
		public FindLead clickFindLead(){
			
			clickByXpath("//a[contains(text(),'Find Lead')]");
			
			return new FindLead(driver, test);

			
				
			}
		
		public FindLead enterLeadId(String LeadId){
			enterByName("//input[@name= 'id']", LeadId);
			
			return new FindLead(driver,test);
		}
		
		public FindLead clickFindLeadButton(){
			
			clickByXpath("//button[contains(text(),'Find Leads')]");
			
			return this;
			
		}
		
		

	}


