package automationTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class FbRegWithRandomData {

	public static void main(String[] args) throws InterruptedException, RowsExceededException, BiffException, WriteException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
	//Excel File Location
		
	//	String filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\RandomData.xls";
	//	String SheetName ="Sheet1";
		String filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\Data.xls";
		 String SheetName = "Sheet3";
				 
	WebElement fname=driver.findElement(By.name("firstname"));
	
	WebElement lname=driver.findElement(By.name("lastname"));
	WebElement email=driver.findElement(By.name("reg_email__"));
	for(int i=1; i<=5; i++)
	{
		fname.sendKeys(GenerateRandomData.randomString(8));
	  String myf =fname.getAttribute("value");
	  System.out.println(myf);
	  if((myf.equalsIgnoreCase("Shravan"))==true)
	  {
	
	  //Capture Data
	  //RandomExcelUDF.RandomExcelData(filename, SheetName,  "TC_01", "Capture FirstName","Shravan", myf,"PASSED");
		ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "TC01","Capture FirstName","Shravan", myf,"PASSED");  
	  }
	  else
	  {
		  //Capture Data
		//  RandomExcelUDF.RandomExcelData(filename, Sheetname,  "TC_01", "Capture FirstName","Shravan", myf,"FAILED");
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "TC01","Capture FirstName","Shravan", myf,"FAILED");
	  }
	  
	  
	  //lname.sendKeys(GenerateRandomData.randomString(8).toLowerCase());
	//email.sendKeys(GenerateRandomData.randomString(8).concat("@gmail.com"));
	Thread.sleep(5000);
	fname.clear();
	//lname.clear();
	//email.clear();
	}
	
	driver.close();
	driver.quit();
	}	
	

}
