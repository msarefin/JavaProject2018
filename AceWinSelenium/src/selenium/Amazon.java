package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.com");
		
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement searchBar = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		
		Thread.sleep(5000);
		searchBar.sendKeys("Thinkpad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		
		driver.close();
		
		
	}
}
