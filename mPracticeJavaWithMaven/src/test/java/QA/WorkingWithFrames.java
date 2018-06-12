package QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main (String[] args) {
		
		String os, address, url;

		address = "http://toolsqa.com/iframe-practice-page/";

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

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get(address);
		
		int size = driver.findElements(By.cssSelector("iFrame")).size();
		
		System.out.println("There are "+ size + " iframes ");
		
		driver.switchTo().parentFrame();
		
		driver.quit();
		
	}
}
