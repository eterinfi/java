package data.io.console;
//使用 BufferedReader 在控制台读取字符串
import java.io.*;
public class ReadLineDemo {
	public static void main(String[] args) throws IOException {
		String str;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("end"));
	}
}