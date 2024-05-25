package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageElements.AddingCartLocators;
import utilities.SetupDrivers;

public class AddingcartActions {
	
	
	AddingCartLocators AddingCartLocatorsObj;
	
	
	
	public AddingcartActions() {
		
		AddingCartLocatorsObj = new AddingCartLocators();
		PageFactory.initElements(SetupDrivers.driver, AddingCartLocatorsObj);
		
		}
	
	
	//Window handling method
	
	
	public void switchNewWindow() {
		
		
		for(String windowHandle : SetupDrivers.driver.getWindowHandles()) {
			
			SetupDrivers.driver.switchTo().window(windowHandle);
			
			
		}
		
		
	}
	
	
	
	
	public void selectSizeType() {
		
		Select dropDown = new Select(AddingCartLocatorsObj.sizeType);
		
		dropDown.selectByVisibleText("Regular");
		
	}
	
	
public void selectSize() {
		
		Select dropDown = new Select(AddingCartLocatorsObj.size);
		
		dropDown.selectByVisibleText("38");
		
	}


public void selectLength() {
	
	Select dropDown = new Select(AddingCartLocatorsObj.length);
	
	dropDown.selectByVisibleText("Long");
	
}


public void selectQuantity() {
	
	AddingCartLocatorsObj.quantity.clear();
	AddingCartLocatorsObj.quantity.sendKeys("2");
	
}


public void addToCart() {
	
	AddingCartLocatorsObj.addToCart.click();
	
}



	
	
	
	
	
	

}
