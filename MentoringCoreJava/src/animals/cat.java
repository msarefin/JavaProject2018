package animals;

import Alphabet.A;
import Alphabet.C;

public class cat{

	
	String n1= "John";
	String n2= "alex";
	String n3= "samantha";

	public static void main(String[]args) {
		
		String n1= "John";
		String n2= "alex";
		String n3= "samantha";
		
		A a = new A(); 
//		prints constructor message from A
//		B b = new B(); This is a Default class from the alphabet package from the alphabet package  
		C cc = new C();
		cc = new C(n1);
		cc = new C(n1,n2);
		
		a.main(args); // Hello Alexander - printed from class A
		System.out.println(cc.character); // the variable character from class B inherited into class C 
		
		
		
	}
	
}
