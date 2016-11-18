package data.type.string;

public class SubSequenceDemo {
	public static void main(String[] args) {
		String str = new String("www.runoob.com");
		System.out.print("返回值为 ");
		System.out.println(str.subSequence(4, 10));
	}
}