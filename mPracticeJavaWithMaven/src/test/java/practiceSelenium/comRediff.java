package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class comRediff {

	public static void main(String[] args) {
		
		String os, address, url, title; 
		
		address = "http://www.rediff.com/";
		
		os = System.getProperty("os.name").toLowerCase();
		
		if(os.contains("mac")) {
			System.out.println("Test running from MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/Mac/chromedriver");
		}else if(os.contains("windows")) {
			System.out.println("Test running from windows");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\windows\\chromedriver.exe");
		}
		else {
			System.out.println("Test running from Linux");
		}
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		url = driver.getCurrentUrl();
		title = driver.getTitle(); 
		
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println(size);
		
		driver.quit();
		
	}
	
}
