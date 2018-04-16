package SeleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\SeleniumHomeworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		String url, PageTitle;
		
		url = driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println("---------------------"+PageTitle+"---------------------");
		
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("Samantha");
		System.out.println("Entered first name");
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Smith");
		System.out.println("Entered last name");
		driver.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("samantha.smith@email.com");
		System.out.println("Email Entered");
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("whatismypassword");
		System.out.println("password entered");
		
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		Select day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		
		month.selectByVisibleText("Mar");
		day.selectByVisibleText("12");
		year.selectByVisibleText("1993");
		
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_s']")).click();
		
		driver.close();
		
	}
}
