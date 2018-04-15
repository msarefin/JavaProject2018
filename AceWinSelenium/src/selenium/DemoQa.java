package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximized window
		Thread.sleep(1000);
		driver.get("http://demoqa.com/registration/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dancecheck = driver.findElement(By.xpath("//input[@value='dance']"));
		// checking this checkbox is checked or unchecked
		// if it is check, isselected will return true//if it is unchecked, isselected
		// will return false
		if (dancecheck.isSelected()) {
			System.out.println("this checkbox is checked 1");
			// only print when checkbox is checked
		} else {
			dancecheck.click();
			// only when checkbox is unchecked
		}
		driver.findElement(By.xpath("//input[@value='reading']")).click();
		driver.findElement(By.xpath("//input[@value='cricket ']")).click();
		driver.findElement(By.xpath("//input[@value='married']")).click();
		// driver.findElement(By.xpath("//input[@value='cricket ']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@value='dance']")).click();
		// this if/else is only for print purpose, and want to make sure it is
		// checked!!!
		if (dancecheck.isSelected()) {
			System.out.println("this checkbox is checked 2");
		} else {
			dancecheck.click();
		}

		Thread.sleep(5000);
		driver.close();
	}
}
