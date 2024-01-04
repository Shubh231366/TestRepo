package selenium_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel{

	public static void main(String[] args) throws Exception {
		
		//specify the location of the excel file
		File src = new File("E:\\Shammi Jha Training\\Book1.xlsx");
		
		//Create the FileInputStream Class Object to load the excel file
		FileInputStream fis = new FileInputStream(src);
		
		//Create XSSFWorkbook class object to load the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Create XSSFWorksheet class to load the worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//print the loaded sheet name to check if the correct sheet is loaded or not
		System.out.println(sh.getSheetName());
		
		//print username from the excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//print password from the excel sheet
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
		//print any integer value from the excel sheet
		System.out.println(sh.getRow(3).getCell(2).getNumericCellValue());
		
		//Print total number of rows
		System.out.println("Total number of rows :" + sh.getPhysicalNumberOfRows());
		System.out.println("Total number of rows :" + (sh.getLastRowNum()+1));
		
		//print total number of columns
		System.out.println("Total number of columns :" + sh.getRow(1).getLastCellNum());
		System.out.println("Total number of columns :" + sh.getRow(1).getPhysicalNumberOfCells());
		
		//Real time implimentaion
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi Jha Training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
		
		//Enter Username and password using the excel file
		String user = sh.getRow(6).getCell(0).getStringCellValue();
		String pass = sh.getRow(6).getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name= 'login']")).click();
		
		Thread.sleep(5000);
		driver.close();
	
	}

}
