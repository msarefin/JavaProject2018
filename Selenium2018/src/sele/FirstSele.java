package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSele {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\Selenium2018\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yahoo.com");
		
		System.out.println("Successfully Opened Firefox Browser");
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
