package QA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkINewWindow {

	public static void main (String[] args) throws InterruptedException {
		
		String os, address, url, title;
		int size;

		address = "http://www.qaclickacademy.com/practice.php";

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
		
		size = driver.findElements(By.tagName("a")).size();
		
		System.out.println(title);
		
		System.out.println("There are "+size+" links");
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		size = footerdriver.findElements(By.tagName("a")).size();
		System.out.println("There are "+size+ " links is the Footer Section");
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		same as 
		columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); 
		
		size = columndriver.findElements(By.tagName("a")).size(); 
		
		System.out.println("There are "+size+" link in the Discount coupon section");
		
		String win = driver.getWindowHandle(); 
		
		for(int i = 1; i<size; i++) {
			
			String alinks = Keys.chord(Keys.CONTROL, Keys.RETURN);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(alinks);
//			driver.findElements(By.tagName("a")).get(i).sendKeys(alinks);
			
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		Set<String> wind = driver.getWindowHandles();
		
		driver.findElement(By.tagName("a")).sendKeys(Keys.SHIFT, Keys.ENTER);
		
		
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		
		Iterator<String> it = wind.iterator(); 
		
		
//		while(it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//		}
		
		ArrayList<String> arr = new ArrayList<String> (driver.getWindowHandles());
		
		for(int j = 0; j <arr.size(); j++) {
			
			driver.switchTo().window(arr.get(j)); 
			System.out.println(j+1+" | "+driver.getTitle()+" | "+driver.getCurrentUrl());
		}
		
		driver.quit();
		
	}
}
