package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GUIStepDefinition extends Lib {

	WebDriver driver;

	@Before
	public void initialize() {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aney\\Documents\\JavaProject2018\\NewBDD-1\\Drivers\\Windows\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://online.citi.com/US/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("^i am at Facebook page$")
	public void facebook() {
		System.out.println(driver.getTitle());
	}
	
	@Given("^user is on landing page$")
	public void landingpage() {
		System.out.println("i am at landing page");
	}

	@Then("^user clicks open an account$")
	public void account() throws InterruptedException {
		WebElement open=driver.findElement(By.xpath("//a[contains(.,'Open an Account')]"));
		open.click();
		Thread.sleep(5000);
		
	}
	@Then("^user select state$")
	public void state() {
		WebElement select=driver.findElement(By.xpath("//select[@id='state-dropdown-id']"));
		Select sc=new Select(select);
		sc.selectByVisibleText("MD");
		WebElement button=driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
		button.click();
		
	}
	@Then("^user will select account option$")
	public void acctOption() throws InterruptedException {
		WebElement opt=driver.findElement(By.xpath("//select[@id='myDropdown']"));
		Select act=new Select(opt);
		act.selectByVisibleText("Banking");
		driver.findElement(By.xpath("//button[@id='getStartedBtn']")).click();
		Thread.sleep(2000);
	}
	@Then("^user clicked basic banking package account$")
	public void basicBanking() {
		WebElement base=driver.findElement(By.xpath("html/body/app-root/cbol-core/citi-parent-layout/div/div/div/app-open-an-account/citi-simple-layout/app-banking/div[1]/citi-nested-table/citi-nt-section[4]/div/div/div/div[1]/citi-cta/a"));
		base.click();
		
	}
	@And("^user clicked apply Now button$")
	public void apply() {
		WebElement applynow=driver.findElement(By.xpath(".//*[@id='applyonline']"));
		applynow.click();
	}
	@Given("^user is at tell us about yourself page$")
	public void userpage() {
		System.out.println(driver.getTitle());
	}
	
	
	@Then("^i am entering \"([^\"]*)\" \"([^\"]*)\"$")
	public void Entering(String key, String value) throws IOException {
		findelement(driver, key).sendKeys(value);
	}

	
	@And("^i am selecting \"([^\"]*)\" \"([^\"]*)\"$")
	public void selecting(String field, String value){
		
		Select slc=new Select(driver.findElement(By.xpath(field)));
		slc.selectByVisibleText(value);
				
	}

	@Then("^I am clicking \"([^\"]*)\"$")
	public void clickfxn (String no) {
		WebElement radiobtn=driver.findElement(By.xpath(no));
		radiobtn.click();
	}
	
	@Given("^you will see error message$")
	public void error() throws IOException {

		try {
			System.out.println("it is errorrrrr");
		} catch (Exception e) {
			takescreenshot(driver, "error");
		}
	}

	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
