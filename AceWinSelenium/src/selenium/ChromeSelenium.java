package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String PageSource = driver.getPageSource();
//		System.out.println(PageSource);

//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@email.com");
//		
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.name("email")).sendKeys("Hello world!");
//		driver.findElement(By.linkText("Forgot account?")).click();
//		driver.get("http://faceboo.com");
//		driver.findElement(By.partialLinkText("provide my birthday?"));
//		driver.get("http://faceboo.com");
//		driver.findElement(By.className(""));
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.cssSelector(""));
		/*
		 * web elements contain 
		 * id  -> id is unique
		 * class -> class is not unique
		 * name 
		 * tags
		 * css
		 * 
		 */
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("loginbutton"));
		WebElement fname = driver.findElement(By.name("firstname"));
		WebElement lname = driver.findElement(By.name("lastname"));
		WebElement mobemail = driver.findElement(By.xpath(".//*[@id='u_0_f']"));
		WebElement vmobemail = driver.findElement(By.xpath(".//*[@id='u_0_i']"));
		WebElement npass = driver.findElement(By.xpath(".//*[@id='u_0_m']"));
		WebElement submit = driver.findElement(By.xpath(".//*[@name='websubmit']"));
		/*
		 * <input id="u_0_f" class="inputtext _58mg _5dba _2ph-" type="text" aria-label="Mobile number or email" placeholder="" aria-required="1" name="reg_email__" data-type="text"/>
		 * 
		 * list of possible xpath
		 * driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		 * driver.findElement(By.xpath("//input[@id='u_0_f']"));
		 * 
		 * 
		 */
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Email.sendKeys("name@email.com");
		Thread.sleep(1000);
		Pass.sendKeys("***************");
		Thread.sleep(1000);
//		login.click();
		fname.sendKeys("Alex");
		Thread.sleep(1000);
		lname.sendKeys("Jackson");
		Thread.sleep(1000);
		mobemail.sendKeys("name@email.com");
		Thread.sleep(1000);
		
		if(vmobemail.isDisplayed()) {
			
			vmobemail.sendKeys("name@email.com");
		}
		
		npass.sendKeys("********************");
		
		Thread.sleep(3000);
		submit.click();
		
//		driver.wait(3000); -> For some reason this doesn't work
		
		driver.close();
	}
}
