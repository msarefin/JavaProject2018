package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class iPhonesPage extends Lib {

	public static void PageTitles(WebDriver driver) {
		System.out.println(PageTitle(driver));

	}
	
	public static void HeaderInfo(WebDriver driver) throws IOException {
		String header = WebElementtxt(driver, ReadProperty("iPhonePageHeader"));
	
		System.out.println("The Header is: "+header);
	}
	
	public static void AddToCart(WebDriver driver) throws IOException, InterruptedException {
//		LocateByXpath(driver,ReadProperty("iPhone4s16ATC")).click();
		WebElementclick(driver,ReadProperty("iPhone4s16ATC"));
		System.out.println("iPhone 16GB Black added to cart");
//		LocateByXpath(driver,ReadProperty("iPhone4s32ATC")).click();
		WebElementclick(driver,ReadProperty("iPhone4s32ATC"));
		System.out.println("iPhone 32GB White added to cart");
		Thread.sleep(1000);
		TakeScreenshot(driver,"iPhonesSelected");
//		String ItemsInCart = LocateByXpath(driver,ReadProperty("ItemsInCart")).getText();
//		System.out.println("There are "+ItemsInCart+"items in cart");
//		number of items in cart was not detected in the test
//		LocateByXpath(driver,ReadProperty("Checkout")).click();
		WebElementclick(driver,ReadProperty("Checkout"));
		System.out.println("Checkout link clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("---------------------- iPhone Page Tested----------------------");
		
	}
}
