package Anusha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class freeCRM {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a [contains(text(), 'Sign Up')]")).click();
		Thread.sleep(3000);
		Select plantype = new Select(driver.findElement(By.xpath("//select[@id = 'payment_plan_id']")));
		plantype.selectByVisibleText("CRMPRO - $29.95 user/mo.");
		driver.findElement(By.xpath("//input[@name ='first_name']")).sendKeys("anusha");
		driver.findElement(By.xpath("//input[@name ='surname']")).sendKeys("vutukuru");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("anushav11@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'email_confirm']")).sendKeys("anushav11@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("anushav");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name = 'passwordconfirm']")).sendKeys("password");
		//Thread.sleep(3000);
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'agreeTerms']")).click();
		//driver.findElement(By.xpath("//input[contains(text() ,'SUBMIT')]")).click();
		driver.findElement(By.xpath("//button[@name ='submitButton']")).click();
	}
	
	

}
