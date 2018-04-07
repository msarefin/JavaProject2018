package runtimeVsCheckedExceptions;

class MyClass {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			//This is an example of a checked exception. If unchecked it will prevent the program from compiling
		}
		
		int value = 7; 
		value = value/0; 
		//This is an unchecked exception
	}
}
