package Test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static WebDriver driver; 
	
	@BeforeClass
	public static void initialize() {
		System.out.println("Browser initializing");
		String os, address;
		
		address = "http://store.demoqa.com/";

		os = System.getProperty("os.name").toLowerCase(); 
		
		if(os.contains("mac")) {
			System.out.println("Project Running on MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/Mac/chromedriver");
		}
		else if(os.contains("windows")){
			System.out.println("Project running on Windows");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\Windows\\chromedriver.exe");
		}
		else {
			System.out.println("Project Running on Linux");
		}
		
		driver =new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	
	@org.junit.Test
	
	
	@AfterClass
	public static void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit(); 
		System.out.println("Test was completed Successfully!");
		
		System.out.println("---------------------- Test Completed ----------------------");
	}
	
}
