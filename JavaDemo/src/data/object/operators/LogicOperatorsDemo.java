package data.object.operators;

public class LogicOperatorsDemo {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!(a && b) = " + !(a && b));
		int c = 5; // 定义一个变量
		boolean d = (c < 4) && (c++ < 10);
		System.out.println("使用短路逻辑运算符的结果为 " + d);
		System.out.println("c = " + c);
	}
}