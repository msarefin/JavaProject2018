package SeleniumHW1;

import java.net.StandardSocketOptions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheGreatCourses {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.selenium.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\SeleniumHomeworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.thegreatcourses.com/");
		 
		String url = driver.getCurrentUrl();
		String PageTitle = driver.getTitle();
		System.out.println(url);
		System.out.println(PageTitle);
		
		Thread.sleep(1000);
		System.out.println("------------------------------------------"+PageTitle+"------------------------------------------");
		
		System.out.println("Page hass loaded");
		
		driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("Math");
		System.out.println("Keyword entered");
		driver.findElement(By.xpath(".//*[@id='search_mini_form']/div/button")).click();
		System.out.println("Execution button pressed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Page Loaded");
		PageTitle = driver.getTitle();
		System.out.println("------------------------------------------"+PageTitle+"------------------------------------------");
		driver.findElement(By.xpath("html/body/div[4]/div/div[3]/div/div[3]/div/div/div[2]/div/div/div/div[1]/div/div[1]/span[1]")).click();
		driver.findElement(By.xpath("html/body/div[4]/div/div[3]/div/div[3]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div/ul/li[3]")).click();
		System.out.println("Sorted best seller");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[4]/div/div[3]/div/div[3]/div/div/div[2]/div/ul/li[2]/div/a")).click();
		System.out.println("Selected Secret of Mental Math");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='media-format-radio']/div[2]/label")).click();
		
		System.out.println("Selected SoundTrack ...");
		
		
		driver.findElement(By.xpath(".//*[@id='add-to-cart-btn']")).click();
		
		System.out.println("Item Added to cart");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[3]/div/div[2]/div[1]/div/div[3]/button[2]")).click();
		
		System.out.println("Proceed to check out");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String Subtotal = driver.findElement(By.xpath(".//*[@id='shopping-cart-totals-table']/tbody/tr[1]/td[1]")).getText();
		String SubtotalAm = driver.findElement(By.xpath(".//*[@id='shopping-cart-totals-table']/tbody/tr[1]/td[2]/span")).getText();
		
		System.out.println(Subtotal+" : "+SubtotalAm);
		
		driver.close();
	}
}
