package oop;

public class Toyota extends Transportation{


	
    void wheels(int a){
        System.out.print("The mode of transportatios has "+ a+" wheels \n");
        System.out.print("it has "+ a+" wheels \n");
    }

	@Override
	void body(String color) {
		
		System.out.println("The color is "+color);
		
	}

	 public void radio() {
		int i = 14; 
		String a = "hi";
		
		for(int a1 = 13; a1 >0; a1--) {
			System.out.println(a1);
		}
		
	}

	public void SteringWheel() {
		// TODO Auto-generated method stub
		
	}

	public void speedMeter() {
		// TODO Auto-generated method stub
		
	}

	public void RPM() {
		// TODO Auto-generated method stub
		
	}
	
}
