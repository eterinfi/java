package data.type.basic;

public class ExplicitTypeCast {
	public static void main(String[] args) {
		int i1 = 123;
		byte b = (byte)i1; // 强制类型转换为 byte
		System.out.println("int 类型强制转换为 byte 后的值等于 " + b);
	}
}