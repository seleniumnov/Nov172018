package free.CRM;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Login {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("jagadeesh232708");
		
		driver.findElement(By.name("password")).sendKeys("jagadeeshjaggu");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
		
		WebElement search = driver.findElement(By.name("search"));
		
		String searchValue = search.getAttribute("value");	
		System.out.println(searchValue);
		
		Actions action = new Actions(driver);
		
		WebElement deals = driver.findElement(By.xpath("//a[@title='Deals']"));
		
		action.moveToElement(deals).build().perform();
		
		// Taking screen shot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Fn+Prt Sc
		
		FileHandler.copy(source, new File("./ScreenShots/test.png"));
		
		
		
		
		
		

	}

}
