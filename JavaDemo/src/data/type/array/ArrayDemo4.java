package data.type.array;

public class ArrayDemo4 {
	public static void main(String[] args) {		
		// 数组作为函数的参数
		printArray(new int[]{3, 1, 2, 6, 4, 2});
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}