package SeleniumHW1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComUnited {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.selenium.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\SeleniumHomeworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
//		Opening chrome browser
		driver.manage().deleteAllCookies();
//		Delete all cookies 
		driver.manage().window().maximize(); 
		// maximize the window
		String address = "https://www.united.com/ual/en/us/?root=1";
		String url;
		String PageTitle;
		String price;
		String airline;
		
		
		driver.get(address); 
//		launch the website
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Wait for upto 10 seconds till page loads
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		System.out.println(url);
		System.out.println(PageTitle);
		
		System.out.println("----------------------------------------"+PageTitle+"----------------------------------------");
		
		WebElement roundTrip = driver.findElement(By.xpath(".//*[@id='SearchTypeMain_roundTrip']"));
		WebElement from  = driver.findElement(By.xpath(".//*[@id='Origin']"));
		WebElement to = driver.findElement(By.xpath(".//*[@id='Destination']"));
		WebElement DepartDate = driver.findElement(By.xpath(".//*[@id='specificDateSection']/div[1]/label"));
		WebElement ArivalDate = driver.findElement(By.xpath(".//*[@id='returnDateTimeDiv']/label"));
		WebElement travelers = driver.findElement(By.xpath(".//*[@id='travelers-selector']/span/span[2]"));
		WebElement nonStop = driver.findElement(By.xpath(".//*[@id='NonStopOnly']"));
		WebElement search = driver.findElement(By.xpath(".//*[@id='flightBookingSubmit']"));
		
		
//		WebElement cabinType = driver.findElement(By.xpath(".//*[@id='travelers-selector']/span/span[2]"));

		Select Cabintypes = new Select(driver.findElement(By.xpath("//select[@id='cabinType']")));
		
		
//		WebElement f1 = driver.findElement(By.xpath("//div[@data-code='IAD']")); -> Didn't work
		
		roundTrip.click();
		System.out.println("Roundtrip was clicked");
		Thread.sleep(1000);
		
		from.sendKeys("WAS");
		System.out.println("WAS was entered");
		Thread.sleep(1000);
		
//		f1.click(); -> Didnt work
		driver.findElement(By.xpath(".//*[@id='flightSearch']/fieldset/div[2]/div[1]/span[2]/div[2]/div[1]/div[1]")).click();
		System.out.println("First option is clicked");
		Thread.sleep(1000);
		
		to.sendKeys("BOS");
		System.out.println("BOS was entered");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(".//*[@id='flightSearch']/fieldset/div[2]/div[2]/span[2]/div[2]/div[1]/div[1]")).click();
		System.out.println("First option is clicked");
		Thread.sleep(1000);
		
		DepartDate.click();
		
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[6]/a")).click();
		System.out.println("Departure date Entered");
		
		ArivalDate.click();
		
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		System.out.println("Arival date Entered");
		Thread.sleep(1000);
		
		travelers.click();
		
		driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[1]/div/a[2]")).click();
		System.out.println("Adults increased by 1");
		driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[2]/div/a[2]")).click();
		System.out.println("Seniors increased by 1");
		
//		cabinType.click();
		Cabintypes.selectByVisibleText("Business or First");
		Cabintypes.selectByIndex(1);
		System.out.println("Business or First is selected");
		
		Thread.sleep(1000);
		
		if(nonStop.isSelected()) {
			System.out.println("Non-Stop was pre-Selected");
		}
		else {
			nonStop.click();
			System.out.println("Non-stop is selected");
		}
		
		Thread.sleep(1000);
		
		search.click();
		System.out.println("Search was clicked");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("----------------------------------------New Webpage----------------------------------------");
		url = driver.getCurrentUrl(); 
		PageTitle = driver.getTitle();
		
		System.out.println(url);
		System.out.println(PageTitle);
		
		System.out.println("----------------------------------------"+PageTitle+"----------------------------------------");
		
		Thread.sleep(10000);
		
//		airline = driver.findElement(By.xpath(".//*[@id='flight-recommendation-variant1']/div[2]/div[1]/div[3]/i")).getText();	
		price = driver.findElement(By.xpath(".//*[@id='sr_product_FIRST_110-641-UA']/div/div[2]")).getText();
		
//		System.out.println(airline);
		System.out.println(price);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='farewheel-placeholder']/div/div[2]/div/a[4]/div[2]")).getText());
		
		driver.close();
	}
}
