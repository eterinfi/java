package data.type.numbers.math;

public class SinCosTanDemo {
	public static void main(String[] args) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		System.out.format("pi 的值为 %.4f%n", Math.PI);
		System.out.format("%.1f 度的正弦值为 %.4f%n", degrees, Math.sin(radians));
		System.out.format("%.1f 度的余弦值为 %.4f%n", degrees, Math.cos(radians));
		System.out.format("%.1f 度的正切值为 %.4f%n", degrees, Math.tan(radians));
	}
}