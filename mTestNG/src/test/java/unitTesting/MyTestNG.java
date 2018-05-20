package unitTesting;

//import org.junit.Test;

import org.testng.annotations.Test;


public class MyTestNG {

	
	@Test(priority=1, description="This test case verifies login functionality")
	public void LoginApplication() {
		System.out.println("This is a TestNG test!!!");
	}
	
	@Test(priority=2, description="This test case verifies item selection")
	public void selectItem() {
		System.out.println("This is the second method");
	}
	
	@Test(priority=3, description="This test caseverifies checkout")
	public void checkout() {
		System.out.println("This is the third");
	}
	
}
