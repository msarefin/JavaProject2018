package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		
		String address, url, PageTitle;
		address ="http://store.demoqa.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@class='search']"));
		Actions ac = new Actions(driver);
		
		search.sendKeys("Iphone");
		ac.moveToElement(driver.findElement(By.xpath("//input[@class='search']"))).sendKeys(Keys.ENTER).build().perform();
		
		
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		search.sendKeys("Iphone"+Keys.ENTER);
		
		driver.navigate().back();
		
		search.sendKeys("iphone"+"\n");
		Thread.sleep(1000);
		
		driver.quit();
	}
}
