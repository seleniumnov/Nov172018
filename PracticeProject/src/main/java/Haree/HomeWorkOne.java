package Haree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SURESH\\SW\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// open any application
		driver.get("https://www.freecrm.com");

		// Maximize browser
		driver.manage().window().maximize();

		// driver.get("https://www.google.com");

		driver.findElement(By.linkText("Sign Up")).click();
		// System.out.println("Site opened");

		WebElement ele = driver.findElement(By.name("payment_plan_id"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Free Edition");

		// new
		// Select(driver.findElement(By.name("payment_plan_id"))).selectByVisibleText("Free Edition");
		
		// First Name
		driver.findElement(By.name("first_name")).sendKeys("Selenium");
		// Last Name
		driver.findElement(By.name("surname")).sendKeys("HomeWork");
		// Email
		driver.findElement(By.name("email")).sendKeys("shvkumar@gmail.com");
		// Confirm Email
		driver.findElement(By.name("email_confirm")).sendKeys("shvkumar@gmail.com");
		// username
		driver.findElement(By.name("username")).sendKeys("Selenium");
		// password
		driver.findElement(By.name("password")).sendKeys("Password1");
		// confirm password
		driver.findElement(By.name("passwordconfirm")).sendKeys("Password1");
		// check box
		driver.findElement(By.name("agreeTerms")).click();
		// submit
		driver.findElement(By.name("submitButton")).click();

		//driver.close();
	}
}