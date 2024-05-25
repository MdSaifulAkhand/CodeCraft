package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;							//initializing the driver
	
	public static void setupDriver() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdsaifulakhand/Downloads/chromedriver");  //setting up the driver 
		//through file path of chromeDriver
		
		//WebDriverManager.chromedriver().setup(); 			//getting the chrome driver from cloud
		
		
		ChromeOptions options=new ChromeOptions();			//initializing chrome options
		
		options.addArguments("--start-maximized");			//add argument to maximize the browser
		options.addArguments("--disable-notifications");	//add argument to disable notifications
		//options.addArguments("--headless");					//headless execution
		
		//what is headless execution? - lots of the time, our project takes long time to run and execute. May be 15,20 minutes or 
		//sometimes hours. When this happens we can not do something else. In order to avoid this, ChromeOption introduced 
		//"Headless" argument where the program will continue running behind and execute and we won't see it running but
		// we will be able to see the result in console either it pass or failed while we continue doing something else.
		
		driver=new ChromeDriver(options);					//initializing chrome driver
		driver.get("https://www.ebay.com/");	            //loading the page
		
	}
	
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	
	
	//We improvised Encapsulation in SetupDrivers class where we set our driver using SetupDriver() method and return our 
	//driver using getDriver method which defines data wrapping process, in other word Encapsulation.
	
	public static void tearDownDriver() {
		
		driver.close();										//closing current window/
		driver.quit();										//closing all window
	}
	

}
