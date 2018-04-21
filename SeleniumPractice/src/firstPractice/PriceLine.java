package firstPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceLine {

	public static void main(String [] args) throws FileNotFoundException {
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://www.priceline.com/";
		
		

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
//		System.out.println("Browser launched");
		driver.manage().window().maximize();
		System.out.println("window maximized");
		driver.get(webaddress);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File f1 = new File("C:\\Users\\Aney\\Google Drive\\PNT2018\\My class\\Selenium\\ClassCode\\priceline.xlsx");
		FileInputStream pl = new FileInputStream(f1);
		XSSFWorkbook wk = new XSSFWorkbook(pl);
		XSSFSheet sh = wk.getRow(0);
		XSSFCell cell = rw.getCell(0);
		String value = cell.getStringValue();
		wk.close();
		
		
	}
}
