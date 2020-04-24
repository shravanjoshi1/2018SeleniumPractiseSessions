import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonNavigate {
	public static boolean ItemObject;
	
	WebDriver driver;
	
	public void InvokeBrowser() throws NoSuchElementException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Desktop\\\\SeleniumSoftwares\\\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		getCommands();
		
	}
	public void getCommands() throws  NoSuchElementException {
		try {
			driver.get("http://www.amazon.in");
			String TitleofPage = driver.getTitle();
			System.out.println("The title of the Page" +TitleofPage);
			
			WebElement E1 =driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]/span"));
			Thread.sleep(2000);
					
					//className("nav-icon nav-arrow"));
			WebElement E2 = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[10]/span"));
			Thread.sleep(2000);
			WebElement E3 = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[10]/div[1]/div/a[1]/span"));
			
			
			Actions myact = new Actions(driver);
			//myact.moveToElement(E1).moveToElement(E2).moveToElement(E3).click().build().perform();
			myact
					.moveToElement(E1)
					.moveToElement(E2)
					.moveToElement(E3)
				.click().build().perform();
					
			Thread.sleep(10000);
			
			driver.navigate().back();
			driver.getCurrentUrl();
		
			
             WebElement ItemObject = driver.findElement(By.id("searchDropdownBox"));
              String ItemData = ItemObject.getText();
               System.out.println(ItemData);
		

Select ItemSelect = new Select(ItemObject);

List<WebElement> MySearchitems = ItemSelect.getOptions();
System.out.println(MySearchitems.size());
		}

/*for(int i=0;i>=MySearchitems.size();i++)
{
	ItemSelect.selectByIndex(i);
	
	String SearchLabel = MySearchitems.get(i).getAttribute("label");
	System.out.println(SearchLabel);
}*/
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
	}
	
	
	public static void main(String[] args) throws NoSuchElementException  {
		
		AmazonNavigate myObj = new AmazonNavigate();
        myObj.InvokeBrowser();
        
				
		

	}

}
