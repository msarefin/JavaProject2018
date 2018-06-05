package QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		String os, address;
		address = "http://www.yahoo.com";

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("you are running on linux");
		}

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(address);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement link = driver.findElement(By.linkText("Mail"));
		
		driver.findElement(By.name(name))
		
		System.out.println(link.getSize());
		String tagname = link.getTagName();
		String text = link.getText();
		String links = link.;
		
		System.out.println(links+"::"+text);
//		System.out.println(link);
		driver.close();

	}

}
