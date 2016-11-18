package data.io.console.scanner;

import java.util.Scanner;
public class NextDoubleDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while (scan.hasNextDouble()) {
			double x = scan.nextDouble();
			m++;
			sum += x;
		}
		System.out.println(m + "个数的和为 " + sum);
		System.out.println(m + "个数的平均值为 " + (sum / m));
		scan.close();
	}
}