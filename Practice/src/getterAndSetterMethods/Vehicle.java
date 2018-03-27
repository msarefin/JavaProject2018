package getterAndSetterMethods;

public class Vehicle {
	private String color;

//	getter
	public String getColor() {
		
		return color; // the method simply returns the value applied to the variable color
	}
	
//	setter
	public void setColor(String c) { 
		this.color = c;  // the String value of c is applied to color
	}
}
