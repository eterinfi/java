package data.type.string;

public class RegionMatchesDemo {
	public static void main(String[] args) {
		String str1 = new String("www.runoob.com");
		String str2 = new String("runoob");
		String str3 = new String("RUNOOB");
		System.out.print("返回值为 ");
		System.out.println(str1.regionMatches(4, str2, 0, 5));
		System.out.print("返回值为 ");
		System.out.println(str1.regionMatches(4, str3, 0, 5));
		System.out.print("返回值为 ");
		System.out.println(str1.regionMatches(true, 4, str3, 0, 5));
	}
}