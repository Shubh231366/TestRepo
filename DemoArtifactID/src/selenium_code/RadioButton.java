package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

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
				
				
				//finding and clicking the radio button with the help of xpath
				
				//1st way
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value= '1']")).click(); // Female
				System.out.println("Female button is clcked");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value= '2']")).click(); //Male
				System.out.println("Male button is clcked");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value= '-1']")).click(); //Custom
				System.out.println("Custom button is clcked");
				
				//2nd way
				List<WebElement> radios = driver.findElements(By.xpath("//input[@type= 'radio']"));
				System.out.println("Total radio buttons :" + radios.size());
				System.out.println(radios.get(0).isEnabled()); //True
				System.out.println(radios.get(1).isEnabled()); //True
				System.out.println(radios.get(2).isEnabled()); //True 
				System.out.println(radios.get(1).isDisplayed()); //True
				System.out.println(radios.get(1).isDisplayed()); //True
				System.out.println(radios.get(2).isDisplayed()); //True
				System.out.println(radios.get(0).isSelected());  //False
				System.out.println(radios.get(1).isSelected());  //False
				System.out.println(radios.get(2).isSelected());  //True
				Thread.sleep(2000);
				radios.get(0).click();  //Female clicked
				System.out.println("Female button is clicked" + " " + radios.get(0).isSelected());
				
				
				//3rd way
				Thread.sleep(2000);
				List<WebElement> radiostext = driver.findElements(By.xpath("//label[@class= '_58mt']"));
				System.out.println("Total radio buttons :" + radiostext.size());
				String eresult = "Custom";	
				for(int i = 0; i<radiostext.size(); i++)
				{
					if(radiostext.get(i).getText().equalsIgnoreCase(eresult)) {
						radiostext.get(i).click();
						System.out.println(eresult + " " + "clicked");
						System.out.println("value of the 2nd index is " + " " +radiostext.get(i).getText());
						break;
					}
				}

				Thread.sleep(2000);
				driver.close();
				

	}

}
