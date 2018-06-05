package PracticeingJava;

public class Phone implements PhoneInterface{

	private String founder = "Alexander Grahambel";
	public String earpiece = "You can listen to the other person through the ear piece";
	 String mic = "You can Talks to the other person through the mic";
	protected String num = "Phone has 10 numbers (0-9)";
	
	Phone(){
		
		System.out.println("The telephone was invented by ".concat(founder));
	}
	
	public void EarPiece() {
		System.out.println(earpiece);
	}
	

	public void mic() {
		System.out.println(mic);
		
	}

	public void NumKey() {
		System.out.println(num);
		
	}
	
	public void receiver() {
		
		System.out.println("The receiver is a toggle switch that allows you to receive calls and turn on the dial tone");
		
	}
	
	class barcode{
		
		public double price(double dollar) {
			return dollar*1.08875;
			
		}
	}
	
}
