package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMultiWebBrowser {

	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		
		WebDriver f = new FirefoxDriver();
		WebDriver c = new ChromeDriver();
		
		f.get("http://www.wikipedia.com");
		f.wait(5000);
		f.close();
		f.wait(5000);
		
		c.get("http://www.cnn.com");
		c.wait(5000);
		c.close();
		
		System.out.println("Test Complete");
		
	}
}
