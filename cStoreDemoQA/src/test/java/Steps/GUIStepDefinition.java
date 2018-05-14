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
		
		String address = "http://store.demoqa.com/";
		
		WebDriverSelectorByOS();
		
		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
//	--------------------------
	
	@Given("^User at the Homepage$")
	public void HomePage() {
		System.out.println(PageTitle(driver));
	}
	
	@Then("^User mouse over \"([^\"]*)\"$")
	public void mousever(String key) throws IOException {
		mouseover(driver, ReadProperty(key));
	}
	
	@Then("^User Clicks \"([^\"]*)\"$")
	public void userClick(String key) throws IOException, InterruptedException {
		mouseClick(driver, ReadProperty(key));
		Thread.sleep(2000);
	}
	
	@Then("^User Prints \"([^\"]*)\"$")
	public void prints(String key) throws IOException {
		String Message = WebElementtxt(driver, ReadProperty(key));
		System.out.println(Message);
	}
	
	@Then("^User Check for \"([^\"]*)\"$")
	public void user_Check_for(String key) throws Throwable {
		String message = WebElementtxt(driver, ReadProperty(key));
		System.out.println(message);
	   
	}
	
	@Then("^User selected \"([^\"]*)\" \"([^\"]*)\"$")
	public void seleted(String key, String value) throws IOException {
		SelectionByText(driver, ReadProperty(key), value);
	}
	
	@Then("^User entered \"([^\"]*)\" \"([^\"]*)\"$")
	public void enters(String key, String value) throws IOException {
		WebElementSendKy(driver, ReadProperty(key), value);
	}
	
//	--------------------------
	
	
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}

	

