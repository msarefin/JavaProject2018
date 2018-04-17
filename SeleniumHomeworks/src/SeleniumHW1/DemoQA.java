package SeleniumHW1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\SeleniumHomeworks\\chromedriver.exe");
		
		String address, url, PageTitle;
		address = "http://store.demoqa.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(address);
		
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("-----------------------"+PageTitle+"-----------------------");
		
		WebElement search = driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		
		
		
		search.sendKeys("iPhone");
		System.out.println("Search keyword has been entered");
		search.sendKeys(Keys.RETURN);
		System.out.println("Return / Enter key sent");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("-----------------------"+PageTitle+"-----------------------");
		
		driver.findElement(By.xpath(".//*[@id='grid_view_products_page_container']/div/div[3]/div[3]/form/div/div[1]/span/input")).click();
		System.out.println("iphone 5 added to cart");
		
		
		driver.findElement(By.xpath(".//*[@id='header_cart']/a")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("-----------------------"+PageTitle+"-----------------------");
		
		driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span")).click();
		System.out.println("Continue is clicked");
		Thread.sleep(1000);
		
		String subtotal = driver.findElement(By.xpath(".//*[@id='wpsc_shopping_cart_container']/form/div[3]/table/tbody/tr[3]/td[2]/span/span")).getText();
		
		System.out.println("Subtotal : "+subtotal);
		
		Thread.sleep(1000);
		driver.quit();
	}
}
