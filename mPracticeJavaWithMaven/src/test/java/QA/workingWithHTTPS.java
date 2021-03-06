package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Capabilities;

public class workingWithHTTPS {

	public static void main(String[] args) throws InterruptedException {

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

		// OR

		ch.setAcceptInsecureCerts(true);

		// OR

		// You can accept either insecure certificates

		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		// You can accept SSL certificates

		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		// Works only in selenium versiosn before 3.6
		WebDriver driver = new ChromeDriver(c);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl();
		title = driver.getTitle();
		Thread.sleep(5000);

		driver.quit();

	}
}
