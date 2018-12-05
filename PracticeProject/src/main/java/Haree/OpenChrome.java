package Haree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SURESH\\SW\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximaze Window
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		driver.get("http://selenium4testing.com/hms/");

//Browser Commands		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().to("https://www.callhealth.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		// Open and Close
		driver.close();

	}

}
