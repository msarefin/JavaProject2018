package SeleniumHW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolSQL {

	public static void main (String[] args) {
		
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://toolsqa.com/automation-practice-form/";
		
		

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			System.out.println("You are arunning a Mac Machine");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			System.out.println("You are running a Windows Machine");
		} else {
			System.out.println("You are using linux");
		}
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Alexander");
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Hamilton");
		driver.findElement(By.xpath(".//*[@id='sex-0']")).click();
		driver.findElement(By.xpath(".//*[@id='exp-6']")).click();
		driver.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("04/21/2018");
		driver.findElement(By.xpath(".//*[@id='profession-0']")).click();
		driver.findElement(By.xpath(".//*[@id='profession-1']")).click();
		driver.findElement(By.xpath(".//*[@id='tool-0']")).click();
		driver.findElement(By.xpath(".//*[@id='tool-1']")).click();
		driver.findElement(By.xpath(".//*[@id='tool-2']")).click();
		Select continents = new Select(driver.findElement(By.xpath(".//*[@id='continents']")));
		continents.selectByIndex(5);
		Select SCommands = new Select(driver.findElement(By.xpath(".//*[@id='selenium_commands']")));
		SCommands.selectByVisibleText("Switch Commands");
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
		
	}
}
