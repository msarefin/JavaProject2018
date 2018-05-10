package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		String os, address;

		address = "https://www.ebay.com/";

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
	
//	----------------------------------------------------------

	@Given("^user is at eBay homepage$")
	public void HomeTitle() {
		System.out.println(PageTitle(driver));
	}
	
	@Then("^user enters \"([^\"]*)\" \"([^\"]*)\"$")
	public void searchBar(String key, String value) throws IOException {
		WebElementSendKy(driver, ReadProperty(key), value);
		
	}
	
	@Then("^user use click on \"([^\"]*)\"$")
	public void SearchButton(String key) throws IOException {
		WebElementclick(driver, ReadProperty(key));
	}
	
	@Then("^user is in search result page$")
	public void SearchTitle() {
		System.out.println(PageTitle(driver));
	}
	
	public void close() {
		boolean b = driver.findElement(By.xpath("//span[@class='prodsch-tooltip__close']")).isEnabled();
	
		if(b) {
			driver.findElement(By.xpath("//div[contains(text(),'Quickly compare offers in our new grouped view')]")).click();
		}
	
	}
	
	
	@Then("^user mouse over \"([^\"]*)\"$")
	public void sort(String key) throws IOException, InterruptedException {
		mouseover(driver, ReadProperty(key));
		Thread.sleep(1000);
	}

	@Then("^user clicked on \"([^\"]*)\"$")
	public void newlisting(String key) throws IOException, InterruptedException {
		mouseClick(driver,ReadProperty(key));
		Thread.sleep(1000);
	}
		
	
//	----------------------------------------------------------

	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
