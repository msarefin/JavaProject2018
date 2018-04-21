package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingMultiplatform {
	public static void main(String[] args) throws InterruptedException {

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
		System.out.println("Chrome Browser Launched!");
		driver.manage().deleteAllCookies();
		System.out.println("All Cookies deleted");
		driver.manage().window().maximize();
		System.out.println("Windows mazimized");
		driver.get(webaddress);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("---------------------"+PageTitle+"---------------------");
		
		Actions ac = new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='search']"));
		
		search.sendKeys("iphone");
		System.out.println("Iphone entered");
		search.sendKeys(Keys.RETURN);
		System.out.println("RETUREN Key pressed");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("---------------------"+PageTitle+"---------------------");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Navigated Back");
		
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("---------------------"+PageTitle+"---------------------");
		
		Thread.sleep(5000);
		// script fails at this point 
		try {
			search.clear();
		}catch(Exception e){
			System.out.println("search.clear Didn't clear the field!");
		}
		
		WebElement src =driver.findElement(By.xpath("//input[@class='search']"));
		
		
		src.clear();
		System.out.println("Search field cleard");
		Thread.sleep(2000);
		
		
		
		src.sendKeys("iphone");
		System.out.println("Iphone entered");
		src.sendKeys(Keys.ENTER);
		System.out.println("enter Key pressed");
		
		
		driver.quit();
		System.out.println("Browser closed!");
	}
}
