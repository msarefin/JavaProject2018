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
		System.out.println("This is a constructor and it will always be the first one to run!!");
	}
	
	Vehicle(String c){
		this.setColor(c);
	}
	
	
	public void setColor(String c) {
		this.color = c; 
	}

	

}
