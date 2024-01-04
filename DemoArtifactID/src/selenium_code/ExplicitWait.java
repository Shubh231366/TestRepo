package selenium_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//enter username
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("test@gmail.com");
		System.out.println("email enetred as :" + " " + "test@gmail.com");
		
		//fetch input box attribute
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		//get dimensions of the input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//Explicit wait
		Thread.sleep(2000);
		WebDriverWait wt = new WebDriverWait(driver, 30);
		//wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("passs"))).sendKeys("test1234");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("test1234");
		System.out.println("password entered as :" + " " + "test1234");
		
	}
}