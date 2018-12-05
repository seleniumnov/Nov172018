package Anil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTC {
	public static void main(String[] args) throws Exception {
		//setting chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Anil\\drivers\\chromedriver.exe");
		
		//initiate chrome driver
		WebDriver driver=new ChromeDriver();
		
		//navigating to URL
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//clicking on gmail
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//clicking on sign up
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		//entering email
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("associateuser1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//clicking on next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//entering password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("callhealth");
		
		//click on next button
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(2000);
		
		//clicking the checkboxes
		driver.findElement(By.xpath("//div[@role='checkbox'][1]")).click();
		
		driver.findElement(By.xpath("(//div[@role='checkbox'])[4]")).click();
		Thread.sleep(2000);
		
		//click on delete Icon
		driver.findElement(By.xpath("(//div[@class='asa'])[3]")).click();
		
		//clicking on logout
		driver.findElement(By.xpath("//a[@role='button']/span")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		//Quit browser
		driver.quit();
	}
	

}
