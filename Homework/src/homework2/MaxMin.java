package homework2;

public class MaxMin {

	public static void main(String[]args) {
		int a = 10; 
		int b = 25; 
		int c = 35; 
		int d = -10; 
		String m = "Maximum is ";
		String n = "Minimum is ";
		
		//-------------Maximum------------------
		
		if(a>b && a>c && a>d) {
			System.out.println(m+a);
		}
		else if(b>a && b>c && b>d) {
			System.out.println(m+b);
		}
		else if(c>a && c>b &&c>d) {
			System.out.println(m+c);
		}
		else {
			System.out.println(m+d);
		}
		
		//-------------Minimum------------------
		
		if(a<b && a<c && a<d) {
			System.out.println(n+a);
		}
		else if(b<a && b<c && b<d) {
			System.out.println(n+b);
		}
		else if(c<a && c<b && c<d) {
			System.out.println(n+c);
		}
		else {
			System.out.println(n+d);
		}
		
		
	}
}
