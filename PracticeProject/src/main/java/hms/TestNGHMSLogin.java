package hms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generalTestCase.GetValues;
import utilities.Reports;

public class TestNGHMSLogin extends Reports {
	
	
	@BeforeTest(alwaysRun=true)
	@Parameters("browser")
	public void initBrowser(String browserName) {
		
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		default:
			System.out.println("Please select valid browser");
			break;
		}
		
	}

	@BeforeMethod(alwaysRun=true)
	public void startUp() {
	
		// Maximize browser
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
	}
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
		
		driver.close();
		
	}
	
	@Test(priority=1)
	public void addition() {
		
		driver.get("https://www.google.co.in");
	}

	@Test(priority=0,groups="Smoke")
	public void hmsLogin() {

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("password")).sendKeys("admin");

		String beforeTitle = driver.getTitle();

		driver.findElement(By.name("submit")).click();

		WebElement home = driver.findElement(By.xpath("//div[@class='box']/p/strong"));

		String welcome = home.getText();

		System.out.println(welcome);

		if ((welcome.equals(GetValues.getValue("hms.home")))) {

			System.out.println("User Credentials are  Working");
		}

		String afterTitle = driver.getTitle();

		if (beforeTitle.equals(afterTitle)) {

			System.out.println("User Credentials are Not Working");
		} else {

			System.out.println("User Credentials are  Working");
		}

		driver.findElement(By.linkText("Registration")).click();

		WebElement patient = driver.findElement(By.name("PATIENT_CAT"));
		Select select = new Select(patient);
		select.selectByVisibleText("Insurance");

		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	}

}
