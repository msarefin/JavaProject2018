package BootCamp.Com.Apple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Lib;

public class TestDriver extends Lib {

	public static void main(String[] args) throws IOException {

		WebDriver driver;

		String address = "https://www.apple.com/";

		// WebDriverSelectorByOS();
		//
		// // Webdriver is interface
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		//
		// driver.get(address);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		// driver.quit();

		File src = new File("C:\\Users\\Aney\\Documents\\JavaProject2018\\Com.Apple\\Excel\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0); 
		
		sh.getRow(0).createCell(2).setCellValue("heloo ");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
		WriteExcel("ReadExcel.xlsx", 0, 1, 2, "My name is Sunny ");
		
		ExcelBook("ReadExcel.xlsx");
		String value = GetExcelData(0, 1, 2);
		
		
		System.out.println(value);
	}	

	
		
	

}
