package corssBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"browser"})
	public void sam(String browser) {
		System.out.println("Test1 /n");
		System.out.println("You are using " + browser);
	}
	
	@Test(priority = 2)
	@Parameters({"browser"})
	public void browsers(String browser) {
		
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("You have selected " + browser);
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Aney\\Documents\\JavaProject2018\\mTestNG\\Drivers\\Windows\\chromedriver.exe");
			
			System.out.println("chrome driver location set! ");
			
			driver = new ChromeDriver();
			
			// Fialed here while running from xml 
			
			System.out.println("chrome launched");
		}
		else {
			System.out.println("You have not selected chrome");
		}
		
		driver.manage().window().maximize();
		driver.get("www.yahoo.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Test1 /n");
	}
	
	
}
