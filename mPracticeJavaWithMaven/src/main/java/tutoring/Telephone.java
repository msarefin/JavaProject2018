package tutoring;

public class Telephone {

	
	// -----------------variables-------------------
	
	
	String name = "Alexander Grahambell";
	String ep = "Listen to conversation";
	String mic = "Talk to people";
	
	// -----------------Constructors-------------------
	
	Telephone(){ // This is a constructor
		System.out.println(name);
	}
	
	Telephone(String manufacturer){
		System.out.println();
	}
	
	// -----------------Methods-------------------
	
	void earpiece() {
		System.out.println(ep);
	}
	
	void mic() {
		System.out.println(mic);
	}
	
	
	
	// -----------------Main Method-------------------
	
	public static void main(String[] args) {
		
		String msg = "Telephones have come a long way";
		
	}
	
	
}
