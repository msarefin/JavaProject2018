package valueType;

public class ReferanceType {

	public static void main(String[] args) {
		
		Person j; 
		/* Created a reference variable by creating an object (instance of a class)
		 * Reference variable stores a reference on the memory
		 */
		j = new Person("John"); 
		
		j.setAge(20);
		
		celegrateBirthday(j);
		
		System.out.println(j.getAge());
		
	}
	
	static void celegrateBirthday(Person p) {
		p.setAge(p.getAge()+1);
	}
}
