package QA;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WorkingWithGrid {

	public static void main (String[] args) throws MalformedURLException, InterruptedException {
		
		String os, address, url, title;

		address = "https://www.rediff.com/";

//		os = System.getProperty("os.name").toLowerCase();
//
//		if (os.contains("mac")) {
//			System.out.println("Test Running from MAC");
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
//		} else if (os.contains("windows")) {
//			System.out.println("Test Running from Windows");
//			System.setProperty("webdriver.chrome.driver",
//					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
//		} else {
//			System.out.println("Test Running from Linux");	
//		}
		
	
		
		DesiredCapabilities cap = new DesiredCapabilities(); 
		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
				
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.138.1:4444/wd/hub"),cap);
		
		driver.get(address);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
				
		driver.quit();
		
	}
	
}
