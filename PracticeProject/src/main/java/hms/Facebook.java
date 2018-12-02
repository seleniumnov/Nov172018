package hms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import webpages.FBHomePage;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		FBHomePage home = PageFactory.initElements(driver, FBHomePage.class);
		
		home.userName.sendKeys("Selenium");
		home.passWord.click();
		
	}

}
