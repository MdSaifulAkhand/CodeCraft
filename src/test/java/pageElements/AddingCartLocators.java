package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingCartLocators {
	
	
			@FindBy(xpath = "(//select[@class=\"x-msku__select-box\"])[1]")
			public WebElement sizeType;
			
			
			@FindBy(xpath = "(//select[@class=\"x-msku__select-box\"])[2]")
			public WebElement size;
			
			
			@FindBy(xpath = "(//select[@class=\"x-msku__select-box\"])[3]")
			public WebElement length;
			
			
			@FindBy(xpath = "//input[@id='qtyTextBox']")
			public WebElement quantity;
			
			
			//@FindBy(xpath = "//span[text()='Buy It Now']")
			//public WebElement buyButton;
			
			
			@FindBy(xpath = "//span[text()='Add to cart']")
			public WebElement addToCart;
			
			
			
			
			
			
			
			
			
			
			
	
			
			
	
	
	
	
	

}
