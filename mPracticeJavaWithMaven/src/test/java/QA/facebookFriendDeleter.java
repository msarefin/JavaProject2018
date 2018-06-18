package QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import gherkin.formatter.Argument;

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
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("logged in");
		Thread.sleep(2000);
		
		
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ac.sendKeys(Keys.ESCAPE).build().perform();
		ac.moveToElement(driver.findElement(By.xpath("(//div[@dir='ltr'])[1]"))).click().build().perform();
//		js.executeScript("argument[0].click()", driver.findElement(By.xpath("//a[@title='Profile']")));
		Thread.sleep(5000);
		
		System.out.println("on Porfile page");
		
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Friends']"))).click().build().perform();
		Thread.sleep(5000);
		WebElement RFrend = driver.findElement(By.xpath("//span[text()='Recently Added']"));
		Thread.sleep(2000);
		try {
		
		RFrend.click();
		}
			catch(Exception e) {
				js.executeScript("arguments[0].click()", RFrend);
		}
		js.executeScript("arguments[0].scrollIntoView()", RFrend);
		Thread.sleep(2000);
		String windowMain = driver.getWindowHandle(); 
		System.out.println("Friends Clicked");
		
		List<WebElement> flist = driver.findElements(By.xpath("(//div[@aria-role='tabpanel'])/ul/li/div/div/div/div/div[2]/div"));
		
		int size = flist.size();
		
		System.out.println("There are "+size+" friends");
		
//		for(WebElement e: flist) {
//			
//			String link = e.getAttribute("href");
//			System.out.println(link);
//			
//			ac.moveToElement(e).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
//			
//			Thread.sleep(1000);
//		}
		
		for(int i= 0; i< size; i++) {
			WebElement e = flist.get(i).findElement(By.tagName("a"));
			
			String a = e.getAttribute("href");
			String name = e.getText().toString(); 
			String t = e.getTagName(); 
			System.out.println(name);
		
			
			ac.moveToElement(e).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			
//			Thread.sleep(2000);
		}
		
//		System.out.println("links clicked");
		driver.quit();

	}

}
