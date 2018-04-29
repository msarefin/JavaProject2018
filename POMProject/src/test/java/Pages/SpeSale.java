package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class SpeSale extends Lib{

	public static void printTitle (WebDriver driver) {
		
//		String title = driver.getTitle();
		 
//		System.out.println("Here is special sale page the title :::: "+title);
		
		System.out.println("Here is the title :: "+GNPrintTitle(driver) );
		
	}
	
	public static void HowToDraw(WebDriver driver) throws InterruptedException, IOException {
//		WebElement HowToDraw = driver.findElement(By.xpath("//a[contains(.,'How to Draw')]"));
//		HowToDraw.click();
		
		FindEle(driver,ReadProperty("Draw")).click();
		Thread.sleep(1000);
		
		
		
		
	}
	
	
}
