package selenium_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerthandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@id='confirmButton'])[1]")).click();
		System.out.println("click me button selected");
		
		//verify alert text
		String alerttext = driver.switchTo().alert().getText();
		String expalerttext = "Do you confirm action?";
		Assert.assertEquals(alerttext, expalerttext);
		System.out.println("Alert text verified");
		
		//alert accept
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert accepted");
		
		//alert dismiss
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@id='confirmButton'])[1]")).click();
		System.out.println("click me button selected");
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
