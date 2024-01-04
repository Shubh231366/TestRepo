package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureScreenshot2 {
	
	CaptureScreenShot1 t1 = new CaptureScreenShot1();
	
	@Test()
	public void dologin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().deleteAllCookies();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubh231366@gmail.com");
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shubh@231366");
		
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//input[@id='email']")).clear();
		t1.driver.findElement(By.xpath("//input[@id='pass']")).clear();
		
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubh231366@gmail.com");
		//passing the wrong id so that the TC will fail
		t1.driver.findElement(By.xpath("//input[@id='pass_wrong']")).sendKeys("shubh@231366");
		
	}
	
	@AfterMethod()
	public void capturescreenshot(ITestResult result2) throws Exception {
		t1.capturescreenshot(result2);
	}

}
