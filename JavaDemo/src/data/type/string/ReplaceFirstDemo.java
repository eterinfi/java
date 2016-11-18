package data.type.string;

public class ReplaceFirstDemo {
	public static void main(String[] args) {
		String str = new String("hello runoob, I am from runoob.");
		System.out.print("返回值为 ");
		System.out.println(str.replaceFirst("runoob", "google"));
		System.out.print("返回值为 ");
		System.out.println(str.replaceFirst("(.*)runoob(.*)", "google"));
	}
}