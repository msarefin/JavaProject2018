package homework2;

public class NumPattern {

	public static void main (String[] args) {
		
		int n = 1; 
		int row = 4; 
		for(int i=1; i <=row;i++) {
			System.out.print("row"+i+"|" );
			for(int j =1; j <=i;j++) {
				System.out.print(n+" ");
				n++;
				
			}
			System.out.println();
		}
	}
}
