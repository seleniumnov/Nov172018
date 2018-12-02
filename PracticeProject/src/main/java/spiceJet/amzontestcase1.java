package spiceJet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzontestcase1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.xpath("ul[@class='autoFill']/li[1]"));
		Actions action = new Actions(driver);
		/*
		WebElement we = driver.findElement(By.xpath("//div[@id='nav-tools']/a[1]"));
		action.moveToElement(we).build().perform();*/
		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com/");
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		//FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		//Thread.sleep(5000);
		//div[@id='nav-flyout-shopAll']/div[2]/span[8]
		//span[contains(text(),'Echo & Alexa')]
		//Actions action = new Actions(driver);
		//builder.MoveToElement(menu).MoveToElement(submenu).Click().Perform();
		WebElement web = driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		WebElement web1=driver.findElement(By.xpath("//span[contains(text(),'TV, Appliances, Electronics')]"));
		//action.moveToElement(web.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[1]"))).build().perform();
		//action.moveToElement(web).moveToElement(Web1).build().perform();
		action.moveToElement(web).build().perform();
		Thread.sleep(2000);
		action.moveToElement(web1).build().perform();
		Thread.sleep(2000);
		WebElement web2=driver.findElement(By.xpath("//span[contains(text(),'DSLR Cameras')]"));
		web2.click();
		//moveToElement(webdriver.findElement(By.xpath("/expression-here"))).click().build().perform();
		//WebElement web1=driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[1]"));
		//action.moveToElement(web1).build().perform();
	}

}
