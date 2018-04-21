package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FBActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://www.facebook.com/";
		
		

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
		System.out.println("All cookies deleted");
		
		driver.get(webaddress);
		System.out.println("Navigated to web address");
	
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='email']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).doubleClick().contextClick().build().perform();
		
//		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='email']"))).keyUp(Keys.SHIFT).build().perform();
//		Thread.sleep(5000);
//		
//		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='email']"))).doubleClick().build().perform();
//		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='email']"))).contextClick().build().perform();
		
		Thread.sleep(6000);
		driver.quit();
		
	}
}
