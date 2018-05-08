package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GUIStepDefinition extends Lib{

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
	
//	------------------------------------------------------------

	@Given("^User is at Facebook homepage$")
	public void title() {
		System.out.println(PageTitle(driver));
		
	}
	
	@Then("^User enters \"([^\"]*)\" \"([^\"]*)\"$")
	public void entering (String key , String value) throws IOException {
		WebElementSendKy(driver, ReadProperty(key), value);
	}
	
	@Then("^User enters DOB \"([^\"]*)\" \"([^\"]*)\"$")
	public void DOB(String key,String value) throws IOException {
		SelectionByText(driver, ReadProperty(key), value);
	}
	
	@Then("^User eneters gender \"([^\"]*)\"$")
	public void gender(String key) throws IOException {
		WebElementclick(driver, ReadProperty("gmale"));
	}
	
	@Then("^User clicks on signup$")
	public void signup() throws IOException, InterruptedException {
		WebElementclick(driver, ReadProperty("signup"));
		Thread.sleep(1000);
	}
	
	
//	------------------------------------------------------------

	
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
