package generalTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUsingAutoIT {
	
	public static void useAutoIT(String path) {
		
		try {
			Runtime.getRuntime().exec(path);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Registration")).click();
		
		driver.findElement(By.name("image")).click();
		try {
			Thread.sleep(2000);
			useAutoIT("");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
