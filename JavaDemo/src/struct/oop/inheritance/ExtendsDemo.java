package struct.oop.inheritance;

class Penguin extends Animal {
	public Penguin(String myName, int myid) {
		super(myName, myid);
	}
}

public class ExtendsDemo {
	public static void main(String[] args) {
		Penguin penguin = new Penguin("Tencent", 1710099);
		penguin.introduction();
		penguin.eat();
		penguin.sleep();
		Mouse mouse = new Mouse("Mickey", 123456);
		mouse.introduction();
		mouse.eat();
		mouse.sleep();
	}
}