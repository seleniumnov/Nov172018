package Haree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {

			System.setProperty("webdriver.gecko.driver", "D:\\SURESH\\SW\\Browsers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
		}

	}


