package selenium;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMultiWebBrowser {

	public static void main (String[] args) throws InterruptedException {
		
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://store.demoqa.com/";
		
		

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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"))).sendKeys("iphone").build().perform();
		Thread.sleep(1000);
		
		search.sendKeys("iphone"+"\n");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		search.sendKeys("iphone");
		search.sendKeys(Keys.RETURN);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		search.sendKeys("iphone"+Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		search.sendKeys("iphone");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"))).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ac.sendKeys(search,"iphone"+Keys.ENTER).build().perform();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
	}
}
