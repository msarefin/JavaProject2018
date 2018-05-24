package TestNGTesting;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.List;

public class WhiteBox {

	WebDriver driver;
	
	@Test(priority=1,description="launching the chrome browser")
	@Parameters("browser")
	public void launch(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\Windows\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("http://www.rediff.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println(driver.getTitle());
			
			
		}
		
	}
	@Test(priority = 2, description = "Generate a list of links")
	public void linkCounter() {
		List<WebElement> linkCounter = driver.findElements(By.tagName("a"));
		
		System.out.println(linkCounter.size());
		
		for(int i=1;i<linkCounter.size(); i++) {
			
			System.out.println(i+" "+ linkCounter.get(i).getText());
			System.out.println();
		}
		
	}
	
	public void TestAllLinks() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		
		
	}
}
