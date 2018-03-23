package testing;

public class StarArray {
	
	public  static void main(String [] args) {
		
		String[] a = new String [5];
		
		
		for(int i = 0; i<a.length; i++){
			a[i]="*";
			for(int j = 0; j <i; j++){
				System.out.print(a[j]);
			}
			System.out.println();
		}
		
		
	}

}
