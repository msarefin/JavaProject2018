package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Capabilities;

public class HandelingSSLCerts {

	public static void main(String[] args) {

		String os, address, url, title;

		address = "https://www.cacert.com/";

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.out.println("Test Running from MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.out.println("Test Running from Windows");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("Test Running from Linux");
		}
		
		DesiredCapabilities ch = DesiredCapabilities.chrome(); 
		ch.acceptInsecureCerts();
//		------------------------
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("disable-infobars");
		c.setAcceptInsecureCerts(true);
//		------------------------
		WebDriver driver = new ChromeDriver(c);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl();
		title = driver.getTitle();
		
	}
}
