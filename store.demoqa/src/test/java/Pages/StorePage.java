package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class StorePage extends Lib{

	public static void PageTitles(WebDriver driver) {
		System.out.println(PageTitle(driver));
	}
	
	public static void iphone(WebDriver driver) throws IOException, InterruptedException {
		mouseover(driver,ReadProperty("Product_category")); // mouse over product category
		System.out.println("mouse over product category");
		Thread.sleep(1000);
		TakeScreenshot(driver,"StoreIphone");
		mouseClick(driver, ReadProperty("iPhone")); // mouse over clicked on iphone
		System.out.println("mouse over clicked on iphone");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("---------------------- Store Page Tested----------------------");
	}
}
