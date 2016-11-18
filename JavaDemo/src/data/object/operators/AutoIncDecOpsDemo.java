package data.object.operators;

public class AutoIncDecOpsDemo {
	public static void main(String[] args) {
		int a = 3; // 定义一个变量
		int b = ++a; // 自增运算
		int c = 3;
		int d = --c; // 自减运算
		System.out.println("进行自增运算后的值等于 " + b);
		System.out.println("进行自减运算后的值等于 " + d);
		
		int e = 5; // 定义一个变量
		int f = 5;
		int x = 2 * ++e;
		int y = 2 * f++;
		System.out.println("自增运算符前缀运算后 e= " + e + ", x= " + x);
		System.out.println("自增运算符前缀运算后 f= " + f + ", y= " + y);
	}
}