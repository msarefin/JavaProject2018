package MentoringApple.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComApple {

	static WebDriver driver; 
	
	
	public static void main(String[] args) {
		String os, address, url, title;

		address = "https://www.apple.com";

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

		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.get(address);
		
		String firstWindow = driver.getWindowHandle().toString();
		
//		ancor tag
		List<WebElement> ancor = driver.findElements(By.tagName("a"));
//		number of elements
		System.out.println("There are "+ ancor.size() + " links on this page");
		
		WebElement Globalnav = driver.findElement(By.xpath("//ul[@class='ac-gn-list']"));
		
//		list of links in the global nav
		List<WebElement> gnlnk = Globalnav.findElements(By.tagName("a"));
		
		
		Actions ac = new Actions(driver);
		
		String gnlnkname [] = new String[gnlnk.size()];
 		
		for(int i = 1; i<gnlnk.size(); i++) {
			
			gnlnkname[i] = gnlnk.get(i).getText();
//			System.out.println(gnlnkname[i]);		
			
			ac.keyDown(Keys.COMMAND).click(gnlnk.get(i)).keyUp(Keys.COMMAND).build().perform();
				
		}
		
		Set <String> windowlist = driver.getWindowHandles();
		
		String [] win1 = new String[windowlist.size()];
		
		for(int i = 1;i< win1.length;i++) {
			
			driver.switchTo().window(win1[i]);
			
			if(firstWindow==win1[i]) {
				driver.getTitle();
			}
			else {
				driver.getTitle();
				driver.close();
			}
		}
		
		
		
//		driver.quit();

	}

}
