package TestNGClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGClasses.TestNGListeners.class)

public class TestCase2 extends TestNGListeners{

	@Test(priority=1, description="This is facebook" ) 
	public void TestFB() {
		System.out.println("Facebook is working properly");
	}
	
	@Test (priority = 2, description= "This is twitter")
	public void testtwitter() {
		System.out.println("This is the Twitter Method");
	}
	
	@Test(priority = 3, description = "This is Google")
	public void TestGoogle() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		
		Assert.assertEquals(13, 14);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	 
}
