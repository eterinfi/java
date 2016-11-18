package data.type.string;

public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = new String("www.google.com");
		System.out.print("匹配成功返回值为 ");
		System.out.println(str.replaceAll("(.*)google(.*)", "runoob"));
		System.out.print("匹配失败返回值为 ");
		System.out.println(str.replaceAll("(.*)taobao(.*)", "runoob"));
	}
}