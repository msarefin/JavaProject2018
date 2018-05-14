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

//	United Airlines
	
WebDriver driver;
	
	@Before
	public void initialize() {
		System.out.println("this is before class");
		
		String address = "https://www.united.com/ual/en/us/";
		
		WebDriverSelectorByOS();
		
		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
//	------------------------------------------------------------------------------------
	
	@Given("^User is in the homepage$")
	public void pageTitle() {
		PageTitle(driver);
	}
	
	@Then("^User clicks \"([^\"]*)\"$")
	public void clicks(String key) throws IOException {
		mouseClick(driver, ReadProperty(key));
	}
	
	@Then("^User enters \"([^\"]*)\" \"([^\"]*)\"$")
	public void enters(String key, String value) throws IOException {
		mouseTxt(driver, ReadProperty(key), value);
	}
	
	@Then("^User selects \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_selects(String key, String value) throws Throwable {
		SelectionByText(driver, ReadProperty(key), value);
	}
	    
	@Then("^User is in Search Result$")
	public void title() {
		PageTitle(driver);
	}
	
//	------------------------------------------------------------------------------------	
	
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
