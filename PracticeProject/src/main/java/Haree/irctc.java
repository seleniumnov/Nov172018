package Haree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SURESH\\SW\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// open any application
		driver.get("https://www.irctc.co.in");
		Thread.sleep(1000);

		// Maximize browser
		driver.manage().window().maximize();

		// From
		driver.findElement(By.xpath(
				"//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"))
				.sendKeys("SECUNDERABAD JN - SC");
		// To
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("VIJAYAWADA JN - BZA");
		
//All Classes
		new Select(driver.findElement(By.xpath("//option[@class='ng-tns-c13-7 ng-star-inserted']")))
				.selectByVisibleText("AC First Class (1A) ");
		
		// Search by Trains
				driver.findElement(By.xpath("//button[@class='search_btn']")).click();
		
	}

}
