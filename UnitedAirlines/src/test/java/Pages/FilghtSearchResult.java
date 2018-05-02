package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class FilghtSearchResult extends Lib{

	public static void PageTitles(WebDriver driver) {
		System.out.println(PageTitle(driver));
	}
	
	public static void chooseTicket(WebDriver driver) throws IOException {
		WebElementclick(driver,ReadProperty("Select"));
	}
	
	public static void reserve(WebDriver driver) throws IOException {
		WebElementclick(driver,ReadProperty("reserve"));
	}
}
