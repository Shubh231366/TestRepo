package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://money.rediff.com/gainers");
		
		
		//create list of all companies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Total number of companies :" + " " + allcompanies.size());
		System.out.println("Comapny on the 5th number in the list :" + allcompanies.get(5).getText());
		
		//create list of all groups
		List<WebElement> group = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		System.out.println("Total number of groups :" + " " + group.size());
		System.out.println("group of the 5th company :" + group.get(5).getText());
		
		//create list of all prev close
		List<WebElement> prclose = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		System.out.println("Total number of prev close :" + prclose.size());
		System.out.println("prev close of the 5th company :" + prclose.get(5).getText());
		
		//create list of current price
		List<WebElement> price = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total number of current price :" + price.size());
		System.out.println("price of the 5th company :" + price.get(5).getText());
		
		
		//create list of percentagechange
		List<WebElement> perchange = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
		System.out.println("Total number of %change :" + perchange.size());
		System.out.println("%change of the 5th company :" + perchange.get(5).getText());
		
		//printing any random company name and clicking
		String expcompany = "Zodiac clothing";
		for(int i = 0; i < allcompanies.size(); i++)
		{
			if(allcompanies.get(i).getText().equalsIgnoreCase(expcompany))
			{
				System.out.println(allcompanies.get(i).getText() + " " + group.get(i).getText() + " " + prclose.get(i).getText() + " " + price.get(i).getText() + " " + perchange.get(i).getText());
				allcompanies.get(i).click();
				System.out.println(allcompanies.get(i).getText() + " " + "Clicked");
				break;
			}
		}
		
		driver.close();
		
	}

}
