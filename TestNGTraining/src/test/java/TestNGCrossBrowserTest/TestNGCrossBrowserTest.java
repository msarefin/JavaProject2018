package TestNGCrossBrowserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGCrossBrowserTest {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browserSelect(String SelectedBrowser) throws InterruptedException {
		
		if(SelectedBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\Windows\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
			
		}else {
			
			System.out.println("You are not running chrome!");
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
