package data.object.scopes;

public class LocalVarDemo {
	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("小狗的年龄：" + age);
	}
	
	public static void main(String[] args) {
		LocalVarDemo test = new LocalVarDemo();
		test.pupAge();
	}
}