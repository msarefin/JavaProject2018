package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Home extends Lib {

	public static void PageTitles(WebDriver driver) {
		System.out.println(PageTitle(driver));
	}

	public static void RadioBtn(WebDriver driver) throws IOException {
		WebElementclick(driver, ReadProperty("RoundTripRB"));
	}

	public static void From(WebDriver driver) throws IOException {
		mouseTxt(driver, ReadProperty("From"), "IDA");
	}

	public static void IDA(WebDriver driver) throws IOException {
		mouseClick(driver, ReadProperty("IDA"));
	}

	public static void To(WebDriver driver) throws IOException {
		mouseTxt(driver, ReadProperty("To"), "BOS");
	}

	public static void BOS(WebDriver driver) throws IOException {
		mouseClick(driver, ReadProperty("BOS"));
	}

	public static void DepDate(WebDriver driver) throws IOException {
		mouseClick(driver, ReadProperty("DepartDate"));
		mouseClick(driver, ReadProperty("May15"));
	}

	public static void RetDate(WebDriver driver) throws IOException {
		mouseClick(driver, ReadProperty("ReturnDate"));
		mouseClick(driver, ReadProperty("May17"));
	}

	public static void Travelers(WebDriver driver) throws IOException, InterruptedException {
		mouseClick(driver, ReadProperty("Travelers"));
		mouseClick(driver, ReadProperty("AdultPlus"));
		mouseClick(driver, ReadProperty("AdultMinus"));
		mouseClick(driver, ReadProperty("SeniorPlus"));
		mouseClick(driver, ReadProperty("SeniorMinus"));
		mouseClick(driver, ReadProperty("child15_17Plus"));
		mouseClick(driver, ReadProperty("child15_17Minus"));
		mouseClick(driver, ReadProperty("child12_14Plus"));
		mouseClick(driver, ReadProperty("child12_14Minus"));
		mouseClick(driver, ReadProperty("child5_11Plus"));
		mouseClick(driver, ReadProperty("child5_114Minus"));
		mouseClick(driver, ReadProperty("child2_4Plus"));
		mouseClick(driver, ReadProperty("child2_4Minus"));
		mouseClick(driver, ReadProperty("Inf2Plus"));
		mouseClick(driver, ReadProperty("inf2Min"));
		mouseClick(driver, ReadProperty("InfLapPlus"));
		mouseClick(driver, ReadProperty("infLapMin"));

	}

	public static void CabinType(WebDriver driver) throws IOException {
		SelectionByIndex(driver, ReadProperty("CabinType"), 1);

	}

	public static void nonstop(WebDriver driver) throws IOException {
		checkBox(driver, ReadProperty("checkBox"));
	}

	public static void Search(WebDriver driver) throws IOException {
		WebElementclick(driver, ReadProperty("Search"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
