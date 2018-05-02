package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class CheckOut extends Lib {

	public static void titlePage(WebDriver driver) {
		System.out.println(GNPrintTitle(driver));
	
	}
	
	public static void userCred(WebDriver driver, String xpath) throws IOException {
		
		FindEle(driver,ReadProperty("email")).sendKeys("name@email.com");
		FindEle(driver,ReadProperty("newCiustomer")).click();
		FindEle(driver, ReadProperty("signup")).click();
		FindEle(driver, ReadProperty("firstname")).sendKeys("Alexander");
		FindEle(driver, ReadProperty("lastname"));
		FindEle(driver, ReadProperty("company"));
		FindEle(driver, ReadProperty("address1"));
		FindEle(driver, ReadProperty("address2"));
		FindEle(driver, ReadProperty("city"));
//		FindEle(driver, ReadProperty("country"));
//		FindEle(driver, ReadProperty("state"));
		FindEle(driver, ReadProperty("zip"));
		FindEle(driver, ReadProperty("telephone"));
		FindEle(driver, ReadProperty("fax"));
		FindEle(driver, ReadProperty("password"));
		FindEle(driver, ReadProperty("confirmpass"));
		
		
		
		
		
		
	}
	
}
