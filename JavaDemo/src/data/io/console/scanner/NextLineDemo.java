package data.io.console.scanner;

import java.util.Scanner;
public class NextLineDemo {
	public static void main(String[] args) {
		// 从键盘接收数据
		Scanner scan = new Scanner(System.in);
		// 以 nextLine 方式接收字符串
		System.out.println("以 nextLine 方式接收：");
		// 判断是否还有输入
		if (scan.hasNext()) {
			String str = scan.nextLine();
			System.out.println("输入的数据为 " + str);
		}
		scan.close();
	}
}