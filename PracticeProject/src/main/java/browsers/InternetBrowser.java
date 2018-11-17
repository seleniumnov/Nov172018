package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Softwares\\IEDriverServer.exe");
		
		// Setting - zoom size must be set to 100%
		
		/*Protected Mode settings are not the same for all zones. 
		Enable Protected Mode must be set to the same value (enabled or disabled) for all zones.
		*/
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.close();

	}

}
