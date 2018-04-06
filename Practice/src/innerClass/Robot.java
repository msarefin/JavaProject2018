package innerClass;

class Robot {

	int id;
//constructor
	Robot(int i) {
		id = i;
		Brain b = new Brain();
		b.think();
	}

	// inner class
	private class Brain {
		public void think() {
			System.out.println(id + " is Thinking");
		}
	}

	// main class
	public static void main(String[] args) {
		Robot r = new Robot(01);

	}
}
