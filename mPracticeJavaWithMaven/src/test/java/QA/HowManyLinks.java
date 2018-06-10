package QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class HowManyLinks {

	public static void main(String[] args) throws InterruptedException {

		String os, address, url;

		address = "http://www.apple.com";

		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.out.println("Test Running from MAC");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.out.println("Test Running from Windows");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("Test Running from Linux");
		}

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get(address);

		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("There are " + size + " links on this page");

		WebDriverWait t = new WebDriverWait(driver, 5);
		
		for (int i = 0; i < size; i++) {

			String tag = driver.findElements(By.tagName("a")).get(i).getAttribute("id");
			String link = driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			String pages = driver.findElements(By.tagName("a")).get(i).getText();
			
			
			url = driver.getTitle();
			int counter = i + 1;

			try {
				if(driver.findElement(By.tagName("a")).isDisplayed()) {
//				System.out.print(counter + " " + "  " + tag + "   " + pages + "  " + link + "  ");
				driver.findElements(By.tagName("a")).get(i).click();
				}
				t.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName("img")));

			} catch (Exception e) {
				System.out.println("invisible link");
			}

			driver.navigate().to(address);
			Thread.sleep(1000);

			if (link.equals(url)) {
				System.out.print(counter + " " + "  " + tag + "   " + pages + "  " + link + "  ");
				System.out.println("url matched");

			} else {
				System.out.print(counter + " " + "  " + tag + "   " + pages + "  " + link + "  ");
				System.out.println("url mismatch");
			}

			// if(!link.isEmpty() && !pdages.isEmpty()) {
			// System.out.println(counter+" "+pages+"::"+link);
			// }

		}

		driver.quit();
	}

}
