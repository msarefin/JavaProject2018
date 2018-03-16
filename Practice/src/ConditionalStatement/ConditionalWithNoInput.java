package ConditionalStatement;


public class ConditionalWithNoInput {

	public static void main(String[] args) {
		int age = 25; 
		int money = 500;
		String msg = "Welcome!";
		String m = "You are old enough!";
		
		// Nested Loop
		
		if(age >=18) {
			if(money >=500) {
				System.out.println(msg);
			}
		}
		if(age >= 18 && money >=500) {
			System.out.println(msg);
		}
		if(age >=18 || money >=500) {
			System.out.println(msg);
		}
		if (!(age<18)) {
			System.out.println(m);
		}
	}
}
