package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yahoo.com");
		driver.close();
	}

}
