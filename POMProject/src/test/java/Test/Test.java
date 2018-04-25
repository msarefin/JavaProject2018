package Test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public WebDriver driver;
	
	@Before
	
	public void initialize() {
//		String os = System.getProperty("os.name").toLowerCase();
		String webaddress,url,PageTitle;
		webaddress = "http://store.demoqa.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aney\\Documents\\JavaProject2018\\POMProject\\chromedriver.exe");

//		if (os.contains("mac")) {
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
//			System.out.println("You are arunning a Mac Machine");
//		} else if (os.contains("windows")) {
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
//			System.out.println("You are running a Windows Machine");
//		} else {
//			System.out.println("You are using linux");
//		}

		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(webaddress);
		
	}
}
