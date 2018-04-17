package SeleniumHW1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toolsQA {

	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\SeleniumHomeworks\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String address,url,PageTitle;
		
		address ="http://toolsqa.com/automation-practice-form/";
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		url=driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(url);
		System.out.println("--------------------------"+PageTitle+"--------------------------");
		
		WebElement fname = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		WebElement lname = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input"));
		WebElement male = driver.findElement(By.xpath(".//*[@id='sex-0']"));
		WebElement experience = driver.findElement(By.xpath(".//*[@id='exp-6']"));
		WebElement date = driver.findElement(By.xpath(".//*[@id='datepicker']"));
		WebElement manualTester = driver.findElement(By.xpath(".//*[@id='profession-0']"));
		WebElement automationTeter = driver.findElement(By.xpath(".//*[@id='profession-1']"));
		WebElement QTP = driver.findElement(By.xpath(".//*[@id='tool-0']"));
		WebElement SelIDE = driver.findElement(By.xpath(".//*[@id='tool-1']"));
		WebElement SelWD = driver.findElement(By.xpath(".//*[@id='tool-2']"));
		WebElement bttn = driver.findElement(By.xpath(".//*[@id='submit']"));
		
		Select continent = new Select(driver.findElement(By.xpath(".//*[@id='continents']")));
		Select selC = new Select(driver.findElement(By.xpath(".//*[@id='selenium_commands']")));
		
		fname.sendKeys("Light");
		System.out.println("First name entered");
		lname.sendKeys("Yagami");
		System.out.println("Last name entered");
		male.click();
		System.out.println("Male Selected");
		experience.click();
		System.out.println("Highest Experience selected");
		date.sendKeys("04/16/2018");
		System.out.println("Date Entered");
		manualTester.click();
		System.out.println("Manual tester checked");
		automationTeter.click();
		System.out.println("Automation tester checked");
		QTP.click();
		System.out.println("QTP checked");
		SelIDE.click();
		System.out.println("Selenium IDE checked");
		SelWD.click();
		System.out.println("Selenium Webdriver Checked");
		
		continent.selectByIndex(3);
		selC.selectByIndex(3);
		
		bttn.click();
		System.out.println("send Button clicked");
		
		url=driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(url);
		System.out.println("--------------------------"+PageTitle+"--------------------------");
		
		Thread.sleep(5000);
		
		System.out.println("Test completed sucessfully");
		
		driver.quit();
		
		
	}
}
