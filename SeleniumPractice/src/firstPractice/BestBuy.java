package firstPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BestBuy {

	public static void main(String[] args) {

		String os = System.getProperty("os.name").toLowerCase();
		String webaddress, url, PageTitle;
		webaddress = "http://www.bestbuy.com/";

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
		
		driver.get(webaddress);
		
		driver.findElement(By.xpath(".//*[@id='gh-search-input']")).sendKeys("4k tv");
		Actions ac = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(".//*[@id='suggestViewClientComponent']/div/div/div/div/div[1]/div/ul/li[3]/a"));
		ac.moveToElement(we).build().perform();
		
		driver.quit();
	}
}
