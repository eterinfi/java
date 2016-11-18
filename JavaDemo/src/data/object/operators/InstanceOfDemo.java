package data.object.operators;

class Vehicle {}

public class InstanceOfDemo extends Vehicle {
	public static void main(String[] args) {
		Vehicle a = new InstanceOfDemo();
		boolean result = a instanceof InstanceOfDemo;
		System.out.println(result);
	}
}