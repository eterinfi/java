package data.type.string;

public class EndsWithDemo {
	public static void main(String[] args) {
		String str = new String("菜鸟教程：www.runoob.com");
		boolean retVal;
		retVal = str.endsWith("runoob");
		System.out.println("返回值：" + retVal);
		retVal = str.endsWith("com");
		System.out.println("返回值：" + retVal);
	}
}