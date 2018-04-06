package enumurated;

public class Program {

	public static void main (String [] args) {
		Rank a = Rank.Soldier;
		
		switch (a) {
		case Soldier:
			System.out.println("Soldier says hi!");
			break; 
		case Sergent:
			System.out.println("Sergent says Hello");
			break; 
		case Captain:
			System.out.println("Captain says Welcome");
			break;
		}
	}
}
