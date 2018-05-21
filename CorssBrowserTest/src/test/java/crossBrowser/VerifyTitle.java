package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver; 
	
	
	@Test
	@Parameters("Browser")
	public void verifyTitle(String browsername) {
		
		if(browsername.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\mTestNG\\Drivers\\Windows\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
	
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.quit();
		
	}
	
}
