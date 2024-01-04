package selenium_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		
		//switching frame
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		
		//draggable Web Element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println("Draggable element found");
		
		
		//Droppable Web Element
		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		System.out.println("Droppable element found");
		
		//Actions Class
		Actions act = new Actions(driver);
		System.out.println("Actions class performed");
		
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).build().perform();
		System.out.println("drag and drop action performed");
		
		//to change the position of any draggable item
		Thread.sleep(2000);
		act.dragAndDropBy(drag, 50, 50).build().perform();
		System.out.println("draggable item moved by the given cordinates");
				
		Thread.sleep(2000);
		driver.close();
		System.out.println("window closed");
		
		
		
		
		

	}

}
