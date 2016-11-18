package data.type.array;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] reversed = reverseArray(new int[]{3, 1, 2, 6, 4, 2});
		ArrayDemo4.printArray(reversed);
	}
	
	public static int[] reverseArray(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
			result[j] = list[i];
		return result;
	}
}