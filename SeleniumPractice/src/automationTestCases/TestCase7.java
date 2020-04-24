package automationTestCases;

import org.openqa.selenium.By;

public class TestCase7 extends CustomMethods {
	
	//Validating the admin login with invalid inputs
	
	

	public static void main(String[] args) {
		
		TestCase7 obj2 = new TestCase7();
		obj2.LaunchBrowser();
		obj2.adminLogin("admina", "admin@123a");
		String ErrorMsg = driver.findElement(By.className("messageStackError")).getText();
		if(ErrorMsg.contains("Error: Invalid administrator login attempt.")== true)
		{
			System.out.println("Handling invalid inputs - Passed");
		}
		else
		{
			System.out.println("Handling invalid inputs - Failed");
	}
obj2.closeBrowser();
}
}