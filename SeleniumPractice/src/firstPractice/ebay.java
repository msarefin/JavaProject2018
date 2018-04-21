package firstPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay {

	public static void main (String[] args) {
		
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://www.ebay.com/";
		
		

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			System.out.println("You are running a Mac Machine");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			System.out.println("You are running a Windows Machine");
		} else {
			System.out.println("You are using linux");
		}
		
		
		
		WebDriver driver = new ChromeDriver();
//		System.out.println("Browser launched");
		driver.manage().window().maximize();
		System.out.println("window maximized");
		driver.get(webaddress);
		System.out.println("ebay launched");
		
		url = driver.getCurrentUrl();
		PageTitle=driver.getTitle();
		System.out.println(url);
		System.out.println("--------------------------"+PageTitle+"--------------------------");
		
		driver.findElement(By.xpath(".//*[@id='gh-shop-a']")).click();
		System.out.println("shop by catagory ");

		driver.findElement(By.xpath(".//*[@id='gh-sbc']/tbody/tr/td[1]/h3[2]/a")).click();
		
		url = driver.getCurrentUrl();
		PageTitle=driver.getTitle();
		System.out.println(url);
		System.out.println("--------------------------"+PageTitle+"--------------------------");
		
		driver.findElement(By.xpath(".//*[@id='mainContent']/section[2]/div[2]/a[2]/div[2]")).click();
		System.out.println("computers and accesories clicked");

		driver.findElement(By.xpath(".//*[@id='mainContent']/section[2]/div[2]/a[5]/div[2]")).click();
		System.out.println("apple selected");
		
		driver.findElement(By.xpath(".//*[@id='w1-w0']/ul/li[10]/a")).click();
		System.out.println("ipad clicked");
		
		driver.findElement(By.xpath(".//*[@id='w5-xCarousel-x-carousel-items']/ul/li[1]/a/p")).click();
		System.out.println("512");
		
		driver.findElement(By.xpath(".//*[@id='w5-xCarousel-x-carousel-items']/ul/li[3]/a/p")).click();
		System.out.println("choose gold");
		
		driver.findElement(By.xpath(".//*[@id='w5-items[0]']/div/div[2]/a/h3")).click();
		System.out.println("choose first item");
		
		Select color = new Select(driver.findElement(By.xpath(".//*[@id='msku-sel-1']")));
		
		color.selectByVisibleText("Gold");
		System.out.println("gold selected");
		
		driver.findElement(By.xpath(".//*[@id='isCartBtn_btn']")).click();
		System.out.println("added to cart");
		
		driver.findElement(By.xpath(".//*[@id='ADDON_0']/div/div[2]/div/div[4]/div/button[1]")).click();
		System.out.println("no thanks");
		
		
		String msg = driver.findElement(By.xpath(".//*[@id='pageLevelMessaing']/div/div/p/span[1]/a")).getText();
		System.out.println(msg);
//		driver.findElement(By.xpath(xpathExpression)
		
		driver.quit();
		
	}
}
