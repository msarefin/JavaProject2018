package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.excite.com");

		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);

		String url = driver.getCurrentUrl();
		System.out.println(url);

//		String PageSource = driver.getPageSource();
//		System.out.println(PageSource);

		driver.findElement(by.)
		
		driver.close();
	}
}
