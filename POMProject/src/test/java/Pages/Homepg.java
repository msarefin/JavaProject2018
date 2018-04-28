package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Homepg extends Lib {

//	public static WebDriver driver;
	
	/*
	 * 
	 */
	
	public static void ptintTitle(WebDriver driver) {
//		String title = driver.getTitle();
//		
//		System.out.println("here is the homepage title:::: "+title);
		System.out.println("The Page title is"+GNPrintTitle(driver));
		
	}
	
	public static void clickspe(WebDriver driver) throws InterruptedException, IOException {
//		WebElement speLink = driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/a"));
		WebElement Spelink = FindEle(driver,ReadProperty("SpecialSale"));
//		speLink.click();
		Spelink.click();
		Thread.sleep(1000);
	
	}
}
