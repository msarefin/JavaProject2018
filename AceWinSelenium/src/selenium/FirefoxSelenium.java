package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yahoo.com");
		try {
			driver.wait(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
