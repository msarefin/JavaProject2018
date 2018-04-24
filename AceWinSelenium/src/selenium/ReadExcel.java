package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

//	This is to read the excel form the file
	
	public static void main (String[] args) {
		
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
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		
		
		
	}
}
