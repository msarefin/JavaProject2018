package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GUIStepDefination {
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

	@Given("^User at facebook homepage$")
	public void fb() {
		System.out.println("I am at FB home page" + driver.getTitle());
	}

	@When("^User enter username \"([^\"]*)\"$")
	public void user(String a) throws InterruptedException {
		WebElement key = driver.findElement(By.xpath(".//*[@id='email']"));
		key.sendKeys(a);
		Thread.sleep(1000);
	}

	@And("^User enter password \"([^\"]*)\"$")
	public void pass(String a) throws InterruptedException {
		WebElement key = driver.findElement(By.id("pass"));
		key.sendKeys(a);
		Thread.sleep(1000);
	}
	@Then("^click on login button$")
	public void clickLogin(){
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}
	
	@Given("^I am on Facebook login page$")
	public void fblogin() {
		System.out.println("frist step in cucumber");
	}

	@Then("^Login should fail$")
	public void logout() {
		System.out.println("logging out second step");
	}

	@And("^this test case failed$")
	public void closing() {
		System.out.println("this test case failed");
	}

	@Given("^I enter Username as \"([^\"]*)\"$")
	public void entertextto(String b) {
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(b);
	}

	@When("^I enter Password as \"([^\"]*)\"$")
	public void enterpass(String b) {
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(b);
	}

	@Then("^clickon \"([^\"]*)\"$")
	public void clicking(String a) {
		driver.findElement(By.xpath(a)).click();
	}
	
	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
