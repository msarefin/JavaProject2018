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
	public void sam(String Browser) {
		System.out.println("You are using " + Browser);
	}
	
	@Test(priority = 2)
	@Parameters({"browser"})
	public void browsers(String browsername) {
		
		System.out.println(browsername);
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.out.println("You have selected " + browsername);
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Aney\\Documents\\JavaProject2018\\mTestNG\\Drivers\\Windows\\chromedriver.exe");
			
//			driver = new ChromeDriver();
			
		}
		else {
			System.out.println("You have not selected chrome");
		}
		
		driver.manage().window().maximize();
		driver.get("www.yahoo.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
}
