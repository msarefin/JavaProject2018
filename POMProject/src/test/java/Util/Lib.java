package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	public static String GNPrintTitle(WebDriver driver) {
		String value = driver.getTitle();
		return value;

	}

	public static WebElement FindEle(WebDriver driver, String xpath) {

		WebElement Ele = driver.findElement(By.xpath(xpath));
		return Ele;

	}

	public static String ReadProperty(String key) throws IOException {
		File f1 = new File(System.getProperty("user.dir") + "\\locator.properties");
		FileInputStream fis = new FileInputStream(f1);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;
	}

//	public static void TakeScreenshot(WebDriver driver, String name) throws IOException {
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(src,
//				new File("C:\\Users\\Aney\\Google Drive\\PNT2018\\My class\\Selenium\\Screenshot\\"+name+".png"));
//
//	}
	
//	public static void getCurrentTime(WebDriver driver) {
//		Calendar cal = Calendar.getInstance(); 
//		SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:SS");
//		System.out.println(sdf.format(cal.getTime()));
//		
//		
//	}
	
	
	public static void TakeScreenshot(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("C:\\Users\\Aney\\Google Drive\\PNT2018\\My class\\Selenium\\Screenshot\\"+name+".png"));

	}
	public static String getCurrentTime(WebDriver driver) {
		Calendar cal = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:SS");
		return sdf.format(cal.getTime());
		
		
	}

	// why is this missing from mac?
}
