package tutor1;

class A {
	   
	   A(){
	       System.out.println("This from constructor");
	   }
	   
	   
	   A(String am){
	       System.out.println(am);
	   }
	   
	   A(int m ){
	       System.out.println(m);
	   }
	   
	   String m = "instance var"; 
	   static String n = "static var"; 
	   



	   void first(){
	       String lcl = "local in non return type method";
	       
	       System.out.println(lcl);
	   }
	   
	   static String second(){
	       
	       String lcl = "local variable in a return type method";
	       return lcl;
	   }
	   
	   public static void main(String [] args){
	       A a = new A();
	       
	       
	       
	       new A().first();
	       
	       
	       a.first();
	       System.out.println(second());
	       
	       new A().second();
	       
	       
	       System.out.println(a.m);
	       System.out.println(new A().m);
	       
	       System.out.println(n);
	       
	   }
	   
	   
	}

