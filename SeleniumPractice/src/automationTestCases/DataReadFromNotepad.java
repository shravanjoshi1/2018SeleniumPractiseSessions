package automationTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.sun.xml.internal.fastinfoset.util.StringArray;

public class DataReadFromNotepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		// Clear Excel Sheet Data
		String Filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\NPData.txt";
				
		// Excel File Location
		
	// Checking URL

		String url = driver.getCurrentUrl();
   
		
		//Data Read from notepad
		
		String NPmydata = NotepadUDF.FnReadfromNP(Filename);
		System.out.println(NPmydata);
		
		//Split the Data
		
		String[] splitdata = NPmydata.split(",");
		
	
		// Checking FirstName

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys(splitdata[0]);
		//lastname
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys(splitdata[1]);
		
		// Homework: Split data word based example 
		
	/*	Shravan
		Joshi
		Email
		Pswrd
*/
	// Data Append	
		
	}

}
