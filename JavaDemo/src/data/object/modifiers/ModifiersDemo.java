package data.object.modifiers;

public class ModifiersDemo {
	private static int numInstances = 0;
	
	protected static int getCount() {
		return numInstances;
	}
	
	private static void addInstance() {
		numInstances++;
	}
	
	ModifiersDemo() {
		ModifiersDemo.addInstance();
	}
	
	public static void main(String[] args) {
		System.out.println("Starting with " + ModifiersDemo.getCount() + " instances");
		for (int i = 0; i < 500; ++i)
			new ModifiersDemo();
		System.out.println("Created " + ModifiersDemo.getCount() + " instances");
	}
}