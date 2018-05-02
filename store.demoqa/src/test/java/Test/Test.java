package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CheckoutPage;
import Pages.StorePage;
import Pages.iPhonesPage;

public class Test {

	public static WebDriver driver; 
	
	@BeforeClass
	public static void initialize() {
		System.out.println("Browser initializing");
		String os, address;
		
		address = "http://store.demoqa.com/";

		os = System.getProperty("os.name").toLowerCase(); 
		
		if(os.contains("mac")) {
			System.out.println("Project Running on MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/Mac/chromedriver");
		}
		else if(os.contains("windows")){
			System.out.println("Project running on Windows");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\Windows\\chromedriver.exe");
		}
		else {
			System.out.println("Project Running on Linux");
		}
		
		driver =new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	
	@org.junit.Test
	public void test1() throws IOException, InterruptedException {
		System.out.println("---------------------- Testing Store Page----------------------");
		StorePage.PageTitles(driver);
		StorePage.iphone(driver);
		Thread.sleep(1000);
		
	}
	
	@org.junit.Test
	public void test2() throws IOException, InterruptedException {
		System.out.println("---------------------- Testing iPhone Page----------------------");
	
		iPhonesPage.PageTitle(driver);
		iPhonesPage.HeaderInfo(driver);
		iPhonesPage.AddToCart(driver);
		
	}
	
	@org.junit.Test
	public void test3() throws IOException, InterruptedException {
		System.out.println("---------------------- Testing checkout Page----------------------");
		CheckoutPage.PageTitles(driver);
		CheckoutPage.subtotal(driver);
		CheckoutPage.Total(driver);
	}
	
	
	
	
	
	@AfterClass
	public static void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit(); 
		System.out.println("Test was completed Successfully!");
		
		System.out.println("---------------------- Test Completed ----------------------");
	}
}
