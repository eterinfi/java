package data.type.string;

public class LastIndexOfDemo {
	public static void main(String[] args) {
		String str = new String("菜鸟教程：www.runoob.com");
		String subStr1 = new String("runoob");
		String subStr2 = new String("com");
		System.out.print("查找字符 o 最后一次出现的位置为 ");
		System.out.println(str.lastIndexOf('o'));
		System.out.print("从第 14 个位置查找字符 o 最后一次出现的位置为 ");
		System.out.println(str.lastIndexOf('o', 14));
		System.out.print("子字符串 subStr1 最后一次出现的位置为 ");
		System.out.println(str.lastIndexOf(subStr1));
		System.out.print("从第 15 个位置开始搜索子字符串 subStr1 最后一次出现的位置为 ");
		System.out.println(str.lastIndexOf(subStr1, 15));
		System.out.print("子字符串 subStr2 最后一次出现的位置为 ");
		System.out.println(str.lastIndexOf(subStr2));
	}
}