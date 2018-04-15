package selenium;

import java.util.concurrent.TimeUnit;

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
		
		Thread.sleep(1000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement searchBar = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // this will wait for up to 10 seconds or less until the page loads. 
		searchBar.sendKeys("macbook"); // enters the keywords 
		System.out.println("Keyowrd entered");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		Thread.sleep(1000);
		System.out.println("Go is clicked");
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		Thread.sleep(1000);
		System.out.println("First link is clicked");
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		Thread.sleep(1000);
		System.out.println("Add to cart is clicked");
		driver.findElement(By.xpath("//button[contains('No Thanks')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("No Thanks is clicked");
		driver.findElement(By.xpath(".//*[@id='nav-cart']")).click();
		Thread.sleep(1000);
		System.out.println("go to cart");
		driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
		Thread.sleep(1000);
		System.out.println("Deleted from cart");
		
		driver.close();
		System.out.println("Browser is closed");
		
		
	}
}
