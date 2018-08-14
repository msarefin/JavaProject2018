package PracticeingJava;

public class InsertionSort {

	int[] SortingNumber(int[] array) {

		int temp;

		for(int i = 1; i<array.length; i++){
            for(int j = 0; j<=i; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    
                }
            }
        }

		return array;

	}
	

}
