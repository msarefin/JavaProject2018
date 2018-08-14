package PracticeingJava;

public class UsingSortingAlgo {

	public static void main(String[] args) {
		
		int [] array = {6,1,4,8,5,2,9,3,234,23,5,36,1,45,7,8,80,0,67,44,34};
		
		InsertionSort ins = new InsertionSort();
	
		ins.SortingNumber(array);
		
		for(int res: array) {
			System.out.println(res);
		}
		
		
	}
	
}
