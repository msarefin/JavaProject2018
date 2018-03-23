package Looping;

public class stars {

	public static void main(String[]args) {
		String star = "*";
		
		for(int i = 1; i<=5; i++) {
			for(int j=5; j>=i; j--){
				System.out.print(star);
				
			}
			System.out.println();
		}
	}
}
