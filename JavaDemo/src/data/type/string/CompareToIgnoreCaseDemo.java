package data.type.string;

public class CompareToIgnoreCaseDemo {
	public static void main(String[] args) {
		String str1 = "STRINGS";
		String str2 = "Strings";
		String str3 = "Strings123";
		int result = str1.compareToIgnoreCase(str2);
		System.out.println(result);
		result = str2.compareToIgnoreCase(str3);
		System.out.println(result);
		result = str3.compareToIgnoreCase(str1);
		System.out.println(result);
	}
}