package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	@FindBy(xpath = "//span[text()='shoes']")
	public WebElement txtShoes;

	@FindBy(xpath = "//span[text()='shirts']")
	public WebElement txtShirts;

	@FindBy(xpath = "//span[text()='adidas']")
	public WebElement brandAdidas;
	
	@FindBy(xpath = "//span[text()='Jordan']")
	public WebElement brandJordan;
	
	
	@FindBy(xpath = "(//div[@class='s-item__title'])[2]")
	public WebElement suiteTuxedo;
	
	
	@FindBy(xpath = "(//span[@role='heading'])[2]")
	public WebElement badmintonRacket;
	
	
	

}
