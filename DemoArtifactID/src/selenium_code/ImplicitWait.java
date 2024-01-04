package selenium_code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@id= 'APjFqb']")).sendKeys("How Stuff works");
	    
		//Handling auto suggestions
		List<WebElement> Allsuggestions = driver.findElements(By.xpath("//ul[@role= 'listbox']/li"));
		System.out.println("Total number of suggestions :" + " " + Allsuggestions.size());
		System.out.println(Allsuggestions.get(6).getText() + " " + "Clicked");
		
		
		for(int i = 0; i< Allsuggestions.size(); i++)
		{
			String expresult = "how stuff works quiz";
			if(Allsuggestions.get(i).getText().equalsIgnoreCase(expresult))
			{
				System.out.println(Allsuggestions.get(i).getText() + " " + "selected automatically");
				Thread.sleep(2000);
				Allsuggestions.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
