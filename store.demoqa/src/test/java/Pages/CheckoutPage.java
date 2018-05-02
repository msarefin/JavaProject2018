package Pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import Util.Lib;

public class CheckoutPage extends Lib {

	public static void PageTitles(WebDriver driver) {
		System.out.println(PageTitle(driver));
	}

	public static void subtotal(WebDriver driver) throws IOException, InterruptedException {
		String Subtotal = WebElementtxt(driver, ReadProperty("subtotal"));
		System.out.println("Subtotal is: "+Subtotal);
		TakeScreenshot(driver,"Subtotal");
		WebElementclick(driver,ReadProperty("continue"));
		Thread.sleep(1000);
		System.out.println("Clicked on continue");
		
	}
	
	public static void Total(WebDriver driver) throws IOException, InterruptedException {
		String Total = WebElementtxt(driver,ReadProperty("Total"));
		System.out.println("The Total is: "+Total);
		mouseover(driver,ReadProperty("Total"));
		Thread.sleep(1000);
		TakeScreenshot(driver,"Checkout");
		System.out.println("---------------------- Checkout Page Tested----------------------");
	}

}