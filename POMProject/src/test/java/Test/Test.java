package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddToCart;
import Pages.Homepg;
import Pages.HowTo;
import Pages.SpeSale;

public class Test {

	public static WebDriver driver;
	
	@BeforeClass
	public static void initialization() {
		
		System.out.println("This is before annotation");
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		
		
		webaddress = "https://www.thegreatcourses.com/";
		
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			System.out.println("You are arunning a Mac Machine");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			System.out.println("You are running a Windows Machine");
		} else {
			System.out.println("You are using linux");
		}

		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		junit help 
//		it is a data drivern framework using page object model plus junit help 
		
		
		
	}
	
	@org.junit.Test
	public void tests1() throws InterruptedException, IOException {
		System.out.println("I am testing to see if this works"); 
		
		System.out.println("This is the first test");
		Homepg.ptintTitle(driver);
		Homepg.clickspe(driver);
		Homepg.clickspe(driver);
		
	}
	
	@org.junit.Test
	public void tests2() throws InterruptedException, IOException {
		System.out.println("I am testing to see if this works"); 
		System.out.println("This is the second test");
		
		SpeSale.printTitle(driver);
		SpeSale.HowToDraw(driver);
		
	}
	
	@org.junit.Test
	public void tests3() throws IOException {
		System.out.println("This is the third test to add to cart ");
		
		HowTo.PageTitle(driver);
		HowTo.ClickDVD(driver);
		HowTo.AddToCart(driver);
	
		
		
	}
	
	@org.junit.Test
	public void tests4() throws IOException, InterruptedException {
		System.out.println("This is the 4th test");
		
		AddToCart.printTitle(driver);
		AddToCart.DollarAmount(driver);
		AddToCart.ClickOnCheckout(driver);
		
	}
	
	
	
	
	@AfterClass
	public static void teardown() {
		System.out.println("This is after annotation");
		
		System.out.println("Test Completed!!!! ");
		driver.manage().deleteAllCookies();
		driver.close();
	}
	
}
