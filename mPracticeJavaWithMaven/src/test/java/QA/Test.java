package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		String os, address;
		address = "https://login.salesforce.com/";

		
//		ChromeDriver locator 
		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("you are running on linux");
		}

//		Starting ChromeDriver will launch the chrome browser
		WebDriver driver = new ChromeDriver();
//		Delete all cookies
		driver.manage().deleteAllCookies();
//		Maximize the windows
		driver.manage().window().maximize();
//		Go to the Web Address 
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.className("username")).clear();
//		driver.findElement(By.linkText());
		
		
		driver.close();

	}

}
