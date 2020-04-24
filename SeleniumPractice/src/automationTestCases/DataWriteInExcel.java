package automationTestCases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class DataWriteInExcel {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//Excel File Location
		String filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\Data.xls";
		 String SheetName = "Sheet3";
		 
		 //Sheetcount
		 
		 System.out.println(ExcelUDF.FnExcelSheetCount(filename));
		 //Rowcount
		 
		 System.out.println(ExcelUDF.FnExcelRowCount(filename, SheetName));
		 
		 String url = driver.getCurrentUrl();
		 
		 if((url.equalsIgnoreCase("https://www.facebook.com/"))== true)
		 {
			 ExcelUDF.FnWritetoExcel(filename, SheetName, 1, 3, "Application Displayed");
			 ExcelUDF.FnWritetoExcel(filename, SheetName, 1, 4, "Passed");
			 
		 }
		 
		 else
		 {
			 ExcelUDF.FnWritetoExcel(filename, SheetName, 1, 3, "Application  not Displayed");
			 ExcelUDF.FnWritetoExcel(filename, SheetName, 1, 4, "Failed");
		 }
		 
	WebElement fname=	driver.findElement(By.name("firstname"));
	
	//FirstName Checking
	
	if(fname.isDisplayed()==true)
	{
		System.out.println("First Name should be displayed");
		
		ExcelUDF.FnWritetoExcel(filename, SheetName, 2, 3, "FirstName is displayed");
		ExcelUDF.FnWritetoExcel(filename, SheetName, 2, 4, "Passed");
	}
	else
	{
		ExcelUDF.FnWritetoExcel(filename, SheetName, 2, 3, "FirstName is  not displayed");
		ExcelUDF.FnWritetoExcel(filename, SheetName, 2, 4, "Failed");
	}
	
	//LastName Checking
	
	WebElement lname = driver.findElement(By.name("lastname"));
	if(lname.isDisplayed()== true)
	{
System.out.println("Last Name should be displayed");
		
		ExcelUDF.FnWritetoExcel(filename, SheetName, 3, 3, "LastName is displayed");
		ExcelUDF.FnWritetoExcel(filename, SheetName, 3, 4, "Passed");
		
	}
	else
	{
		ExcelUDF.FnWritetoExcel(filename, SheetName, 3, 3, "LastName is  not displayed");
		ExcelUDF.FnWritetoExcel(filename, SheetName, 3, 4, "Failed");
	}
	
	
	
	
	
	
	
	}
	
	
     

	}


