package automationTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class MultipleDataWriteinExcel {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException,
			InterruptedException, FilloException {
          //Instatntiate the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		// Clear Excel Sheet Data
		String filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\Data.xls";
		String SheetName = "Sheet4";
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\User\\Desktop\\SeleniumSoftwares\\Data.xls");
		String StrQuery = "Delete from Sheet4";
		connection.executeUpdate(StrQuery);
		
		
		// Excel File Location
		

		// Checking URL

		String url = driver.getCurrentUrl();

		if ((url.equalsIgnoreCase("https://www.facebook.com/")) == true) {
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "Open Application", "Open Facebook",
					"Facebook Home Page Displayed", "Facebook Displayed", "Passed");

		}

		else {
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "Open Application", "Open Facebook",
					"Facebook Home Page Displayed", "Facebook  NotDisplayed", "Failed");
		}
		// Checking FirstName

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Shravan");

		if ((fname.isDisplayed()) == true) {

			// System.out.println(fname);
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "Checking FirstName", "First Name is displayed",
					"FirstName should be populated", "Shravan", "Passed");
		}

		else {
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "Checking FirstName", "First Name is displayed",
					"FirstName should be populated", "Blank", "Failed");
		}

		// Checking LastName

		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("joshi");

		if ((lname.isDisplayed()) == true) {

			// System.out.println(lname);
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "Checking LastName", "Last Name is displayed",
					"LastName should be populated", "Shravan", "Passed");
		}

		else {
			ExcelUDF.FnMultipleCellsExcel(filename, SheetName, "Checking LastName", "Last Name is displayed",
					"LastName should be populated", "Blank", "Failed");
		}

		Thread.sleep(5000);

		driver.close();

	}

}
