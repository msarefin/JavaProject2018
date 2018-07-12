package QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {
		
		String os, address, url, title;

		address = "http://www.facebook.com";

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.out.println("Test Running from MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.out.println("Test Running from Windows");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("Test Running from Linux");
		}
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		title = driver.getTitle();
		url = driver.getCurrentUrl();
		
		System.out.println(title);
		
		List<WebElement> we = driver.findElements(By.tagName("a"));
		
		System.out.println("There are " + we.size()+" links");
		
		 Actions ac = new Actions(driver);
		
		for(WebElement l:we) {
			System.out.println(l.getAttribute("href"));
			System.out.println(l.getText());
			
			ac.moveToElement(l).click().build().perform();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(l.getAttribute("href")!=address) {
				driver.navigate().to(address);
			}
			
		}
		
		
		
		driver.quit();
		
		
	}

}
