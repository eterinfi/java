package data.type.string;

public class ValueOfDemo {
	public static void main(String[] args) {
		double d = 1100.00;
		boolean b = true;
		long l = 1234567890;
		char[] arr = {'r', 'u', 'n', 'o', 'o', 'b'};
		System.out.println("返回值为 " + String.valueOf(d));
		System.out.println("返回值为 " + String.valueOf(b));
		System.out.println("返回值为 " + String.valueOf(l));
		System.out.println("返回值为 " + String.valueOf(arr));
	}
}