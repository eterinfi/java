package data.type.string;

public class GetCharsDemo {
	public static void main(String[] args) {
		String str1 = new String("www.runoob.com");
		char[] str2 = new char[6];
		try {
			str1.getChars(4, 10, str2, 0);
			System.out.print("拷贝的字符串为 ");
			System.out.println(str2);
		} catch (Exception ex) {
			System.out.println("触发异常...");
		}
	}
}