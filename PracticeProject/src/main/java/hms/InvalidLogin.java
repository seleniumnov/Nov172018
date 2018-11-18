package hms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("admin1");
				
		driver.findElement(By.name("submit")).click();
		
		Alert xyz = driver.switchTo().alert();
		
		xyz.accept();
		
		//driver.switchTo().alert().accept();

	}

}
