package ClassPractice;

public class day1 {

	//This is a single line comment 
	
			/*
			 * This is a multi-line comment
			 */
			
			/**
			 * This is a Documentation comment 
			 * This converted to html format for documentation by JDK
			 */
			
			/*******
			 * This is a start of a method
			 */
			
			
	
	public static void main(String[] args) {
		
		
		System.out.println("This is my first Java Porject");
		
		// Java variables 
		
		int a = 1; 
		double b = 2.43; 
		float c = 3.14f; 
		
		String name = "name";
		char group = 'Z';
		
		boolean online = true;
		
		System.out.println(group);
		
		System.out.println(online);
		
		/*
		 * Java mathematical operations 
		 * 
		 * '+' -- Add 
		 * '_' -- Subtract
		 * '*' -- Multiply
		 * '/' -- Divide
		 * '%' -- Modolus
		 */
		
		int x= 15;
		int y = 4; 
		int result = x/y; 
		
		System.out.println(result);
		
		int n = 10; 
		int m = 10;
		int alpha = ++n; // the value of n is first incremented an then printed
		int beta = m++; // The value of m is printed first and then incremented
		
		System.out.println(alpha+","+beta);
		
		
		int num1 = 12; 
		int num2 = 15; 
		
		num1+=num2; // num1 = num1 + num2
		System.out.println(num1);
		num1-=num2; // num1 = num1 - num2
		System.out.println(num1);
		
		String stars = "* ** *** **** ****";
		
		
	}
}
