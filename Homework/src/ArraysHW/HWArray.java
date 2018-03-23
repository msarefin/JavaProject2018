package ArraysHW;

public class HWArray {

	public static void main(String[] args) {
		

		//ArrayMethod y = new ArrayMethod();
		
	

		ArrayMethod x = new ArrayMethod();
		
		for(int i = 0; i <x.number.length;i++) {
			if(x.number[i]>0) {
				System.out.println(x.number[i]+" is Positive ");
				
			}
			else if(x.number[i]<0) {
				System.out.println(x.number[i]+" is Negative ");
			}
			else {
				System.out.println(x.number[i]+" is Zero ");
			}
		}
		
	}

}
