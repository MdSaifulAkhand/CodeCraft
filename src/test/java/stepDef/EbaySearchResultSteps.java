package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.EbayHomePageActions;
import pageActions.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	
	
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	
	//EbaySearch.feature Feature file implementation
	
	@Then("^search result should have only shoes related products$")
	public void search_result_should_have_only_shoes_related_products() throws Throwable {
		
		EbaySearchResultActionsObj.verifyShoesItems();
		
	   
	}
	
	

	@Then("^search result should only have Shirt related product$")
	public void search_result_should_only_have_Shirt_related_product() throws Throwable {
		
		EbaySearchResultActionsObj.verifyShirtsItems();
			  
	}
	
	
	//EbayBrandSelection.feature file
	

	@When("^When select by \"([^\"]*)\"$")
	public void when_select_by(String arg1) throws Throwable {
	    
	}

	@Then("^Item list should have only selected \"([^\"]*)\"$")
	public void item_list_should_have_only_selected(String arg1) throws Throwable {
	    
	}
	
	
	// Search result step for "White Tuxedo Jacket with Black Satin Trim"
	
	@When("^Select the item from the search result$")
	public void select_the_item_from_the_search_result() throws Throwable {
		EbaySearchResultActionsObj.clickOnsuiteTuxedo();
	}
	
	
	
	//Search result for yonex racket
	
	@When("^Select the Badminton item from the search result$")
	public void select_the_Badminton_item_from_the_search_result() throws Throwable {
	    
		EbaySearchResultActionsObj.clickOnYonexRacket();
		
	}

	
	
	
	
	
	

}
