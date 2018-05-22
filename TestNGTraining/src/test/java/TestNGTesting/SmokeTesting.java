package TestNGTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SmokeTesting {

	WebDriver driver;
	
	@Test(priority = 1, description = "Smoke Test")
	@Parameters("Smoke")
	public void smoke(@Optional String Smk) {
		System.out.println(Smk);
	}
	
	
	@Test(priority = 2, description = "This a smoke test to test store.demoqa.com")
	public void home() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\Windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Product Category')]"))).build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]"))).click().build().perform();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
}
