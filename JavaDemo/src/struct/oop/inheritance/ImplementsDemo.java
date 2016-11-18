package struct.oop.inheritance;

interface A {
	public void eat();
	public void sleep();
}

interface B {
	public void show();
}

class C implements A, B {
	public void eat() { // eat 方法的具体实现
		System.out.println("I'm Eating...");
	}
	public void sleep() { // sleep 方法的具体实现
		System.out.println("I'm Sleeping...");
	}
	public void show() { // show 方法的具体实现
		System.out.println("Hello, everyone!");
	}
}

public class ImplementsDemo {
	public static void main(String[] args) {
		C c = new C();
		c.show();
		c.eat();
		c.sleep();
	}
}