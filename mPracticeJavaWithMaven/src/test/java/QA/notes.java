package QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class notes {

	public static void main(String [] args) {
		String os, address;
		address = "http://store.demoqa.com/";

		

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("you are running on linux");
		}
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(address);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getPageSource());
		
		driver.findElement(By.id("menu-item-15")).click();
		driver.navigate().to(address);
//		driver.findElement(By.className("input[type='text']")).click();
//		driver.navigate().back();
		driver.findElement(By.cssSelector(".search")).sendKeys("Hello");;
//		driver.navigate().back();
		driver.findElement(By.linkText("All Product")).click();
		driver.findElement(By.xpath("//*[@id='menu-item-15']/a")).click();
		
		
		driver.close();
		driver.quit();
		
	}
	
}
