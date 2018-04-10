package Homework3;

public class MaxAndMin {

	MaxAndMin() {
		System.out.println("The maximum and minimum from the array Q2 Q3");
	}

	public static void main(String[] args) {

		Homework3 h = new Homework3();

		System.out.println("The value in the array are");
		for (int a : h.a1) {
			System.out.print(a + " ");

		}

		System.out.println();

		int max = h.a1[0], min =h.a1[0];

		for (int i = 0; i < h.a1.length; i++) {
			
			if(h.a1[i]>max) {
				max = h.a1[i];
			}
			if(h.a1[i]<min) {
				min = h.a1[i];
			}
		}
		
		System.out.println("The Highest number is "+max);
		System.out.println("The Lowest numberis "+min);
	}
}
