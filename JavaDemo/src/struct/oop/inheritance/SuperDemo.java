package struct.oop.inheritance;

class SuperClass {
	@SuppressWarnings("unused")
	private int n;
	SuperClass(){
		System.out.println("SuperClass()");
	}
	SuperClass(int n){
		System.out.println("SuperClass(int n):" + n);
		this.n = n;
	}
}
class SubClass extends SuperClass{
	@SuppressWarnings("unused")
	private int n;
	SubClass(){
		super(300);
		System.out.println("Subclass()");
	}
	SubClass(int n){
		System.out.println("Subclass(int n):" + n);
		this.n = n;
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		System.out.println("Create sc1:");
		@SuppressWarnings("unused")
	    SubClass sc1 = new SubClass();
		System.out.println("Create sc2:");
		@SuppressWarnings("unused")
		SubClass sc2 = new SubClass(200);
	}
}