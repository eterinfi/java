package struct.oop.interfacing;

public class MammalDemo implements Animal {
	@Override
	public void eat() {
		System.out.println("Mammal eats");
	}

	@Override
	public void travel() {
		System.out.println("Mammal travels");
	}
	
	public int noOfLegs() {
		return 0;
	}

	public static void main(String[] args) {
		MammalDemo m = new MammalDemo();
		m.eat();
		m.travel();
	}
}