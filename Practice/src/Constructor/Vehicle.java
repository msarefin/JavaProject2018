package Constructor;

public class Vehicle {
	
	
	//This is a constructor	
	
	private String color;
	
	
//	Vehicle(){
//		color = "red";
//	}
//	
//	Vehicle(String c){
//		color = c; 
//	}
	
	Vehicle(){
		this.setColor("megenta");
	}
	
	Vehicle(String c){
		this.setColor(c);
	}
	
	
	public void setColor(String c) {
		this.color = c; 
	}

	

}
