package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElements {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		WebElement footer = driver.findElement(By.xpath(".//*[@id='globalContainer']/div[2]"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		System.out.println(footer.getAttribute("a"));
		System.out.println(footer.getLocation());
		System.out.println(footer.getCssValue("a"));
		footer.isDisplayed();
		footer.isEnabled(); 
		footer.isSelected();
		
		driver.close();
	}
}
