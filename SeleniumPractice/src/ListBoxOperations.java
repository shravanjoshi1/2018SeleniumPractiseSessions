import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxOperations {

	 public static Boolean Mobject1;
	public static void main(String[] args) {
		
		
	try {
		//Set Browser Path	
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
			
		//Create Browser instance
			WebDriver fbapp =new ChromeDriver();
			
		//Open Application
			fbapp.get("http://www.facebook.com");
			
		//Maximize the Window
			fbapp.manage().window().maximize();
			
			Thread.sleep(2000);
			
			// List Boxes category count
			
			int ListBoxCount = fbapp.findElements(By.xpath("//select")).size();
			System.out.println(ListBoxCount);
			
			//List Boxes count 2nd Method
			
			int ListCount = fbapp.findElements(By.tagName("select")).size();
			System.out.println(ListCount);
			
			//Identify the Month object
			
			WebElement Mobject = fbapp.findElement(By.id("month"));
			
			//Month object exist or not
			
			
			//Month object enabled or not
			
			 Mobject1 = fbapp.findElement(By.id("month")).isEnabled();
			 if(Mobject1 == true)
			 {
			  System.out.println("Month Object is enabaled");
			 }
			 else
			 {
				 System.out.println("Month object is not enabled");
				 
			 }
			
			
			//Capture Month Data
			
			String Mdata = Mobject.getText();
			System.out.println(Mdata);
			
			//Count List box items
			
			int MonthItemcounts = fbapp.findElements(By.xpath("//select[@id='month']/option")).size();
			System.out.println(MonthItemcounts);
			
			//WebElement convert to select category
			
			Select MSelect = new Select(Mobject);
			
			//Store all list items into List
			
			List<WebElement> Mymonthitems = MSelect.getOptions();
			
			//Count
			
			System.out.println(Mymonthitems.size());
			
			
			//Select by Specific visible text
			
			MSelect.selectByVisibleText("Aug");
			Thread.sleep(5000);
			
			//Select by specific value
			
			MSelect.selectByValue("12");
			
			Thread.sleep(5000);
			
			//Select by specific index
			
			MSelect.selectByIndex(4);
			
			Thread.sleep(5000);
			
			//Define random number
			
			Random myRan = new Random();
			int x = myRan.nextInt(Mymonthitems.size()-1);
			System.out.println(x);
			MSelect.selectByIndex(x);
			Thread.sleep(5000);
			//Select one by one
			
			for(int i=0; i<Mymonthitems.size();i++)
			{
				MSelect.selectByIndex(i);
				Thread.sleep(1000);
				
				//Capture Month Label
			
				String MLabel = Mymonthitems.get(i).getAttribute("label");
				System.out.println(MLabel);
				
				//Capture Month Value
				
				String MValue = Mymonthitems.get(i).getAttribute("value");
				System.out.println(MValue);
				
				//Capture Month Value
				String MValue2 = Mobject.getAttribute("value");
				System.out.println(MValue2);
				
				
			}
			
			
			
			
			
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
