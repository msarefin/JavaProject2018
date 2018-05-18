package unitTesting;

import org.testng.Assert;

public class calculator extends applycalculator {

	public static void main(String[] args) {

		calculator cal = new calculator();

		Assert.assertEquals(cal.subtraction(35, 15), 10);
		
		
		int result = cal.addition(15, 10);

		System.out.println(result);

//		Assert.assertEquals(result, 15);

	}

}
