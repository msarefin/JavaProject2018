package BootCamp.Com.Apple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Lib;

public class TestDriver extends Lib {

	public static void main(String[] args) throws IOException {

		WebDriver driver;

		String address = "https://www.apple.com/";

		 WebDriverSelectorByOS();
		
		 // Webdriver is interface
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get(address);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 
		 driver.findElement(By.xpath(".//*[@id='ac-gn-searchform-input']"));
		 
		
		 driver.quit();

		
		
//		System.out.println(value);
	}	

	
		
	

}
