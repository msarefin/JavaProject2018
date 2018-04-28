package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class HowTo extends Lib {

//	Getting Tite
	
	public static void PageTitle(WebDriver driver) {
		
		System.out.println("-----------------"+GNPrintTitle(driver));
	}
	
//	Click on DVD
	
	public static void ClickDVD(WebDriver driver) throws IOException {
		
		WebElement DVD = FindEle(driver,ReadProperty("DVD"));
		DVD.click();
	
	}
	
//	add to cart 
	
	
	public static void AddToCart(WebDriver driver) throws IOException {
		WebElement AddToCart = FindEle(driver, ReadProperty("AddToCart"));
		AddToCart.click();
	}
}
