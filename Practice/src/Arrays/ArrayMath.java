package Arrays;

public class ArrayMath {

	public static void main(String[] args) {
		
		int n[] = {6,42,3,7};
		
		int sum = 0;
		
		for(int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		System.out.println(sum);
		
	}
	
}
