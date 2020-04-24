package automationTestCases;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataWriteInNP {
	
	public void clearFile() throws IOException
	{
		FileWriter Fwob = new FileWriter("Filename", false);
		PrintWriter PWob = new PrintWriter(Fwob, false);
		PWob.flush();
		PWob.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//Excel File Location
		String Filename = "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\NPWriter.txt";

		 
			
		 String url = driver.getCurrentUrl();
		 
		 if((url.equalsIgnoreCase("https://www.facebook.com/"))== true)
		 {
			NotepadUDF.FnWriteinNP(Filename, "Facebook is displayed");
		 }
		 
		 else
		 {
			 NotepadUDF.FnWriteinNP(Filename, "Facebook is  not displayed");
		 }
		 
	WebElement fname=	driver.findElement(By.name("firstname"));
	
	//FirstName Checking
	
	if(fname.isDisplayed()==true)
	{
		System.out.println("First Name should be displayed");
		NotepadUDF.FnWriteinNP(Filename, "Firstname  is displayed");
		
	}
	else
	{
		NotepadUDF.FnWriteinNP(Filename, "Firstname  is not displayed");
	}
	
	//LastName Checking
	
	WebElement lname = driver.findElement(By.name("lastname"));
	if(lname.isDisplayed()== true)
	{
System.out.println("Last Name should be displayed");
		
NotepadUDF.FnWriteinNP(Filename, "Lastname  is displayed");
		
	}
	else
	{
		NotepadUDF.FnWriteinNP(Filename, "Lastname  is not displayed");
	}
	
	}

}
