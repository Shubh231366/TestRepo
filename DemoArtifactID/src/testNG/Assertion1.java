package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	@Test
	public void asser1() throws Exception {
		
		String expText = "Facebook helps you connect and share with the people in your life.";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		WebElement fbText = driver.findElement(By.xpath("//h2[text() = 'Facebook helps you connect and share with the people in your life.']"));
		
		String actText = driver.findElement(By.xpath("//h2[text() = 'Facebook helps you connect and share with the people in your life.']")).getText();
		
		//equal assertion
		Assert.assertEquals(actText, expText, null);
		System.out.println("Equal assertion verified");
		
		//False assertion
		Assert.assertFalse(fbText.isSelected());
		System.out.println("False assertion verified");
		
		//True assertion
		Assert.assertTrue(fbText.isDisplayed());
		System.out.println("True assertion verified");
		
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("browser closed");
		
	}

}
