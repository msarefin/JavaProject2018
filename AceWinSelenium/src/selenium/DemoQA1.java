package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA1 {

	DemoQA1() {
		System.out.println("Testing the DemoQA website");
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aney\\Documents\\JavaProject2018\\AceWinSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);

		driver.get("http://www.demoqa.com/registration/");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
		System.out.println("Clicked on the radio button");
		WebElement dance = driver.findElement(By.xpath("//input[@value='dance']"));
		WebElement reading = driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div[1]/input[2]"));
		WebElement cricket = driver.findElement(By.xpath("//input[@value='cricket ']"));
		if (dance.isSelected() || reading.isSelected()) {
			System.out.println("Dance is selected");
		} else {

			dance.click();
			reading.click();

		}
		Thread.sleep(1000);

		if (dance.isSelected() || reading.isSelected()) { // isSelected checks if the radio button or check box is selected
			System.out.println("Dance and reading are selected");
		} else {

			dance.click();
			reading.click();

		}
		
		cricket.click();// clicks on the cricket check box
		Thread.sleep(1000);
		driver.close();
	}

}
