package automationTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class DataReadFromExcel {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	//Excel File Location
	String filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\Data.xls";
	 String SheetName = "Sheet2";
	 
	 //Sheetcount
	 
	 System.out.println(ExcelUDF.FnExcelSheetCount(filename));
	 //Rowcount
	 
	 System.out.println(ExcelUDF.FnExcelRowCount(filename, SheetName));
	 
WebElement fname=	driver.findElement(By.name("firstname"));
for(int i =1; i<ExcelUDF.FnExcelRowCount(filename, SheetName); i++)
{
fname.sendKeys(ExcelUDF.FnReadExcel(filename, SheetName, i, 0));
Thread.sleep(3000);
fname.clear();
}	
		
		
	}

}
