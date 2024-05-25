package stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.AddingYonexCartAction;

public class AddingYonexCartSteps {
	
	
	
	AddingYonexCartAction AddingYonexCartActionObj=new AddingYonexCartAction();
	
	@When("^Select String$")
	public void select_String() throws Throwable {
		
		AddingYonexCartActionObj.switchNewWindow();
		
		AddingYonexCartActionObj.selectString();
	    
	}
	
	
	
	@When("^Select Tension$")
	public void select_Tension() throws Throwable {
		
		AddingYonexCartActionObj.selectTension();
	   
	}
	
	
	
	@When("^Select quantity of the racket$")
	public void select_quantity_of_the_racket() throws Throwable {
		
		AddingYonexCartActionObj.selectQuantity();
	    
	}

	@Then("^Add the Racket to the cart$")
	public void add_the_Racket_to_the_cart() throws Throwable {
		
		AddingYonexCartActionObj.addToCart();
	    
	}

	
	
	

}
