package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver driver;
	
	@BeforeClass()
	public void setenv() {
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("Facebbok application launched");
	}
	
	@DataProvider
	public Object [][] dataset() throws Exception {
		
		//specify the locaction of the testdata properties file 
		File src3 = new File("C:\\Users\\Shubh\\eclipse-workspace\\OnlineJavaAutomation_@3April\\Repository\\testdata.properties");
		
		//create FileInputStream class object to load the file
		FileInputStream fis3 = new FileInputStream(src3);
		
		//create the properties class object to read the properties
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		Object arr [][] = new Object [2][2];
		
		arr [0][0] = pro3.getProperty("TestData1");
		arr [0][1] = pro3.getProperty("TestData2");
		
		arr [1][0] = pro3.getProperty("TestData3");
		arr [1][1] = pro3.getProperty("TestData4");
		
		return arr;
		
	}
	
	@Test(dataProvider = "dataset")
	public void clear(String username, String password) throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		System.out.println("email input field cleared");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		System.out.println("password input field cleared");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		System.out.println("username entered in the email field");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		System.out.println("password enetered in the password field");
		
		/*Thread.sleep(2000);
		driver.close();
		System.out.println("Browser closed");*/
		
	}

}
