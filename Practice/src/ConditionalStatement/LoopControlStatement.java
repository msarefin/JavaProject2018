package ConditionalStatement;

public class LoopControlStatement {

	public static void main(String[] args) {
		
		int i = 1;
		//----------------------------------break-----------------
		while(i >0) {
			System.out.println(i);
			if(i == 10) {
				break;
			}
			i++;
		}
		
		//---------------------------continue---------------------
		
		
		System.out.println("-----------------Program skipped 30 from the sequence!---------------------------");
		for(int x = 10; x <=40; x=x+10) {
			if(x==30) { // the output will skip 30
				continue;
			}
			System.out.println(x);
		}
		//---------------------------continue---------------------
	}
}
