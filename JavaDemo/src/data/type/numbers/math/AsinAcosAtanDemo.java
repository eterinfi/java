package data.type.numbers.math;

public class AsinAcosAtanDemo {
	public static void main(String[] args) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		System.out.format("pi 的值为 %.4f%n", Math.PI);
		System.out.format("%.4f 的反正弦值为 %.1f 度%n", Math.sin(radians), Math.toDegrees(Math.asin(Math.sin(radians))));
		System.out.format("%.4f 的反余弦值为 %.1f 度%n", Math.cos(radians), Math.toDegrees(Math.acos(Math.cos(radians))));
		System.out.format("%.4f 的反正切值为 %.1f 度%n", Math.tan(radians), Math.toDegrees(Math.atan(Math.tan(radians))));
	}
}