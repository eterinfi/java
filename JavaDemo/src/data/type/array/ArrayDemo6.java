package data.type.array;

public class ArrayDemo6 {
	public static void main(String[] args) {
		// 多维数组
		int a[][] = new int[2][3];
		a[0] = new int[]{3, 1, 2};
		a[1] = new int[]{6, 4, 2};
		for (int[] x: a)
			ArrayDemo4.printArray(x);
		System.out.println();
		
		String s[][] = new String[2][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[0][0] = new String("Good");
		s[0][1] = new String("Luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		for (String[] y: s)
			printArray(y);
	}
	
	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}