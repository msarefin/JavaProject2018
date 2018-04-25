package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePG;

public class Test {

	public WebDriver driver;
	
	@Before
	public void initialization() {
		
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

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.quit();
	}
	
	@org.junit.Test
	public void tests() throws InterruptedException {
		System.out.println("I am testing to see if this works");
		
		HomePG.ptintTitle(driver);
		HomePG.clickspe(driver);
	}
	
	
}
