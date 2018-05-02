package Alphabet;

public class C extends B{// This is a public class
//	this is inheritance. all attributes of B are available in C

	public C() {
		
	}
	
	public C(String NOM) { //this is a public constructer
		super(NOM); // Super keyword refers to the super class B
			
		
	} 
	
	
	public C(String alpha, String beta){
		super(alpha, beta);
	}
	
	

}
