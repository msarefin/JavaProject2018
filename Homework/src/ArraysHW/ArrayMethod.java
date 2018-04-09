package ArraysHW;

public class ArrayMethod {

	
	int number []= {-12,13,56,-78,-99,0,-100};
	
//	public void myarr() {
//		int m[] = {12,34,-5,12,0,-13};
//	}
	
	public static void main(String[] args) {
		
		int number []= {-12,13,56,-78,-99,0,-100};
		//minimum
		
		//ArrayMethod a = new ArrayMethod();
		
		int min = number[0];
		int max = number[0];
		
		
		for(int i=0; i <number.length;i++) {
			if(number[i]<min) {
				min = number[i];
				
			}
		}
		
		System.out.println(min);
		
		for(int j =0; j <number.length; j++) {
			if(number[j]>max) {
				max = number[j];
			}
		}
		
		System.out.println(max);
	}
	
	
		
}
