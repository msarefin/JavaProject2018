package TestNGClasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 {

	@Test(priority=1, description="rediff.com")
	public void TestRediff() {
		SoftAssert asserts = new SoftAssert(); 
		asserts.assertEquals(12, 15);
		System.out.println("rediff is an indian website");
		asserts.assertAll();
	}
	
	@Test(priority=2, description="Alibaba.com")
	public void TestAlibaba() {
		System.out.println("Alibaba is a chinese website");
	}
	
}
