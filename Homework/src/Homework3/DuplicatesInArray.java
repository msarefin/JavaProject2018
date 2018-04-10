package Homework3;

public class DuplicatesInArray {

	DuplicatesInArray() {
		System.out.println("Find the duplicates in thearray Q4");
	}

	public static void main(String[] args) {
		Homework3 h = new Homework3();

		System.out.println("The Array contains the following values:");
		for (int a : h.a2) {
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("The duplicates in the array are: ");
		for (int i = 0; i < h.a2.length; i++) {
			for (int j = 0; j < h.a2.length; j++) {
				if ((h.a2[i] == h.a2[j]) && (i !=j) ) {
					System.out.println(h.a2[i]);
				}

			}

		}
	}

}
