package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



//which methods we use to type texts? Ans: SendKeys Method




public class EbayHomePageLocators {
	
	
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement searchBox;
	
	
	
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement searchBtn;
	
	
	
	//public static void TxtBox() {
	//WebElement createBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	
	//}

}
