package Selenium.cGreatCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Lib;

public class driverVerify extends Lib {

	public static void main(String[] args) {
		WebDriverSelectorByOS();

		WebDriver driver; 
		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.close();
	}
	
	

}
