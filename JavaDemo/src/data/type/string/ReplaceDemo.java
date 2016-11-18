package data.type.string;

public class ReplaceDemo {
	public static void main(String[] args) {
		String str = new String("hello");
		System.out.print("返回值为 ");
		System.out.println(str.replace('o', 'T'));
		System.out.print("返回值为 ");
		System.out.println(str.replace('l', 'D'));
	}
}