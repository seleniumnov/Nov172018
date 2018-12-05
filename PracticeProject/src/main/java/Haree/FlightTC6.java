package Haree;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightTC6 {
	public static void main(String[] args) throws Exception {
		//setting chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\SURESH\\SW\\Browsers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\SURESH\\SW\\Browsers\\chromedriver.exe\");
		
		//initiate chrome driver
		WebDriver driver=new ChromeDriver();
		
		//navigating to URL
		driver.get("https://www.irctc.co.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//click on flights link
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
	}

}
