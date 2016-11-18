package struct.oop.polymorphism;

class Animal2{
	public void move(){
		System.out.println("动物可以移动");
	}
}

class Dog2 extends Animal2{
	public void move(){
		super.move(); // 应用 super 类的方法
		System.out.println("狗可以跑和走");
	}
	public void bark(){
		System.out.println("狗可以吠叫");
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		Animal2 a = new Animal2(); // Animal 对象
		Animal2 b = new Dog2(); // Dog2 对象
		a.move(); // 执行 Animal2 类的方法
		b.move(); // 执行 Dog2 类的方法
		//b.bark();
	}
}