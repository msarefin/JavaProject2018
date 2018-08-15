package oop;

public class camry {

	 public String ToyptaCamry = "My faborate car!";
	
	public static void main(String[] args) {
		
		Toyota tc = new Toyota();
		Transportation cam = new Toyota();
		//Toyota cam1 = (Toyota) new Transportation();
		
		tc.wheels(4);
		tc.wheels(2, "wheels**********");
		
		cam.wheels(3);
		
		System.out.println(cam.Mycar);
	
		
		

	}

}
