package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class CaptureScreenShot1 {
	
	WebDriver driver;
	
	//ItestResult will provide us the test case execution status and test name
	public void capturescreenshot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
		
			//create reference of the TakesScreenshot Interface
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			//use getScreenshotAs() method to capture the screenshot in file format
			//getScreenshotAs() method return type = File 
			
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//copy the file to specific location
			File destfolfer = new File("./screenshot/" +result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destfolfer);
			System.out.println(result.getName() + "method() screenshot captured");
			
		}
		
	}

}
