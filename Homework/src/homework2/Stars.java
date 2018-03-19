package homework2;

public class Stars {


	public static void main(String[] args) {
		String s = "*";
		int n = 7;
		
		for(int i =1; i <=n;i=i+2 ) {
			for(int j =1; j<=i ;j++ ) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
}
