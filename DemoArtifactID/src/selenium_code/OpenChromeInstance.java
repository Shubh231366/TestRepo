package selenium_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeInstance {

	public static void main(String[] args) {
		
		//setting the path of the the chromebrowser path and passing the chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		
		//launch the chrome instance
		
		
		WebDriver driver = new ChromeDriver();
		

	}

}
