package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel {

	public static void main(String [] args) {
		
<<<<<<< HEAD
		System.getProperty("webdriver.gecko.driver", "/Users/sunny/Documents/JavaProject2018/MacSelenium/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
=======
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress, url, PageTitle;
		webaddress = "http://www.facebook.com";
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			System.out.println("You are arunning a Mac Machine");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			System.out.println("You are running a Windows Machine");
		} else {
			System.out.println("You are using linux");
		}

		WebDriver driver = new ChromeDriver();
>>>>>>> 25641de295baaf89418e07855f7ab7291ac7cdfc
		driver.get("http://www.rediff.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
	}
	
}
