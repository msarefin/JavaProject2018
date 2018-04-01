package oopAbstraction;

public abstract class Book {

	Book(String publisher){
		System.out.println("The Author is "+publisher);
	}
	
	abstract void title();

	abstract void Author();

	abstract void pages();
	
	
	

}
