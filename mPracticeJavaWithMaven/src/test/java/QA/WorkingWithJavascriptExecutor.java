package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJavascriptExecutor {

	public static void main(String [] args) throws InterruptedException {
		
String os, address, url, title; 
		
		address = "http://demo.automationtesting.in/";
		
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		String str = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
		System.out.println(str);
		js.executeScript("document.getElementById('btn2').innerHTML='I am Here'");
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}
}
