package selenium_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//javascriptexecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//locate WebElements using Javascriptexecutor
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='abcd@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abcd@1234'");
		System.out.println("info enetered in email field");
		System.out.println("info entered in password field");
		
		//Scroll Down using JavaScript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 200)");
		System.out.println("pag scrolled down");
				
		//Scroll Up using JavaScript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, -200)");
		System.out.println("page scrolled up");
		
		Thread.sleep(2000);
		driver.close();

	}

}
