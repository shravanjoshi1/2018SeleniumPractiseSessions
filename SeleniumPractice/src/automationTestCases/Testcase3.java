package automationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) {
		
	//Check Admin Login functionality in gcrShop web portal (Positive test case)
	//Check Error Messages in Admin Login Functionality (Negative Test case)
	//Check Admin Login functionality with valid and invalid inputs( positive and negative)
	
	/*Test Steps	
	 * Launch the browser
	 * Navigate to gcrAdmin portal
	 * enter valid UserName
	 * enter valid password
	 * click login
	 * validation point, capture url and compare with expected
	 * test data
	 * username:
	 * password:*/
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.gcrit.com/build3/admin/login.php");
     driver.findElement(By.name("username")).sendKeys("admina");
     driver.findElement(By.name("password")).sendKeys("admin@123");
     driver.findElement(By.id("tdb1")).click();
     String Url = driver.getCurrentUrl();
     if(Url.equals("http://www.gcrit.com/build3/admin/index.php")== true)
     {
    	 System.out.println("You have successfully logged in as admin - Passed");
     }
     else
     {
    	 System.out.println("Username and password mismatch - Failed");
     }
    
    
    
	}

}
