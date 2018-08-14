package tutor1;

public class Food {

//Class is a Borad CLASSification 
    
    
    /*
    Multiline Comment
    
    ChocolateBar - sweet, nuts, cold
    Sandwitch - salty, spicy, vegetables, meat, cold, hot
    Smoothie - sweet, fruits, cold
    
    */
    
    // -----------------------------Method Area------------------------
    void taste(){
        System.out.println("This food tastes good");
    }
    
    void taste(String taste){
        System.out.println(taste);
    }
    
    void taste(String taste1, String taste2){
        System.out.println(taste1+" jksdjslkdfglvksbdf "+taste2);
    }
    
    void taste( int taste22){
        System.out.println(taste22);
    }
    
    String fillings(){
    	
    	String msg = "This have what i Like !";
    	
    return msg ;
    }
    
    void Temp(){
        
    }
    
    void A() {
    	Food dfd = new Food();
    	
    	String apple = dfd.fillings();
    	
    	System.out.println(apple+"******************");
    }
    
    void m () {
    	B = "Don't like";
    }
    
    void abc() {
    	
    	String lcl = "sdfgdfgsdf"; //
    	
    	System.out.println(lcl);
    }
    
    
//    -------------------------- variable area -----------------
    
    String A = "I ";
    String B = "like "; //Don't like
    String C = "Cake ";
    
    String m1 = A +B +C;
    
    
    String y; // instance variable 
    static String S; // static variable 
    
    
    
    
    
//    -----------------------------------main method area --------------------

    public static void main(String[] args) {
    	
    	
    	
    	
    	String local= "jhgcjxhdzhfdx"; 
    	
    	// Reference  variable
		Food ChocolateBar = new Food(); // type var = new constructor
		
		ChocolateBar.abc();
		
		ChocolateBar.y = "Y is second last letter in the alphabet";
		
		System.out.println(ChocolateBar.y);
		
		Food xyz = new Food();
		
		System.out.println(xyz.y);
		
//		ChocolateBar.S = "sdfgsdfjg";
		
		System.out.println(xyz.S);
		
		System.out.println(local);
		
		System.out.println(ChocolateBar.A+ChocolateBar.B+ChocolateBar.C);
		
		ChocolateBar.m();
		
		System.out.println(ChocolateBar.A+ChocolateBar.B+ChocolateBar.C);
		
		System.out.println(ChocolateBar.m1);
		
		
		ChocolateBar.taste();
		
		ChocolateBar.taste("Sweet");
		
		ChocolateBar.taste("salty","sweet");
		
		System.out.println(ChocolateBar.fillings());
		
		String orange = ChocolateBar.fillings();
		
		System.out.println(orange);
		
//		ChocolateBar.A();
	}
    
}
