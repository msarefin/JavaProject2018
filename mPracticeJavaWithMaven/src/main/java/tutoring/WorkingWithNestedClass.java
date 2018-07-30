package tutoring;

import tutoring.WorkingWithNestedClass.inner;

public class WorkingWithNestedClass {

	protected class inner {
		
		protected void secretmethod() {
			System.out.println("This is a nested method");
		}
		
	}
	
	
	public static void main(String [] args) {
		
		access a = new access();
		a.accessing();
		
	}
	
}


class access{
	
	void accessing(){
		
		WorkingWithNestedClass outer = new WorkingWithNestedClass();
		
		WorkingWithNestedClass.inner secret = outer.new inner();
		
		secret.secretmethod();
		
	}
	
}