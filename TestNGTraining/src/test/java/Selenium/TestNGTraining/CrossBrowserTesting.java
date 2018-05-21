package Selenium.TestNGTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver driver; 
	
	
	@Test
	@Parameters("browser")
	public void browsers(String browsername) {
		System.out.println(browsername);
	}
	 
}
