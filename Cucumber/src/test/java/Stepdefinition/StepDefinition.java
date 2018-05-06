package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

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

	@Given("^user is at FB home Page$")

	public void pageTitle() {
		System.out.println(driver.getTitle());
	}
	
	

	@Then("^user enters first name \"([^\"]*)\"$")
	public void EnterFirstName(String a) throws InterruptedException {
		WebElement key = driver.findElement(By.xpath(".//*[@id='u_0_o']"));
		key.click();
		key.sendKeys(a);
		
	}
	
	@Then("^user enters last name \"([^\"]*)\"$")
	public void EnterLastName(String b) throws InterruptedException {
		WebElement key = driver.findElement(By.xpath(".//*[@id='u_0_q']"));
		key.sendKeys(b);
		Thread.sleep(1000);
		
	}
	
	@Then("^user enters email \"([^\"]*)\"$")
	public void EnterEmail(String c) throws InterruptedException {
		WebElement key = driver.findElement(By.xpath(".//*[@id='u_0_t']"));
		key.click();
		Thread.sleep(1000);
		
		
	}
	
	@Then("^user enters DOB$")
	public void DOB() {
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		Select day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		
		month.selectByIndex(3);
		day.selectByValue("15");
		year.selectByValue("1985");
		
	}
	
	@Then ("^user chooses gender$")
	public void gender() {
		driver.findElement(By.xpath(".//*[@id='u_0_b']")).click();
	}
	
	@Then("^user clicks on Signup$")
	public void Signup() {
		driver.findElement(By.xpath(".//*[@id='u_0_16']")).click();
	}
	

	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
