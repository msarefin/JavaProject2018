package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class GUIStepDefinition {

	WebDriver driver;

	@Before
	public void initialize() {
		System.out.println("this is before class");
		String os, address;

		address = "https://www.facebook.com/";

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.out.println("Project Running on MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.out.println("Project running on Windows");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("Project Running on Linux");
		}

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

//	----------------------------------------------------------------------------

	@Given("^user is in facebook site$")
	public void facebook() {
		System.out.println(driver.getTitle());
		
	}
	
//	----------------------------------------------------------------------------
	
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
