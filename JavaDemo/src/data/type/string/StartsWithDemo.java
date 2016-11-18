package data.type.string;

public class StartsWithDemo {
	public static void main(String[] args) {
		String str = new String("www.runoob.com");
		System.out.print("返回值为 ");
		System.out.println(str.startsWith("www"));
		System.out.print("返回值为 ");
		System.out.println(str.startsWith("runoob"));
		System.out.print("返回值为 ");
		System.out.println(str.startsWith("runoob", 4));
	}
}