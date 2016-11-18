package data.type.string;

public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		String str1 = new String("runoob");
		String str2 = str1;
		String str3 = new String("RUNOOB");
		boolean retVal;
		retVal = str1.equals(str2);
		System.out.println("返回值：" + retVal);
		retVal = str1.equals(str3);
		System.out.println("返回值：" + retVal);
		retVal = str1.equalsIgnoreCase(str3);
		System.out.println("返回值：" + retVal);
	}
}