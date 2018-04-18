package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		
		String address, url, PageTitle;
		address ="http://store.demoqa.com/";
		
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome browser launched!");
		driver.manage().deleteAllCookies();
		System.out.println("All cookies deleted");
		driver.manage().window().maximize();
		System.out.println("Windows maximized");

		driver.get(address);
		System.out.println("Web address executed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle(); 
		
		System.out.println(url);
		System.out.println("----------------------------"+PageTitle+"----------------------------");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='search']"));
		WebElement src = driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		System.out.println("Web Element located");
		Actions ac = new Actions(driver);
		System.out.println("Instance of Acrions Class created");
		search.sendKeys("Iphone");
		System.out.println("Iphone entered in the search bar");
		ac.moveToElement(driver.findElement(By.xpath("//input[@class='search']"))).sendKeys(Keys.ENTER).build().perform();
		System.out.println("EnterKey Pressed");
		
		driver.navigate().back();
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle(); 
		
		System.out.println(url);
		System.out.println("----------------------------"+PageTitle+"----------------------------");
		System.out.println("Went back on the browser ");
//		Thread.sleep(1000);
		//This is the point where it kept failing
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		search.clear();
		
//		Thread.sleep(5000);
//		ac.sendKeys(search,"iphone"+Keys.ENTER).build().perform();
		System.out.println("Iphone eneterd in in the search box and enter key pressed");
		
		
		search.sendKeys("Iphone"+Keys.ENTER);
		System.out.println("Iphone entered again ");
		ac.moveToElement(driver.findElement(By.xpath("//input[@class='search']"))).sendKeys(Keys.ENTER).build().perform();
		System.out.println("EnterKey Pressed");
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		search.sendKeys("iphone"+"\n");
		Thread.sleep(1000);
		
		driver.quit();
	}
}
