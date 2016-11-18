package struct.oop.basic;

class MyClass1 {
	int x;
	// 以下是构造函数
	MyClass1() {
		x = 10;
	}
}

public class ConsDemo {
	public static void main(String[] args) {
		MyClass1 t1 = new MyClass1();
		MyClass1 t2 = new MyClass1();
		System.out.println(t1.x + " " + t2.x);
		MyClass2 t3 = new MyClass2(10);
		MyClass2 t4 = new MyClass2(20);
		System.out.println(t3.x + " " + t4.x);
	}
}

class MyClass2 {
	int x;
	// 以下是构造函数
	MyClass2(int i) {
		x = i;
	}
}