package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		
		//setting the path of the the chromebrowser path and passing the chrome driver instance
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		
		//launch the chrome instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//launch the facebook application
		driver.get("https://www.facebook.com/");
			
		//click the create new account button by the xpath
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0')]")).click();
		
		//1sy way
		//selecting date 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='day']/option[@value= '8']")).click();
		System.out.println("8 is selected in a day dropdown");
		//selecting the month
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']/option[@value= '9']")).click();
		System.out.println("sep is selected in a month dropdown");
		//selecting year
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='year']/option[@value= '1996']")).click();
		System.out.println("1996 is selected in a year dropdown");
		
		//2nd way
		List<WebElement> birthday = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("Total number of birth days are :" + " " + birthday.size());
		Thread.sleep(2000);
		birthday.get(19).click();
		System.out.println("day selected is" + " " + birthday.get(19).getText() + " " + "and clicked");
		
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total number of birth months are:" + birthmonth.size());
		Thread.sleep(2000);
		String Reqmonth = "May";
		for(int i = 0; i < birthmonth.size(); i++)
		{
			if(birthmonth.get(i).getText().equalsIgnoreCase(Reqmonth))
			{
				birthmonth.get(i).click();
				System.out.println("month selected is " + " " + birthmonth.get(i).getText() + " " + "and clicked");
				break;
			}
		}
		
		
		try {
			List<WebElement> birthyear = driver.findElements(By.xpath("//select[@id='year']"));
			System.out.println("Total number of year :" + " " + birthyear.size());	
			Thread.sleep(2000);
			int x = 1996; 
			String y = String.valueOf(x);
			for(int i = 0; i < birthyear.size(); i++)
			{
				if (birthyear.get(i).getText().equalsIgnoreCase(y)) 
				{
					birthyear.get(i).click();
					System.out.println("year selected is :" + birthyear.get(i).getText() + "clicked");
					break;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
