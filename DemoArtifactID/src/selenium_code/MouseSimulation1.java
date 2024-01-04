package selenium_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart Web application opened");
		driver.navigate().refresh();
		System.out.println("Application refreshed");
		
		Thread.sleep(2000);
		//create electronics webElement reference
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		System.out.println("electronics WebElement is stored in the electro reference by the help of xpath");
		
		//Mouse simulation using actions class
		Actions act = new Actions(driver);
		System.out.println("Actions Class is used to perform the mouse simutaion");
		
		//Mouse hover to electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		System.out.println("Mouse hover to electronics item and electronics dropdown list opened");
		
		//keyboard operations
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Create the fashion WebElement
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("Fashion option clicked");
		
		//Right click on the web page
		Thread.sleep(2000);
		act.contextClick().build().perform();
		System.out.println("Right click action performed");
		
		//right click on any WebElement
		Thread.sleep(2000);
		act.contextClick(fash);
		System.out.println("Fashion element right clicked");
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
