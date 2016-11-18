package data.type.string;

public class CopyValueOfDemo {
	public static void main(String[] args) {
		char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'};
		String Str2 = "";
		Str2 = String.copyValueOf(Str1);
		System.out.println("返回结果：" + Str2);
		Str2 = String.copyValueOf(Str1, 2, 6);
		System.out.println("返回结果：" + Str2);
	}
}