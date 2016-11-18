package data.type.string;

public class SplitDemo {
	public static void main(String[] args) {
		String str = new String("Welcome-to-Runoob.com");
		System.out.println("返回值：");
		for (String retVal: str.split("-", 2))
			System.out.println(retVal);
		System.out.println("");
		System.out.println("返回值：");
		for (String retVal: str.split("-", 3))
			System.out.println(retVal);
		System.out.println("");
		System.out.println("返回值：");
		for (String retVal: str.split("-", 0))
			System.out.println(retVal);
		System.out.println("");
		System.out.println("返回值：");
		for (String retVal: str.split("-"))
			System.out.println(retVal);
	}
}