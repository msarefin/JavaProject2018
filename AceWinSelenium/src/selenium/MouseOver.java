package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[]args) throws InterruptedException {
		
		
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
		System.out.println("Chrome Browser Launched");
		
		driver.manage().deleteAllCookies();
		System.out.println("All cookies deleted");
		
		driver.get(webaddress);
		System.out.println("Navigated to web address");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		url= driver.getCurrentUrl(); 
		PageTitle = driver.getTitle(); 
		 
		System.out.println(url);
		System.out.println("------------------"+PageTitle+"------------------");
		
		
		
		Actions ac = new Actions(driver);
//		Instance of an Action class created 
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"))).build().perform();
		System.out.println("mouse over on product Category");
		Thread.sleep(1000);
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='menu-item-36']/a"))).build().perform();
		System.out.println("point to ipad");
		driver.findElement(By.xpath(".//*[@id='menu-item-36']/a")).click();
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"))).contextClick().build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
