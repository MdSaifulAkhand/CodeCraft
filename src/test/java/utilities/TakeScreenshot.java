package utilities;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {
	
	public void screenshots() throws Exception{
		
		String filename = "Ebay";
		
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy h-m-s");
		Date date = new Date();
		
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"/screenshots/"+filename+dateFormat.format(date)+".png"));
		
		System.out.println(">>>>>>>> Screenshot Taken<<<<<<<<<<<");
		
		
		/*
		 * TakeScreenshot tc = (TakeScreenshot)SetupDrivers.driver;
			File src = tc.getScreenshotAs(OutputType.FILE);
			File dest = new File("data/ScreenShot01.png");
			FileUtils.copyFile(src, dest);
			
		
		How do you take screenshots? - 
			 * 
			 * 1. We first call our driver using SetupDrivers.driver and cast the driver into TakesScreenshot which will return a 
			 * value of file which is why we have to store the value in a File variable. Then, we will use getScreenshotAs() 
			 * method 
			 * 
			 * 2. After that, we call copyFile() method which takes 2 arguments (source and destination) 
			 * inside it's parameter using FileUtils Class. We will pass our screenshot variable that we created earlier as 
			 * source and create a new File object as second parameter where we will give our file path where we want the 
			 * screenshot to be stored once the test is failed. 
			 * 
			 */
		
			
	}
	

}
