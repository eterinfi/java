package struct.control.looping;

public class DoWhileDemo {
	public static void main(String[] args) {
		int x = 10;
		do {
			System.out.print("value of x is " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);
	}
}