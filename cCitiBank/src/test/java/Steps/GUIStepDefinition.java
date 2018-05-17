package Steps;

import java.io.IOException;
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
	
	
	@Then("^user clicks \"([^\"]*)\"$")
	public void clicks(String key) throws IOException, InterruptedException {
		WebElementclick(driver, ReadProperty(key));
		Thread.sleep(2000);
	}
	
	@Then("^user selects \"([^\"]*)\" \"([^\"]*)\"$")
	public void selects(String key, String  value) throws IOException {
		SelectionByText(driver, ReadProperty(key), value);
	}
	
	@Then("^user enters \"([^\"]*)\" \"([^\"]*)\"$")
	public void enters(String key, String value) throws IOException {
		WebElementSendKy(driver, ReadProperty(key), value);
		
	}
	
	@Then("^user checks \"([^\"]*)\"$")
	public void checks(String key) throws IOException {
		checkBox(driver, ReadProperty(key));
	}

	
	
//	-----------------------------------------------------------
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	
}
