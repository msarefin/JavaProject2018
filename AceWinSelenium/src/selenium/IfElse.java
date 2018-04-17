package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfElse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

		WebElement male = driver.findElement(By.xpath(".//label[contains(.,'Male')]"));
		
		if(male.isSelected()) {
			System.out.println("Male is selected");
		}
		else {
			System.out.println("male is not selected");
		}
		
		
		driver.quit();
	}
}
