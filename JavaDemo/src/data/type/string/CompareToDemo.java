package data.type.string;

public class CompareToDemo {
	public static void main(String[] args) {
		String str1 = "Strings";
		String str2 = "Strings";
		String str3 = "Strings123";
		int result = str1.compareTo(str2);
		System.out.println(result);
		result = str2.compareTo(str3);
		System.out.println(result);
		result = str3.compareTo(str1);
		System.out.println(result);
	}
}