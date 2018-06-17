package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJavascriptExecutor {

	public static void main(String [] args) throws InterruptedException {
		
String os, address, url, title; 
		
		address = "https://www.swtestacademy.com/selenium-javascriptexecutor/";
		
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
		
//		String str = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
//		System.out.println(str);
//		js.executeScript("document.getElementById('btn2').innerHTML='I am Here'");
		
		//js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")));
		
		js.executeScript("arguments[0].scrollIntoView(0);", driver.findElement(By.xpath(".//*[@id='post-1112']/div[2]/p[27]/a/img")));
		
		Thread.sleep(10000);
		
		
		driver.quit();
		
	}
}
