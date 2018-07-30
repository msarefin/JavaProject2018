package tutoring;

public class AnanymousClassFromCarInterface {

	public static void main(String [] args) {
		
		carInterface cf = new carInterface(){

			public void engine() {
				// TODO Auto-generated method stub
				
			}

			public int door(int door) {
				// TODO Auto-generated method stub
				return 0;
			}

			public String color(String color) {
				// TODO Auto-generated method stub
				return null;
			}

			public String Manufacturor(String manyfacturer) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		cf.color("red");
		cf.door(4);
		
		
	}
	
}
