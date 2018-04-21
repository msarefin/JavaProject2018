package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {

	public static void main(String[] args) throws InterruptedException {
		
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress, url, PageTitle;
		
		webaddress = "http://toolsqa.com/iframe-practice-page/";
		
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("IF1"); // Switching for frame by name
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Alexander");
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Hamilton");
//		driver.findElement(By.linkText("Link Test")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath(".//*[@id='ui-id-5']")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='tabs-1']/p[2]")).getText());
		
		Thread.sleep(1000);
		
		driver.quit();
	}
}
