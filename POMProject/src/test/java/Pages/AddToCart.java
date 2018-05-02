package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class AddToCart extends Lib{

	public static void printTitle(WebDriver driver) {
		System.out.println(GNPrintTitle(driver));
	}
	
	public static void ClickOnCheckout(WebDriver driver) throws IOException, InterruptedException {
		
		WebElement Checkout = FindEle(driver,ReadProperty("Checkout"));
		Checkout.click();
		Thread.sleep(1000);
		
		TakeScreenshot(driver, "Checkout");
		getCurrentTime(driver);
		System.out.println(getCurrentTime(driver));
	}
	
	public static void DollarAmount(WebDriver driver) throws IOException, InterruptedException {
		
		String dollar = FindEle(driver, ReadProperty("dollars")).getText();
		Thread.sleep(1000);
	}
	
	
	
}
