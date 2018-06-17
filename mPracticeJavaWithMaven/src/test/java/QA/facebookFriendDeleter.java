package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebookFriendDeleter {

	public static void main(String[] args) throws InterruptedException {
		
		String os, address, url, title;

		address = "https://www.facebook.com/";

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
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("logged in");
		
		
		System.out.println(driver.getTitle());
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.cssSelector("._2s25._606w"))).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("clicked on profile");
		
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='_1vp5']"))).click().build().perform();
		
		driver.findElement(By.xpath("//a[@data-tab-key='friends']")).click();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-tab-key='friends']"))).click().build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Recently Added')]")).click();
		
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Recently Added')]"))).click().build().perform();
		
		Thread.sleep(5000);
		
		
		int size = driver.findElements(By.cssSelector("._5q6s._8o._8t.lfloat._ohe")).size();
		
		for(int i =1; i<size;i++) {
			
			driver.findElements(By.cssSelector("._5q6s._8o._8t.lfloat._ohe")).get(i).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='u_ps_jsonp_5_0_d']")).click();
			ac.moveToElement(driver.findElement(By.xpath(".//*[@id='u_ps_jsonp_5_0_0']/div/ul/li[7]/a/span/span"))).click();	
			Thread.sleep(2000);
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		driver.quit();

	}

}
