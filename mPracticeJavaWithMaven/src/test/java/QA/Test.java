package QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		String os, address;
		address = "https://login.salesforce.com/";

		// ChromeDriver locator
		os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Mac/chromedriver");
		} else if (os.contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Windows\\chromedriver.exe");
		} else {
			System.out.println("you are running on linux");
		}

		// Starting ChromeDriver will launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// Delete all cookies
		driver.manage().deleteAllCookies();
		// Maximize the windows
		driver.manage().window().maximize();
		// Go to the Web Address
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");

		Thread.sleep(5000);
		driver.findElement(By.className("username")).clear();
		driver.findElement(By.cssSelector("a#forgot_password_link")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();

		System.out.println(title);
		System.out.println(title.length());

		System.out.println(driver.getPageSource().length());
		driver.navigate().to("http://www.facebook.com");
		System.out.println(driver.getTitle());

		boolean selection = driver.findElement(By.cssSelector("input[name='sex']")).isSelected();

		if (selection) {
			System.out.println(
					driver.findElement(By.xpath("//label[contains(text(),'Female')]")).getText() + " is selected");
		} else {
			System.out.println(
					driver.findElement(By.xpath("//label[contains(text(),'Female')]")).getText() + " is not selected");
		}

		driver.navigate().to("https://www.amazon.com/");

		// driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("The
		// art of the deal");
		//
		// driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).clear();

		System.out.println(driver.getCurrentUrl());

		Actions ac = new Actions(driver);

		ac.moveToElement(driver.findElement(By.linkText("Departments"))).build().perform();

		driver.navigate().to("https://www.united.com/ual/en/us/");

		driver.findElement(By.cssSelector("input#SearchTypeMain_oneWay")).click();

		boolean returns = driver.findElement(By.cssSelector("label[for='ReturnDate']")).isDisplayed();

		if (returns) {
			System.out.println("return is enabled");
		} else {
			System.out.println("return is disabled");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println();
		// Gets all the texts within the tag including the subtag
		String text = driver.findElement(By.tagName("fieldset")).getText();

		System.out.println(text);

		text = driver.findElement(By.tagName("fieldset")).getTagName();

		Thread.sleep(1000);

		System.out.println();

		System.out.println(text);

		text = driver.findElement(By.tagName("fieldset")).getAttribute("id");

		Thread.sleep(1000);

		System.out.println();

		System.out.println(text);

		System.out.println();

		Thread.sleep(5000);

		// driver.navigate().back();

		driver.close();

	}

}
