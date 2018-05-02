package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FilghtSearchResult;
import Pages.Home;

public class Test {

	public static WebDriver driver;
	
	@BeforeClass
	public static void Initialize() {
		System.out.println("Browser initializing");
		String os, address;
		
		address = "https://www.united.com/ual/en/us/";

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
		Home.PageTitles(driver);
		Home.RadioBtn(driver);
		Home.From(driver);
		Home.IDA(driver);
		Home.To(driver);
		Home.BOS(driver);
		Home.DepDate(driver);
		Home.RetDate(driver);
		Home.Travelers(driver);
		Home.CabinType(driver);
		Home.nonstop(driver);
		Home.Search(driver);
		
		System.out.println("Test On Homepage completed");
	}
	
	@org.junit.Test
	
	public void test2() throws IOException {
		FilghtSearchResult.PageTitles(driver);
		FilghtSearchResult.chooseTicket(driver);
		FilghtSearchResult.reserve(driver);
	}
	
	@AfterClass
	
	public static void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit(); 
		System.out.println("Test was completed Successfully!");
		
		System.out.println("---------------------- Test Completed ----------------------");
	}
	
}
