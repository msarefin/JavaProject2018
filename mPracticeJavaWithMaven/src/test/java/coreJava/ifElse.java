package coreJava;

public class ifElse {

	public static void main(String[] args) {
		
		int i = 9; 
		int j = 25;
		
		if(i<10||j >20) {
			System.out.println(i+ " is less than 10");
			System.out.println(j+ " is less than 20");
		}
		else if (i<10 && j >20) {
			System.out.println("both conditions satisfied");
		}
		else {
			System.out.println("not satisfactory");
		}
		
		
		if (i%2==0) {
			System.out.println("number is is even ");
		}else {
			System.out.println("number is is odd");
		}
		
	}

}
