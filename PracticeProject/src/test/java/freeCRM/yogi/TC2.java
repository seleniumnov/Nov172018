package freeCRM.yogi;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("jagadeesh232708");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("jagadeeshjaggu");
		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[@title='Companies']"));
		action.moveToElement(we).build().perform();
		List<WebElement>  searchelements=driver.findElements(By.xpath("//div[@id='navmenu']/ul/li[3]/ul/li"));
		
		for(int i=0;i<searchelements.size();i++)
		{
			String txt = searchelements.get(i).getText();
			 System.out.println(txt);
			 if(txt.equals("New Company"))
			 {
				 searchelements.get(i).click();
				 break;
			 }
			 	
		}
		List<WebElement> menuItems=driver.findElements(By.xpath("//input[@value='?']"));
		for(int j=0;j<menuItems.size();j++)
		{
			String homepage=driver.getWindowHandle();
//			System.out.println(homepage);
			menuItems.get(j).click();
			Set<String> windows=driver.getWindowHandles();
		    System.out.println(windows.size());
		    Iterator iterator=windows.iterator();
		    String currentwindowid;
		    while(iterator.hasNext())
		    {
		    	currentwindowid=iterator.next().toString();
		    	if(!currentwindowid.equals(homepage))
				{
		    		driver.switchTo().window(currentwindowid);
		    		System.out.println(currentwindowid);
		    		//driver.close();
		    		driver.manage().window().maximize();
		    		String title = driver.getTitle();
		    		System.out.println(title);
		    		String name=driver.findElement(By.xpath("//td[@class='datacardtitle']//span")).getText();
		    		
		    		//searchtxt.sendKeys("test");
		    		 String txt12= driver.findElement(By.xpath("//*[contains(text(),'"+name+"')]/following::td[2]")).getText();
    				 System.out.println(txt12);
    				 driver.close();
		    		 //String txt11= driver.findElement(By.xpath("//*[contains(text(),'"+txt1+"')]/following::p[1]")).getText();
    				 //System.out.println(txt11);		    		
				}
		    }
			driver.switchTo().window(homepage);		 
			 	
		}

	}

}
