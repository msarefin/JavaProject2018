package selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimingAlert {
	
	public static void main(String[] args) {
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://toolsqa.com/automation-practice-switch-windows/";
		
		

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
		System.out.println("Chrome Browser Launched");
		driver.manage().window().maximize();
		driver.get(webaddress);
		driver.findElement(By.xpath(".//*[@id='timingAlert']")).click();
		
//		TimingAlert ta = new TimingAlert();
		WebDriverWait wdw = new WebDriverWait(driver,30);
		
		
		Alert a = wdw.until(ExpectedConditions.alertIsPresent());
		
		a.accept();
		
	}

	void switchwindow(WebDriver driver, String xpath) {
		
		String win = driver.getWindowHandle();
		driver.findElement(By.xpath(xpath)).click();
		
		Set <String> wins = driver.getWindowHandles();
		
		for(String winn: wins) {
			if(!winn.equals(win)) {
				driver.switchTo().window(winn);
			}
		}
		
		System.out.println(driver.getTitle());
	}
}
