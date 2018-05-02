package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lib {

	// read from locators.properties file
	public static String ReadProperty(String key) throws IOException {
		File f1 = new File(System.getProperty("user.dir") + "\\locators.properties");
		FileInputStream fis = new FileInputStream(f1);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;

	}

	// Take Screenshot
	public static void TakeScreenshot(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\Screenshots\\" + name + ".png"));
	}

	// Get page Title
	public static String PageTitle(WebDriver driver) {
		String Title = driver.getTitle();
		return Title;
	}

	// locate by xpath
	public static WebElement LocateByXpath(WebDriver driver, String xpath) {
		WebElement xp = driver.findElement(By.xpath(xpath));
		return xp;
	}

	// mouse over
	public static void mouseover(WebDriver driver, String xpath) {
		Actions ac = new Actions(driver);
		// ac.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();;
		ac.moveToElement(LocateByXpath(driver, xpath)).build().perform();
	}

	// mouse over click
	public static void mouseClick(WebDriver driver, String xpath) {

		Actions ac = new Actions(driver);
		ac.moveToElement(LocateByXpath(driver, xpath)).click().build().perform();
	}

	public static void WebElementclick(WebDriver driver, String xpath) {
		LocateByXpath(driver, xpath).click();
	}

	public static String WebElementtxt(WebDriver driver, String xpath) {
		String Headertxt = LocateByXpath(driver, xpath).getText();
		return Headertxt;
	}

}
