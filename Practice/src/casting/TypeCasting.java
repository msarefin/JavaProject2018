package casting;

class TypeCasting {

	public static void main(String[] args) {

		int a = (int) 3.65;
		double pi = 3.14159;

		System.out.println(a); // This will print 3 only

		int b = (int) pi;

		System.out.println(b);
	}
}
