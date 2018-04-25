package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePG {

//	public static WebDriver driver;
	
	public static void ptintTitle(WebDriver driver) {
		String title = driver.getTitle();
		
		System.out.println("here is the title "+title);
	}
	
	public static void clickspe(WebDriver driver) throws InterruptedException {
		WebElement speLink = driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/a"));
		speLink.click();
		Thread.sleep(1000);
	
	}
}
