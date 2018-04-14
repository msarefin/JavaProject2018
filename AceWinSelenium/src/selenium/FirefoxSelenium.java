package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yahoo.com");
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.wait();
		driver.close();
	}

}
