package Haree;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\SURESH\\SW\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// open any application
		driver.get("https://www.google.com");

		// driver.manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(10);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize browser
		driver.manage().window().maximize();

		// driver.get("https://www.google.com");
		// Click on gmail
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();

		// Sign Up Link
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		//Thread.sleep(1000);

		// username

		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("userhari30");
		// Click Next

		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);

		// Password
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Enfield@6683");
		
		//Click on Next
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//Checking the check box
		driver.findElement(By.xpath("//div[@role='checkbox']")).click();
		
		//Clicking delete icon
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA T-I-Zf-aw2']")).click();
		
		//Signout
		
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		
		
		
	}
}
