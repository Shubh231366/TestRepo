package selenium_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		//specify the location of property file
		
		//config property file location
		File src1 = new File("C:\\Users\\Shubh\\eclipse-workspace\\OnlineJavaAutomation_@3April\\Repository\\config.properties");
		System.out.println("File location specified for config.properties file");
		
		//locator properties file location
		File src2 = new File("C:\\Users\\Shubh\\eclipse-workspace\\OnlineJavaAutomation_@3April\\Repository\\locator.properties");
		System.out.println("File location specified for locator.properties file");
		
		//testdata properties file location
		File src3 = new File("C:\\Users\\Shubh\\eclipse-workspace\\OnlineJavaAutomation_@3April\\Repository\\testdata.properties");
		System.out.println("File location specified for testdata.properties file");
		
		//Create the FileInputStream Class Object to load the file
		FileInputStream fis1 = new FileInputStream(src1);
		FileInputStream fis2 = new FileInputStream(src2);
		FileInputStream fis3 = new FileInputStream(src3);
		
		//Create properties Class object to read the files
		Properties pro1 = new Properties();
		pro1.load(fis1);
		System.out.println("properties loaded for config file");
		Properties pro2 = new Properties();
		pro2.load(fis2);
		System.out.println("properties loaded for locator file");
		Properties pro3 = new Properties();
		pro3.load(fis3);
		System.out.println("properties loaded for testdata file");
		
		//setting the property of chrome browser and passing the chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL"));
		System.out.println("URL launched from the config property file");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData3"));
		System.out.println("Email field detected from locator property file and username is entered from testdata property file");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData4"));
		System.out.println("Password field detected from locator property file and password is entered from testdata property file");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro2.getProperty("Login"))).click();
		System.out.println("Login button detected from locator propert file");
		
		Thread.sleep(2000);
		driver.close();

	}

}
