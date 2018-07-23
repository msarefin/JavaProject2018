package coreJava;

public class A {

	A(){
//		This is a default constructor it exist even if you do not declare any constructors
//		any declared constructor simply overrides the default constructor
	}
	
	A(String name){
		System.out.println("hello, My name is "+ name );
//		This is a constructor 
	}
	
	A(String name, int age){
		System.out.println("hello, My name is "+name);
		System.out.println("I am "+age+" years old!");
//		This is also a constructor 
	}
	
	public static void main(String [] args) {
		
		A first = new A();
		A second = new A("Alex");
		A third = new A("Daniel", 23);
		
		first= new A("Jenny");
		
		/*
		 * The instances of the methods are created above 
		 * This is a multi-line comment
		 */
		
		byte a = 8; 
		short b = 16;
		int c = 32;
		long d = 64;
		float e = 32.0f;
		double f = 64.0f;
		boolean g = false; 
		
		String str = "String is not a primitive data type";
		
		System.out.println();
		System.out.println("byte size: "+a);
		System.out.println("short size: "+b);
		System.out.println("int size is: "+c);
		System.out.println("long size is:"+ d);
		System.out.println("float size is:"+ e);
		System.out.println("double size is:"+ f);
		System.out.println("boolean is either True or " + g);
		
		System.out.println(str);
		
		int num1, num2, num3, result;
		num1 = 100; 
		num2 = 30;
		num3 = 20; 
		
		result =(num1+ num2+ num3); 
		System.out.println("Sum :"+result);
		result = (num1*num2*num3);
		System.out.println("product:"+result);
		double result1 = (double) (num1/num2/num3); // This is casing the the value from one data type to another
		System.out.println("division:" +result1);
		result = num1%num2%num3; 
		System.out.println("modulus: "+result);
		
		System.out.println();
		
		int i = 1; 
		int j = ++i; 
		System.out.println(j); // increases the value first then assigns the value
		i = 1; 
		j = i++;
		System.out.println(j); // assigns the value first and then increases it
		
		
		System.out.println("-------------------------String Functions------------------------");
		
		char character = 'a';
		
		System.out.println(character);
		
	}
	
}
