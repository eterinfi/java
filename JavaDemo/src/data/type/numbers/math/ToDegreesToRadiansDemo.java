package data.type.numbers.math;

public class ToDegreesToRadiansDemo {
	public static void main(String[] args) {
		double x = 45.0;
		double y = 30.0;
		double a = Math.toRadians(x);
		double b = Math.toRadians(y);
		System.out.println(Math.toDegrees(a));
		System.out.println(Math.toDegrees(b));
		System.out.println();
		System.out.println(a);
		System.out.println(b);
	}
}