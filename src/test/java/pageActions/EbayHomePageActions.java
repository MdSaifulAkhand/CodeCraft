package pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import pageElements.EbayHomePageLocators;
import utilities.SetupDrivers;





	/* 
	- Page object model is a design pattern where we keep our locators, action and step definition in separate classes in order
	to make it organized and so it is easy to read and find any error if happens.

    - In testng we don't need any step definitions because it has test classes
	
 	- Pom - Page object model
	
	- Pom.xml - Project Object model which is a configuration file for our project where we keep our dependencies and plugIns.
	
	- Why do we include step definition in Page object model? Because we are implementing Hybrid framework. By Hybread means we 
	mean testng, cucumber, junit, selenium, java etc. which is why it is called Hybrid framework. it is not data driven or 
	QR driven
	
	- In the Hybrid framework we are including stepDefinition while exclaiming the Page Object Model

	- In HomepageActions classes we always need to call the HomePage Locators from the HomePageLocator classes

	- FindBy is a PageFactory - if i call FindBy PageFactory of the PageLocator class, I must create a construction in the 
	PageActions Class in order to connect with the locator class
	
	- Page object model has different pattern ex: PageFactory is one of them.
	
	*/



public class EbayHomePageActions {
	
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	// we created constructor  because we need to call PageFactory
	
	public EbayHomePageActions() {
		
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);  // calling the PageFactory which takes 2 
		//parameters - a driver and an object and then we set the parameters(our web driver, HomepageLocator Obj)
			
	}
	
	
	public void typeShoes() {
		
		EbayHomePageLocatorsObj.searchBox.sendKeys("shoes");
		
		EbayHomePageLocatorsObj.searchBtn.click();
		
		//EbayHomePageLocatorsObj.searchBtn.sendKeys(Keys.ENTER);
		
	}
	
	public void typeShirts() {
		EbayHomePageLocatorsObj.searchBox.sendKeys("Shirt");
		EbayHomePageLocatorsObj.searchBtn.click();
	}
	
	
	public void searchItems(String Brands) {
		
		EbayHomePageLocatorsObj.searchBox.sendKeys(Brands);
		EbayHomePageLocatorsObj.searchBtn.click();
			
	}
	
	// Searching for "White Tuxedo Jacket with Black Satin Trim"
	public void WhiteTuxedoJacketwithBlackSatinTrim() {
		EbayHomePageLocatorsObj.searchBox.sendKeys("White Tuxedo Jacket with Black Satin Trim");
		EbayHomePageLocatorsObj.searchBtn.click();
	}
	
	//Searching for yonex astrox 100 zz
	public void yonexastrox100zz() {
		EbayHomePageLocatorsObj.searchBox.sendKeys("yonex astrox 100 zz");
		EbayHomePageLocatorsObj.searchBtn.click();
	}
	
	
	

}
