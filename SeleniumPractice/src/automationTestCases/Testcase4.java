package automationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {
	static int i;
	static String username,password,iteration;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Test steps:
i) Launch the Browser
ii) Navigate to gcrShop Admin Interface (http://www.gcrit.com/build3/admin/)
iii) Enter valid "User name"
iv) Enter Valid "Password"
v) Click "Login" Button
---------------
* Repeat the navigation with Invalid User Name and / or Password

Verification points:
i) Capture the url and compare with expected.
Expected: http://www.gcrit.com/build3/admin/index.php

Test Data:
User name = admin
Password = admin@123
		 * ii) Capture the Error message and compare with expected:
Expected =Error: Invalid administrator login attempt.

Test Data: 
User name = admina
Password = admin@123a
(Invalid User name and Invalid Password)

Other Negative Scenarios:

1) Valid User name and Invalid Password
2) Invalid user Name and Valid Password
3) Blank User name and Valid Password/Invalid Password
4) Valid / Invalid User name and Blank password
5) Blank User name and Blank password
		 
		 */
	
	
		
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 for(i=1;i<=2;i++)
 {
	 if(i==1)
	 {
		 username = "admin";
		 password = "admin@123";
		 iteration = "Iteration1";
		 	 
		
	 }
	 else if (i==2)
	 {
		 username = "admina";
		 password = "admin@123";
		 iteration = "Iteration2";
	 }
 
 driver.get("http://www.gcrit.com/build3/admin/login.php");
 driver.findElement(By.name("username")).sendKeys(username);
 driver.findElement(By.name("password")).sendKeys(password);
 driver.findElement(By.id("tdb1")).click();
 String url = driver.getCurrentUrl(); 
 if (url.contains("http://www.gcrit.com/build3/admin/index.php")){
	 System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Admin Login Successful -Passed");
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Logoff")).click();
	}
 else if (! url.contains("http://www.gcrit.com/build3/admin/index.php")){
	 String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
	 if (ErrorMessage.contains("Invalid administrator login attempt.")){
	 System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Handling Invalid Inputs -Passed");
	 }
	 else {
		 System.out.println(iteration +  "- Failed");
		 }
 }
	}
}
}
 


