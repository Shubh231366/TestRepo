package selenium_code;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		//tab handling
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		System.out.println("New Tab opened with URL :" + "https://demoqa.com/sample" + " " + "and message displayed on the window is" + " " + "This is a sample page");

		//get the total number of open tabs/windows
	    Set<String> alltabsID = driver.getWindowHandles();
	    System.out.println(alltabsID);
		
	    //declaring the iterator to switch between the tabs
	    Iterator<String> abc = alltabsID.iterator();
	    String tab1 = abc.next();
	    String tab2 = abc.next();
	    
	    //print the title and the url of the parent tab
	    driver.switchTo().window(tab1);
	    System.out.println("Parent tab ID :" + " " + tab1);
	    System.out.println("Title of the parent tab :" + " " + driver.getTitle());
	    System.out.println("Url of the parent tab :" + " " + driver.getCurrentUrl());
	    
	    //Print the title and URL of the child Tab
	    driver.switchTo().window(tab2);
	    System.out.println("Child tab ID :" + tab2);
	    System.out.println("Title of the Child Tab :" + driver.getTitle());
	    System.out.println("Url of the Child Tab :" + driver.getCurrentUrl());
	    driver.switchTo().window(tab2).close();
	    
	    //New window handling
	    driver.switchTo().window(tab1);
	    driver.findElement(By.id("windowButton")).click();
	    System.out.println("New window opened with URL :" + "https://demoqa.com/sample" + " " + "and message displayed on the window is" + " " + "This is a sample page");
	    
	    
	    Set<String> allwindowsID = driver.getWindowHandles();
	    System.out.println(allwindowsID);
	    
	    Iterator<String> xyz = allwindowsID.iterator();
	    String win1 = xyz.next();
	    String win2 = xyz.next();
	    
	    Thread.sleep(2000);
	    driver.switchTo().window(win1);
	    driver.switchTo().window(win2);
	    driver.manage().window().maximize();
	    System.out.println("Child Window ID :" + win2);
		System.out.println("Title of the Child Tab :" + driver.getTitle());
		System.out.println("Url of the Child Tab :" + driver.getCurrentUrl());
	    
	    Thread.sleep(2000);
	    driver.quit();
		
	}

}
