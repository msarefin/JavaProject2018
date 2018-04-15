package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ErrorHandling {

	public static void main(String[] args) {
		String ExpectValue="* Minimum 10 Digits starting with Country Code";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//WebElement dancecheck = driver.findElement(By.xpath("//input[@value='dance']"));
		driver.findElement(By.xpath("//input[@id='phone_9']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sadsadsa");
		
		WebElement error=driver.findElement(By.xpath("//span[contains(.,'* Minimum 10 Digits starting with Country Code')]"));
		String Actualvalue=error.getText();
		
		Select month=new Select(driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		month.selectByVisibleText("12");
		
		Select day=new Select(driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		day.selectByVisibleText("15");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@id='yy_date_8']")));
		year.selectByVisibleText("1995");
		
		if(Actualvalue.equals(ExpectValue)) {
			System.out.println("PASS!!!");
		}else {
			System.out.println("FAIL");
		}	
		
		driver.close();
	}
}
