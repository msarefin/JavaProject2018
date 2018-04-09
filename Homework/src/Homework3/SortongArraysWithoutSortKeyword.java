package Homework3;

public class SortongArraysWithoutSortKeyword {

	public static void main (String[] args) {
		
		int [] a = {3,7,9,10,6};
		int x = a[0];
		
		for(int i = 0;i<a.length;i++) {
			
			
			if(a[i]>x) {
				x = a[i];
				
				System.out.println(a[i]);
			}
		}
	}
	
}
