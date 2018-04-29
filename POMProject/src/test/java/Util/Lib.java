package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	File f1 = new File(System.getProperty("user.dir")+"\\locator.properties");
	FileInputStream fis =  new FileInputStream(f1);
	Properties prop = new Properties();
	prop.load(fis);
	String locator = prop.getProperty(key);
	return locator;
	}

	public static void TakeScreenShot(WebDriver driver) {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\Aney\\Google Drive\\PNT2018\\My class\\Selenium\\Screenshot\\err.png"))
		}
	}
	
	// why is this missing from mac?
}
