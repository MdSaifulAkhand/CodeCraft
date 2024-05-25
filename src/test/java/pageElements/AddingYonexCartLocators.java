package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingYonexCartLocators {
	
	
	
	@FindBy(xpath = "//select[@id='x-msku__select-box-1000']")
	public WebElement selectString;
	
	
	@FindBy(xpath = "//select[@id='x-msku__select-box-1001']")
	public WebElement selectTension;
	
	
	@FindBy(xpath = "//input[@id='qtyTextBox']")
	public WebElement selectQunatity;
	
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	public WebElement addToCartButton;
	
	
	
	
	
	

}
