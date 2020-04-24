package automationTestCases;

import org.openqa.selenium.By;

public class TestCase6 extends CustomMethods {

public void Signout() {
	driver.findElement(By.linkText("Logoff")).click();
}
		

	public static void main(String[] args)throws Exception {
	
	TestCase6 obj1 = new TestCase6();
	obj1.LaunchBrowser();
	obj1.adminLogin();
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
	obj1.Signout();
	Thread.sleep(5000);
	obj1.closeBrowser();

	}

}