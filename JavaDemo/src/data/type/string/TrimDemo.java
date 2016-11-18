package data.type.string;

public class TrimDemo {
	public static void main(String[] args) {
		String str = new String("    www.runoob.com    ");
		System.out.print("原始值：");
		System.out.println(str);
		System.out.print("删除头尾空白：");
		System.out.println(str.trim());
	}
}