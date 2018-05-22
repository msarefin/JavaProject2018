package TestNGTesting;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegressionTesting {

	
	@Test(priority = 1, description = "Regression test")
	@Parameters("Regression")
	public void regression(@Optional String Reg) {
		System.out.println(Reg);
	}
	
	
}
