package Day3;

public class Looping {

public static void main(String[]args) {
				
		String p="peoplentech";
		char c; 
		int l = p.length(); 
//		byte n; 
		System.out.println(p+" is "+l+" \n Characters long");
		System.out.println("-----------------");
		
		System.out.println("Character | Index ");
		System.out.println("-----------------");
		
		for(int i=0; i<l;i++) {
			
			c = p.charAt(i);
			
			
			System.out.println(c +"         | "+ i);
			
			
		}
	}
}

