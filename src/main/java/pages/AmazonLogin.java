package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class AmazonLogin extends OpentapsWrappers{
	
	public AmazonLogin(RemoteWebDriver driver, ExtentTest test){
		
		this.driver= driver;
		this.test= test;
		
		
	}
	
	
	public AmazonLogin enterSearchItem(String searchItem){
		
		enterById("twotabsearchtextbox", searchItem);
		
//		enterByClass("nav-searchbar", searchItem);
		return this;
		
		
		
	}
	
	public AmazonLogin clickSearch(){
		
		clickByXpath("//input[@value='Go']");
		return this;
		
	}
	
	public AmazonLogin sortItem(String sortValue){
		
		selectVisibileTextById("sort", sortValue);
		sleep(5000);
		return this;
		
	
	}
	
	public AmazonLogin searchMobile(){
		
		clickByXpath("//h2[text()= 'Lenovo Vibe K5 (Grey, Snapdragon 616, VoLTE update)']");
		return this;
		
	}
	
	public AmazonLogin switchWindow(){
		 switchToLastWindow();
		 return this;
	}
	
	public AmazonLogin verifytheText(String searchItem ){
		
		verifyTextByXpath("//a[text()='Mobiles & Accessories']", searchItem);
		
		return this;
	}
////public AmazonLogin appwait() {
////	
////	sleep(500);
////	
////	return this;
//}
	


}
