package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main (String[] args) {
		
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://toolsqa.com/automation-practice-switch-windows/";
		
		

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
		System.out.println("Chrome Browser Launched");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		String win1 = driver.getWindowHandle(); //Gets the current windows handle code
		System.out.println(win1);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(.,'New Browser Tab')]")).click();
		
		Set <String> wins = driver.getWindowHandles(); // Gets all window handle codes
		System.out.println(wins);
		
//		window handles are neither url nor Page Titles
		
		for(String winn: wins) {
			if(!winn.equals(win1)) { // compares all window handles
				driver.switchTo().window(winn);
			}
		}
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
