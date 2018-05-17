package Utils;

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
import org.openqa.selenium.support.ui.Select;

public class Lib {
	
	public static void driverSeclectorByOS() {
		
		String os, address;

		address = "https://www.ebay.com/";

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.out.println("Project Running on MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.out.println("Project running on Windows");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("Project Running on Linux");
		}

	}

	// read from locators.properties file
	public static String ReadProperty(String key) throws IOException {
		File f1 = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ObjectRepository\\locators.properties");
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

	// mouse over send key
	public static void mouseTxt(WebDriver driver, String xpath, String keys) {
		Actions ac = new Actions(driver);
		ac.moveToElement(LocateByXpath(driver, xpath)).click().sendKeys(keys).build().perform();
	}

	// webelement click
	public static void WebElementclick(WebDriver driver, String xpath) {
		LocateByXpath(driver, xpath).click();
	}

	// webelement get text
	public static String WebElementtxt(WebDriver driver, String xpath) {
		String Headertxt = LocateByXpath(driver, xpath).getText();
		return Headertxt;
	}

	// WebElement sendkey
	public static void WebElementSendKy(WebDriver driver, String xpath, String key) {
		LocateByXpath(driver, xpath).sendKeys(key);
	}

	// selection by index
	public static void SelectionByIndex(WebDriver driver, String xpath, int index) {
		Select DropDown = new Select(LocateByXpath(driver, xpath));
		DropDown.selectByIndex(index);
	}

	// selection by visible text
	public static void SelectionByText(WebDriver driver, String xpath, String text) {
		Select DropDown = new Select(LocateByXpath(driver, xpath));
		DropDown.selectByVisibleText(text);
	}
//checkBox
	public static void checkBox(WebDriver driver, String xpath) throws IOException {

		if (LocateByXpath(driver, xpath).isSelected()) {
			System.out.println(WebElementtxt(driver, ReadProperty("checkBox")) + " is preselected");
		} else {
			mouseClick(driver,xpath);
		}

	}
	

}

	

