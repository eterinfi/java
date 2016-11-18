package struct.oop.interfacing;

public class Boss {
	public void payEmployee(data.io.file.Employee e) {
		e.mailCheck();
	}
	public static void main(String args[]) {
		Boss boss = new Boss();
		data.io.file.Employee gw = new data.io.file.Employee();
		gw.name = "George W.";
		gw.address = "Houston, TX";
		boss.payEmployee(gw);
	}
}