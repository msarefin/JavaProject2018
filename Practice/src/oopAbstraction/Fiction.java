package oopAbstraction;

public class Fiction extends Book {

	Fiction(String publisher) {
		super("Penguin");

	}

	@Override
	void title() {
		// TODO Auto-generated method stub
		System.out.println("Harry Potter");
	}

	@Override
	void Author() {
		// TODO Auto-generated method stub
		System.out.println("J K Rawling");
	}

	@Override
	void pages() {
		// TODO Auto-generated method stub
		System.out.println(325);
	}

	public static void main(String [] args) {
		
		Fiction f = new Fiction("Strange");
		f.title();
		f.Author();
		f.pages();
	
	}
}
