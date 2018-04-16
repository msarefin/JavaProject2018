package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingError {

	HandlingError(){
		System.out.println("Working on negative testing by inuting invalid data, and working on selecting ");
	}
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String errorMSG = "* Minimum 10 Digits starting with Country Code";
		//Setting up the expected error message
		
		WebElement lname = driver.findElement(By.xpath(".//input [@id='name_3_lastname']"));
		lname.sendKeys("Tyring");
		// entering text in the text field
		driver.findElement(By.xpath(".//*[@id='phone_9']")).sendKeys("654"); 
		// entering invalid phone number
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sfdfafga");
		//Entering invalid user name
		WebElement error = driver.findElement(By.xpath("//*[@class='legend error']"));
		String ActualValue = (error.getText()).trim();
		
		System.out.println(ActualValue);
		System.out.println(errorMSG);
		
		
		/*
		 * The drop down selection box is used to select the month, day and year
		 */
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		month.selectByVisibleText("12");
		
		Thread.sleep(1000);
		
		Select day = new Select(driver.findElement(By.xpath(".//select[@id='dd_date_8']")));
		day.selectByVisibleText("15");
		
		Thread.sleep(1000);
		
		Select year = new Select(driver.findElement(By.xpath(".//select[@id='yy_date_8']")));
		year.selectByVisibleText("1985");
		Thread.sleep(5000);
		
		/*
		 * 
		 */
		
		
		if(ActualValue.equals(errorMSG)) {
			System.out.println(errorMSG+" was displayed");
		}
		else {
			System.out.println("Correct error message was not displayed");
		}
		
		
		Thread.sleep(1000);
		driver.close();
	}
}
