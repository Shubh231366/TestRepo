package selenium_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		
		//setting the path of the the chromebrowser path and passing the chrome driver path
				System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
				
				//launch the Chrome instance
				
				WebDriver driver = new ChromeDriver();
				
				//maximize the window
				Thread.sleep(2000);
				driver.manage().window().maximize();
				
				//delete all cookies
				Thread.sleep(2000);
				driver.manage().deleteAllCookies();
				
				//open url using the get method
				Thread.sleep(2000);
				driver.get("https:www.facebook.com");
				
				//open url using navigate method
				Thread.sleep(2000);
				driver.navigate().to("https:www.google.com/");
				
				//refresh the page
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				//navigate to back page
				Thread.sleep(2000);
				driver.navigate().back();
				
				//navigate forward
				Thread.sleep(2000);
				driver.navigate().forward();
				
				//fetch the current url
				Thread.sleep(2000);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				
				//get title of the facebook page
				Thread.sleep(2000);
				driver.navigate().back();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				
				//close the browser
				driver.close();
					

	}

}
