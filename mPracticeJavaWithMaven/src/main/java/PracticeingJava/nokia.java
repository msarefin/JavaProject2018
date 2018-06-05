package PracticeingJava;

public class nokia extends Phone{

	String model;
	
	private String country = "finland";
	
	nokia(String model){
		System.out.println("Nokia originated in ".concat(country.toUpperCase()));
		this.model = model; 
		System.out.println("The model is ".concat(model.toUpperCase()));
	}
	
	
}
