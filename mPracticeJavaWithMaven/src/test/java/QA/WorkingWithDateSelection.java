package QA;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDateSelection {

	public static void main (String [] args) throws InterruptedException {
		
		String os, address, url, title; 
		
		address = "http://www.luckystarbus.com/Purchase.aspx";
		
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
		
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl(); 
		title = driver.getTitle();
		
		driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div/div/div[2]/div/div[8]/img")).click();
		
		Actions ac = new Actions(driver);
		
		
		boolean exist = driver.findElement(By.id("ui-datepicker-div")).isDisplayed();
		
		if(exist) {
			
			while(!(driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText().equalsIgnoreCase("December"))) {
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
			
			driver.findElements(By.cssSelector("#ui-datepicker-month"));
			
//			List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
			
			int count = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
			
			for(int i = 0; i < count; i++) {
				
				String text = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
				System.out.println(text);
				if(text.equalsIgnoreCase("25")) {
					
//					ac.moveToElement(driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i)).click().build().perform();
					
					driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
					break;
				}
				
				
				
			}
			
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
