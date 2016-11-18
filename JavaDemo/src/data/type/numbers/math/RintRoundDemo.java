package data.type.numbers.math;

public class RintRoundDemo {
	public static void main(String[] args) {
		double d = 100.675;
		double e = 100.500;
		double f = 100.200;
		System.out.println(Math.rint(d));
		System.out.println(Math.rint(e));
		System.out.println(Math.rint(f));
		System.out.println();
		float g = 90f;
		float h = 100;
		System.out.println(Math.round(d));
		System.out.println(Math.round(e));
		System.out.println(Math.round(h));
		System.out.println(Math.round(g));
	}
}