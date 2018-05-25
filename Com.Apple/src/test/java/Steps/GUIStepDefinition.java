package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EmptyFileException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utils.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GUIStepDefinition extends Lib{

	
WebDriver driver;
String url;
	
	@Before
	public void initialize() {
		
		String address = "https://www.apple.com/";
		 
		
		WebDriverSelectorByOS();
		
		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
//	-------------------------------------------------------------------------------
	
	@Given("^user is at the Homepage$")
	public void HomeTitle() {
		System.out.println(PageTitle(driver)+"::"+url);
		
	}
	
	@When("^user clicks on \"([^\"]*)\"$")
	public void Click(String key) throws IOException, InterruptedException {
//		if (LocateByXpath(driver, ReadProperty(key)).isDisplayed()) {
//			mouseClick(driver, ReadProperty(key));
//		}
//		
//		else {
//			driver.navigate().back();
//		}
		
		mouseClick(driver, ReadProperty(key));
		secondsWaitTillLoad(driver, 10);
		Thread.sleep(1000);
		AlertDismiss(driver);
		
		
	}
	
	@Then("^user should navigate to page$")
	public void WebPage() {
		System.out.println("User is at the " +PageTitle(driver));
		url = url(driver); 
		System.out.println(url);
		
	}
	
	@Then ("^\"([^\"]*)\" should appear$")
	public void appear(String key) throws IOException {
		
		if (LocateByXpath(driver, ReadProperty(key)).isDisplayed()) {
//			TakeScreenshot(driver, PageTitle(driver));
			System.out.println("Its Works !");
		}
		
		else {
			System.out.println("element not visible");
		}
		
	}
	
	@And("^user entered \"([^\"]*)\" \"([^\"]*)\"$")
	public void EnterData(String key, String value) throws IOException {
		mouseTxt(driver, ReadProperty(key), value);
	}
	
	@When("^user hits enter key$")
	public void enterKey() {

		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.RETURN);
	}
	
	
	
	
//	-------------------------------------------------------------------------------
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
