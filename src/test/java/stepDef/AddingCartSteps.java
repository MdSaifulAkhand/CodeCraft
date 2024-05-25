package stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.AddingcartActions;

public class AddingCartSteps {
	
	
	AddingcartActions AddingcartActionsObj = new AddingcartActions();
	
	
	
	@When("^Select size type$")
	public void select_size_type() throws Throwable {
		
		AddingcartActionsObj.switchNewWindow();
		
		AddingcartActionsObj.selectSizeType();
	     
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		
		AddingcartActionsObj.selectSize();
	     
	}

	@When("^Select length$")
	public void select_length() throws Throwable {
		
		AddingcartActionsObj.selectLength();
	     
	}

	@When("^Select quantity$")
	public void select_quantity() throws Throwable {
		
		AddingcartActionsObj.selectQuantity();
	     
	}

	@Then("^Add to the cart$")
	public void add_to_the_cart() throws Throwable {
		
		AddingcartActionsObj.addToCart();
	     
	}

	
	
	

}
