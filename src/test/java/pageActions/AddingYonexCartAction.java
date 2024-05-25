package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageElements.AddingYonexCartLocators;
import utilities.SetupDrivers;

public class AddingYonexCartAction {
	
	
	AddingYonexCartLocators AddingYonexCartLocatorsObj;
	
	
	public AddingYonexCartAction() {
		AddingYonexCartLocatorsObj=new AddingYonexCartLocators();
		PageFactory.initElements(SetupDrivers.driver, AddingYonexCartLocatorsObj);
		
	}
	
	
	
public void switchNewWindow() {
		
		
		for(String windowHandle : SetupDrivers.driver.getWindowHandles()) {
			
			SetupDrivers.driver.switchTo().window(windowHandle);
			
			
		}
		
		
	}



public void selectString() {
	
	Select dropdown = new Select(AddingYonexCartLocatorsObj.selectString);
	dropdown.selectByVisibleText("Yonex BG65 Titanium");
	
}


public void selectTension() {
	
	Select dropdown = new Select(AddingYonexCartLocatorsObj.selectTension);
	dropdown.selectByVisibleText("28");
	
}


public void selectQuantity() {
	
	AddingYonexCartLocatorsObj.selectQunatity.clear();
	AddingYonexCartLocatorsObj.selectQunatity.sendKeys("2");
	
}


public void addToCart() {
	
	AddingYonexCartLocatorsObj.addToCartButton.click();
	
}
	
	
	
	

}
