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
	
	@Before
	public void initialize() {
		System.out.println("this is before class");
		
		String address = "https://www.thegreatcourses.com/";
		
		WebDriverSelectorByOS();
		
		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
//	--------------------------
	@Given("^User is in the home page$")
	public void HomeTitle() {
		PageTitle(driver);
	}
	
	@Then("^User clicks on \"([^\"]*)\"$")
	public void Special(String key) throws IOException {
		WebElementclick(driver, ReadProperty(key));
	}
	@Then("^User is in On sale Page$")
	public void SpSaleTitle() {
		PageTitle(driver);
	}
	
	@Then("^User entered \"([^\"]*)\" \"([^\"]*)\"$")
	public void input(String key, String value) throws IOException {
		WebElementSendKy(driver, ReadProperty(key), value);
		
		
	}
	
	@Then("^User selected \"([^\"]*)\" \"([^\"]*)\"$")
	public void selected(String key, String value) throws IOException {
		SelectionByText(driver, ReadProperty(key), value);
	}
	
//	--------------------------
	
	
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
