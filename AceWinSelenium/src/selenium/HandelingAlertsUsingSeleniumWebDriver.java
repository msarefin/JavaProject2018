package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandelingAlertsUsingSeleniumWebDriver {

	public static void main(String[] args) throws InterruptedException {
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress, url, PageTitle;
		webaddress = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
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
		WebElement Prompt = driver.findElement(By.xpath(".//*[@id='content']/p[11]/button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver; 
		executor.executeScript("arguments[0].click();",Prompt);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("yes I do ");;
		
		
		Thread.sleep(5000);
		
	}
}
