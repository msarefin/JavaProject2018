package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GUIStepDefinition extends Lib{

	WebDriver driver;
	String address = "https://online.citi.com/US/login.do";
	
	@Before
	public void initialize() {
		driverSeclectorByOS();
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//	-----------------------------------------------------------
	
	@Given("^User is at LandingPage$")
	public void LangindPage() {
		System.out.println(PageTitle(driver));
	}
	
//	This is running sitiy bank

	
	
//	-----------------------------------------------------------
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	
}
