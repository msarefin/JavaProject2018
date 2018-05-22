package TestNGTesting;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WhiteBox {

	WebDriver driver;
	
	@Test(priority=2,description="launching the chrome browser")
	@Parameters("browser")
	public void launch(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\Windows\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("http://www.rediff.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println(driver.getTitle());
			
			driver.manage().deleteAllCookies();
			driver.quit();
			
		}
		
		
	}
}
