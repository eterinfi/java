package data.type.string;

public class SubstringDemo {
	public static void main(String[] args) {
		String str = new String("www.runoob.com");
		System.out.print("返回值为 ");
		System.out.println(str.substring(4));
		System.out.print("返回值为 ");
		System.out.println(str.substring(4, 10));
	}
}