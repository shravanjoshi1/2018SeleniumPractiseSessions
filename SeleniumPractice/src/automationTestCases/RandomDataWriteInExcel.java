package automationTestCases;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomDataWriteInExcel {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
	//Excel File Location
		
		String FileName = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\RandomData.xlsx";
		String SheetName ="RandomData";
	//	RandomExcelUDF.RandomExcelData(Filename, Sheetname, 1, 1, "TC_01", "Validate First Name", "Shravan", Actual, Status);
		   
		
		
	}
	
}
