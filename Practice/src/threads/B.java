package threads;

public class B {

	public static void main  (String[] args) {
		Thread t = new Thread(new Loader());
		t.start();
	}
}
