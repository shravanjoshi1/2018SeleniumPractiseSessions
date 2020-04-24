package automationTestCases;

import org.openqa.selenium.By;

public class TestCase8 extends CustomMethods {
	public void Signout() {
		driver.findElement(By.linkText("Logoff")).click();
	}

	

	public static void main(String[] args)throws Exception {
		//Executing Multiple testcases
		TestCase8 obj3 = new TestCase8();
		obj3.LaunchBrowser();
		obj3.adminLogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		Thread.sleep(5000);
		obj3.closeBrowser();
		
		obj3.LaunchBrowser();
		obj3.adminLogin();
		String url = driver.getCurrentUrl();
		System.out.println(url);

		if(url.equals("http://www.gcrit.com/build3/admin/index.php")==true) {
			
			String abc = driver.getTitle();
			System.out.println(abc);
		System.out.println("Admin Login Successful - Test Case Passed");	
			
		}
		
		else
		{
			System.out.println("Admin Login Unsuccefful - Test Case Failed");
		}
		Thread.sleep(5000);
		obj3.Signout();
		Thread.sleep(5000);
		obj3.closeBrowser();
		obj3.LaunchBrowser();
		obj3.adminLogin("admina", "admin@123a");
		String ErrorMsg = driver.findElement(By.className("messageStackError")).getText();
		if(ErrorMsg.contains("Error: Invalid administrator login attempt.")== true)
		{
			System.out.println("Handling invalid inputs - Passed");
		}
		else
		{
			System.out.println("Handling invalid inputs - Failed");
	}
obj3.closeBrowser();

	}

}
