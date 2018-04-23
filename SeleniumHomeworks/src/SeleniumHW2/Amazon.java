package SeleniumHW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main (String [] args) {
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "https://www.amazon.com/";
		
		

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
		System.out.println("Chrome Browser Launched");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(".//*[text()='Departments']"))).build().perform();
		System.out.println("Mouse over Departments");
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Fire TV']"))).build().perform();
		System.out.println("Mouse over Fire TV");
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Fire TV Stick']"))).click().build().perform();
		System.out.println("clicked on Fire TV Stick!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle(); 
		
		System.out.println(url);
		System.out.println("-----------------------"+PageTitle+"-----------------------");
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		System.out.println("Item added to cart");
		WebElement popOverContent = driver.findElement(By.partialLinkText("2-Year Protection Plan"));
		
		if(popOverContent.isDisplayed()) {
			driver.findElement(By.xpath(".//*[@id='a-popover-5']/div/div[1]/button")).click();
		}
		else {
			System.out.println("No pop over content was displayed");
		}
		
		driver.findElement(By.xpath(".//*[@id='kindleTabbedBTF']/div[2]/div[1]/table[2]/tbody/tr[5]/td[4]/a")).click();
		System.out.println("Mission clable added");

		driver.findElement(By.xpath(".//*[@id='nav-cart']/span[3]")).click();
		System.out.println("Clicked on the cart");
		driver.findElement(By.xpath(".//*[@id='hlb-ptc-btn-native']")).click();
		System.out.println("proceed to checkout");
		driver.findElement(By.xpath(".//*[@id='a-page']/div[1]/div[4]/div[2]/a[1]")).click();
		System.out.println("Clicked on condition of use ");
		
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle(); 
		
		System.out.println(url);
		System.out.println(PageTitle);
		
		
		driver.quit();
	}
}
