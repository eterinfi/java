package data.type.numbers.math;

public class ExpLogDemo {
	public static void main(String[] args) {
		double x = 11.635;
		System.out.printf("e 的值为 %.4f%n", Math.E);
		System.out.printf("exp(%.3f) 为 %.3f%n", x, Math.exp(x));
		System.out.printf("log(%.3f) 为 %.3f%n", x, Math.log(x));
	}
}