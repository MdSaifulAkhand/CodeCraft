package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.EbayHomePageActions;

public class EbayHomePageSteps {
	
	
	EbayHomePageActions EbayHomePageActionsObj=new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		
		// we dont need to do anything here because Ebay Homepage is already open because we used driver.get() method to open ebay.com
	    
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		
		EbayHomePageActionsObj.typeShoes();
	   
	}
	
	
	
	
	// Searching for shirts
	
	@When("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		EbayHomePageActionsObj.typeShirts();
		    
		}
	
	
	
	@Given("^search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
		EbayHomePageActionsObj.searchItems(arg1);
	}
	
	
	
	//Searching for "White Tuxedo Jacket with Black Satin Trim"
	
	@Given("^White Tuxedo Jacket with Black Satin Trim$")
	public void white_Tuxedo_Jacket_with_Black_Satin_Trim() throws Throwable {
		EbayHomePageActionsObj.WhiteTuxedoJacketwithBlackSatinTrim();
	}
	
	
	
	
	//search for yonex astrox 100zz
	
	@Given("^search for yonex astrox (\\d+) zz$")
	public void search_for_yonex_astrox_zz(int arg1) throws Throwable {
		EbayHomePageActionsObj.yonexastrox100zz();
	    
	}
	
	
		
		

	


}
