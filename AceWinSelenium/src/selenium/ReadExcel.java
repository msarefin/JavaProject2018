package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	// This is to read the excel form the file

	public static void main(String[] args) throws IOException, InterruptedException {

		String os = System.getProperty("os.name").toLowerCase();
		String webaddress, url, PageTitle;
		webaddress = "http://www.facebook.com";
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			System.out.println("You are arunning a Mac Machine");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			System.out.println("You are running a Windows Machine");
		} else {
			System.out.println("You are using linux");
		}

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);

		// File f1 = new
		// File("C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\ReadExcel.xlsx");
		// FileInputStream fis1 = new FileInputStream(f1);
		// XSSFWorkbook wk1 = new XSSFWorkbook(fis1);
		// XSSFSheet sh1 = wk1.getSheetAt(0);
		// XSSFRow rw1 = sh1.getRow(1);
		// XSSFCell cell1 = rw1.getCell(0);
		// String value1 = cell1.getStringCellValue();
		// System.out.println(value1);
		//
		// -------------------------------------------------------

		// File fl = new File((System.getProperty("user.dir") + "\\ReadExcel.xlsx"));
		// FileInputStream fis = new FileInputStream(fl);
		// XSSFWorkbook wk = new XSSFWorkbook(fis);
		// XSSFSheet sh = wk.getSheetAt(0);
		// XSSFRow rw = sh.getRow(1);
		// XSSFCell cell = rw.getCell(0);
		// String value = cell.getStringCellValue();
		// System.out.println(value);

		/*
		 * if you use xlsx use XSSF if you use xls use HSSF
		 */

		ReadExcel rxl = new ReadExcel();

		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(rxl.readexcels(driver, 1, 2));

		Thread.sleep(1000);

		driver.quit();

	}

	public String readexcels(WebDriver driver, int col, int row) throws IOException {

		File fl = new File((System.getProperty("user.dir") + "\\ReadExcel.xlsx"));
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheetAt(0);
		XSSFRow rw = sh.getRow(row - 1);
		XSSFCell cell = rw.getCell(col - 1);
		String value = cell.getStringCellValue();
		return value;
		// System.out.println(value);

		/*
		 * if you use xlsx use XSSF if you use xls use HSSF
		 */

	}
}
