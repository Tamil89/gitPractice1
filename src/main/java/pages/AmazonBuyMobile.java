package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class AmazonBuyMobile extends OpentapsWrappers{

	
	public AmazonBuyMobile( RemoteWebDriver driver, ExtentTest test){
		
		this.driver= driver;
		this.test= test;
		
	}
	
	public AmazonBuyMobile changeZipCodeAdd(){
		
		clickByClassName("a-popover-trigger a-declarative");
		return this;
		
	}
	
	public AmazonBuyMobile enterZipCode(String zipCode){
		
		enterById("unifiedLocationAddrInput", zipCode);
		return this;
	}
}
