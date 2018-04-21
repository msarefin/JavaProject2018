package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.manage().deleteAllCookies();
		System.out.println("All cookies deleted");
		
		driver.get(webaddress);
		System.out.println("Navigated to web address");
	
		Actions ac = new Actions(driver);

		driver.findElement(By.xpath(".//*[@id='alert']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='alert']")).click();
		Thread.sleep(5000);
		
		String Alertmsg = driver.switchTo().alert().getText();
		
		System.out.println(Alertmsg);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
}
