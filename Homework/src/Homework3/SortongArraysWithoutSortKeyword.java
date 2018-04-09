package Homework3;

public class SortongArraysWithoutSortKeyword {

	public static void main(String[] args) {

//		sorting arrays without the sort function
		
		int[] a = { 3, 7, 9, 10, 6 };
		int x = a[0];

		for (int i : a) {
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		for(int i = 0; i<a.length;i++) {
			for(int j = 1;j<a.length; j++) {
				if(a[i]>a[j]) {
					System.out.print(a[i]+"| ");
					System.out.println();
					System.out.print(a[j]+" *");
				}
				
			}
		}
	}

}
