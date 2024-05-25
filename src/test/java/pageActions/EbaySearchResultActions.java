package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageElements.EbaySearchResultLocators;
import utilities.SetupDrivers;


/* how do you perform assertion in class or in your test cases? 
 	
 	Answer: We perform Assertion in 3 ways
 		1. AssertEquals(use it)
 		2.AssertTrue(use it)
 		3.AssertFalse(We don't use it)
 		
 		
 	Two types of Assertion-
 		1. Hard Assertion or Assertion - if i have 100 test steps and i run the code. Say 80 of them 
 			passed but the 81 test step fails. Then during the Hard Assertion if one step fails my entire execution of 
 			the program will fail. Where ever my test case fails, my entire execution will fail right then and there.
 			We don't need to call any method to perform Hard Assertion
 		2. Soft Assertion or Verify - On the other hand, during soft Assertion, even one or a few of my test steps fails, 
 			the test will continue executing until its done executing the test cases. And at the end of the test, we can 
 			see where it failed in the result. 
 			We use AssertAll() at the very end of the test cases for soft Assertion
 	
 	
 	
 */

//Assert actually came from testng.




//For validating, How do you Validate an web Element? Ans: 2 methods- 1. isDisplayed - to display 2. isEnabled - mostly 
//for drop down bar 3. isSelected - usually used for selection like radio button

	









public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	
	
	public EbaySearchResultActions() {
		
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
		
		
	}
	
	
	
	
public void verifyShoesItems() {
		
		
	
	
	//option 1
	Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	
	
	//option 2
	Assert.assertEquals(EbaySearchResultLocatorsObj.txtShoes.getText(), "shoes");   // getText() method gives us the actual 
	//text visible in the web element, we use it to get a text from the website
		
		
	}
	



public void verifyShirtsItems() {
		
		
	
	
	//option 1
	Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	
	
	//option 2
	Assert.assertEquals(EbaySearchResultLocatorsObj.txtShirts.getText(), "shirts");  
		
		
	}



public void selectBrands(String brands) {
	
	if(brands.equals("adidas")) {
		
		EbaySearchResultLocatorsObj.brandAdidas.click();
		//Assert.assertTrue(EbaySearchResultLocatorsObj.brandAdidas.click());
	}
	else if(brands.equals("Jordan")){
		
		EbaySearchResultLocatorsObj.brandJordan.click();
		
	}else {
		
		System.out.println("Brand not found");
		
	}
	
}


//Clicking on Tuxedo suite on ebay Search result page

public void clickOnsuiteTuxedo() {
	
	EbaySearchResultLocatorsObj.suiteTuxedo.click();
	
}

//clicking on Yonex racket

public void clickOnYonexRacket() {
	EbaySearchResultLocatorsObj.badmintonRacket.click();
}

}
