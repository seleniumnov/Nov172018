package Haree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class FirefoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\SURESH\\SW\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
