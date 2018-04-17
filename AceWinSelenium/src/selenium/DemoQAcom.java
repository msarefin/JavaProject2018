package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAcom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");

		String address,url,PageTitle;
		address = "http://www.DemoQA.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(address);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url = driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		System.out.println(url);
		System.out.println("------------------"+PageTitle+"------------------");
		
		
		driver.findElement(By.xpath("//a[@href='http://demoqa.com/registration/']")).click();
		System.out.println("clicked on register");
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("Went back");
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("went forward");
		Thread.sleep(5000);
		driver.navigate().to(url);
		System.out.println("Navigated to web URL");
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("refreshed page ");
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("Went back");
		Thread.sleep(5000);
		
		url = driver.getCurrentUrl();
		PageTitle = driver.getTitle();
		System.out.println(url);
		System.out.println("------------------"+PageTitle+"------------------");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='name_3_firstname']")).sendKeys("Samantha"); 
		System.out.println("Entered first name");
		driver.findElement(By.xpath(".//*[@id='name_3_lastname']")).sendKeys("Smith");
		System.out.println("Entered last name");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
		System.out.println("Clicked on married");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[1]")).click();
		System.out.println("clicked on dance");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[2]")).click();
		System.out.println("clicked on reading");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
		System.out.println("Clicked on cricket");
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		
		country.selectByIndex(15);
		System.out.println("selected a  country");
		
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='mm_date_8']")));
		
		month.selectByValue("6");
		System.out.println("Month enetered");
		
		Select day = new Select(driver.findElement(By.xpath(".//*[@id='dd_date_8']")));
		day.selectByValue("13");
		
		System.out.println("Day enetered");
		
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='yy_date_8']")));
		
		year.selectByVisibleText("1996");
		System.out.println("Entered year");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).sendKeys("8003456789");
		System.out.println("Phone Number entered");
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("user3458");
		System.out.println("username entered");
		
		driver.findElement(By.xpath(".//*[@id='email_1']")).sendKeys("user@email.com");
		System.out.println("Entered email");
		
		driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		System.out.println("Entered text in about yourself");
		
		driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys("******************");
		System.out.println("entered password ");
		
		driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys("******************");
		System.out.println("reconfirmed the password ");
		System.out.println(driver.findElement(By.tagName("Footer")).getSize());
		driver.findElement(By.tagName("Footer")).getSize();
		
		driver.quit();
	}
}
