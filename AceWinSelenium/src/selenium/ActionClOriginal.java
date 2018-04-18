package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClOriginal {
	public static void main(String[] args) throws InterruptedException {

		String os = System.getProperty("os.name").toLowerCase();
		
		if(os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		}
		else {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		}
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INSTRUCTOR\\eclipse-workspace\\FirstSelenium\\chromedriver.exe");
		 */
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Search = driver.findElement(By.xpath("//input[@class='search']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Product Category')]"))).build().perform();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'iPads')]")).click();
		// Search.sendKeys("Iphone" + Keys.ENTER);
		// Search.sendKeys("iphone"+"\n");
		//
		// ac.moveToElement(Search).sendKeys(Keys.ENTER).build().perform();
		// ac.sendKeys(Search, "Iphone" + Keys.ENTER).build().perform();
		//
		// ac.moveToElement(Search).click().sendKeys("Iphone" +
		// Keys.ENTER).build().perform();

	}

}
