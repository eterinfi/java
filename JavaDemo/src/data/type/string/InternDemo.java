package data.type.string;

public class InternDemo {
	public static void main(String[] args) {
		String str1 = new String("www.runoob.com");
		String str2 = new String("WWW.RUNOOB.COM");
		System.out.print("规范表示：");
		System.out.println(str1.intern());
		System.out.print("规范表示：");
		System.out.println(str2.intern());
	}
}