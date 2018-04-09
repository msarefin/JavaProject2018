package workingWithConstructors;

public class Vehicle {

	String color;

	Vehicle() {
		this.setColor("Red");
	}

	Vehicle(String c) {
		this.setColor(c);
	}

	public void setColor(String c) {
		this.color = c;

	}

}
