package hms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("admin");
		
		String beforeTitle = driver.getTitle();
		
		driver.findElement(By.name("submit")).click();
		
		WebElement home = driver.findElement(By.xpath("//div[@class='box']/p/strong"));
		
		String welcome = home.getText();
		
		System.out.println(welcome);

		if ((welcome.equals("About Application: "))) {
			
			System.out.println("User Credentials are  Working");
		}
		
		String afterTitle = driver.getTitle();
		
		if (beforeTitle.equals(afterTitle)) {
			
			System.out.println("User Credentials are Not Working");
		}else {
			
			System.out.println("User Credentials are  Working");
		}
		
		driver.findElement(By.linkText("Registration")).click();
		
		
		WebElement patient = driver.findElement(By.name("PATIENT_CAT"));	
		Select select = new Select(patient);	
		select.selectByVisibleText("Insurance");
		
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		
		
			
			

	}

}
