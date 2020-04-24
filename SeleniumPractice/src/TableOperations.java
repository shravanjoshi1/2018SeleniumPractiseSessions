import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/SeleniumSoftwares/mytable.html");
		driver.manage().window().maximize();

		// Get table count
		
		System.out.println(driver.findElements(By.xpath("//table")).size());
		
		//Get table row count
		System.out.println(driver.findElements(By.xpath("//tr")).size());
		//Get table column count
		System.out.println(driver.findElements(By.xpath("//td")).size());
		
		//Specific table row count
		
		int rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println(rows);
		
		//specific table column count
		
		int columns = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).size();
		System.out.println(columns);
		
		//Capture specific cell data
		
		//Identify the cell
		
		 WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]"));
		 
		 //Capture Data
		 String celldata = cell.getText();
		 System.out.println(celldata);
		 
		 //Capture each and every cell data
		
		for(int i =1; i<= rows ;i++)
		{
			for(int j =2;j<=columns;j++)
			{
				//Identify the general cell
				
				WebElement mycell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
				
				//capture data
				String mycelldata = mycell.getText();
				System.out.println(mycelldata);
			}
		}

		String X = "";
		for(int i =1; i<= rows ;i++)
		{

			
			for(int j =2;j<=columns;j++)
			{
				//Identify the general cell
				
				WebElement mycell1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
				
				//capture data
				String mycelldata1 = mycell1.getText();
				 X= X +mycelldata1;
				//System.out.println(mycelldata);
			}
			System.out.println(X);
			X= "";
		}
		
		
		
		//Counting number of checkboxes
		int inputCount = driver.findElements(By.xpath("//input")).size();
		System.out.println(inputCount);
		
		//Clicking the checkbox
		driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]/input[1]")).click();
		
		//Clicking all checkboxes
		
	/*	List<WebElement> checkbox = driver.findElements(By.xpath("//input[type='checkbox']"));
		for(WebElement el : checkbox){
		    if(!el.isSelected()) // validate if checked
		        el.click();
		}*/
		
	//	Row based check count
	 for(int i=0 ; i<= rows; i++)
	 {
	int rows1= driver.findElements(By.xpath("//tr["+i+"]/td[1]/input")).size();
	System.out.println(rows1);
//int rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
	  		
	 }
	 
		
		/*size count below 100kb less than 100kb*/
	 
	for(int i=2; i<=rows;i++)
	{
		//Identify the size of the cell
		
		WebElement sizecell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[5]"));
		
		//Capture the Data
		String SizeData = sizecell.getText();
		System.out.println(SizeData);
		
		//Split the Data
		
		String[] Data = SizeData.split("kb");
		System.out.println(Data[0]);
		//System.out.println(Data[1]);
		
				
	}
	String xyz = "        This    is    my    sample   program          ";
	System.out.println(xyz);
	System.out.println(xyz.trim());
	
	 		
		Thread.sleep(5000);
		driver.close();
		driver.quit();

		
	}

}

