package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "https://www.toolsqa.wpengine.com/";
		
		

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

//		Refresh browser in the following ways
		
		driver.navigate().refresh(); //Refresh keyword
		Thread.sleep(1000);
		
		driver.findElement(By.name("s")).sendKeys(Keys.F5); // sending F5 key
		Thread.sleep(1000);
		
		driver.get(driver.getCurrentUrl()); //using get command pointing to the current URL
		Thread.sleep(1000);
		
		driver.navigate().to(driver.getCurrentUrl()); // Navigating to the current URL using the 'to' keyword
		Thread.sleep(1000);
		
		driver.findElement(By.name("s")).sendKeys("\uE035"); // using an ASCII key 
		Thread.sleep(1000);
		
		driver.quit();
		
	}
}
