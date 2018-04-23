package SeleniumHW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TheGreatCourse {

	public static void main (String[] args) throws InterruptedException {
		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "https://www.thegreatcourses.com/";
		
		

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
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-home']/span/a")));
		System.out.println("Mouse over Courses");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='nav']/ul/li[12]/a/span"))).click().build().perform();
		System.out.println("Clicked on science");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println(PageTitle);
		
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Best Sellers']"))).click().build().perform();
		System.out.println("Clicked on sort drop down menu");
		ac.moveToElement(driver.findElement(By.xpath("//*[text()='Title: A to Z']"))).click().build().perform();
		System.out.println("Sorted by A to Z");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		
		int size = driver.findElements(By.tagName("a")).size();
		
		System.out.println("There are "+size+" links ");
		
		ac.moveToElement(driver.findElement(By.xpath("//*[text()='A New History of Life']"))).click().build().perform();
		System.out.println("Cicked on book");
		WebElement popup = driver.findElement(By.xpath("//*[@id='raleigh-body']"));
		if(popup.isDisplayed()) {
			driver.findElement(By.xpath("//a[@class='raleigh-element-close raleigh-close']")).click();
			System.out.println("popup was closed");
		}
		else {
			System.out.println("no popup was displayed");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='media-format-radio']/div[3]/label"))).click().build().perform();
		System.out.println("cliked on DVD");
		ac.moveToElement(driver.findElement(By.xpath("//button[@id='add-to-wishlist-btn']"))).click().build().perform();
		System.out.println("added to wish list");
		
		WebElement we = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div"));
		
		if(we.isDisplayed()) {
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='create-account-button']"))).click().build().perform();
		System.out.println("clicked on create account");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='email_address']"))).click().sendKeys("alexander@email.com").build().perform();
		System.out.println("Email entered");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='firstname']"))).click().sendKeys("Alexander").build().perform();
		System.out.println("First name entered");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='firstname']"))).click().sendKeys("Hamilton").build().perform();
		System.out.println("Last name entered");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='password']"))).click().sendKeys("***************").build().perform();
		System.out.println("Password entered");
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='confirmation']"))).click().sendKeys("***************").build().perform();
		System.out.println("reconfirm the password");
		ac.moveToElement(driver.findElement(By.xpath("//input[@id='accept_terms']"))).click().build().perform();
		System.out.println("Accept terms");
		}
		else {
			System.out.println("Registration Failed");
		}
		
		System.out.println("Test Passed");
		
		Thread.sleep(5000);
		driver.close();
	}
}
