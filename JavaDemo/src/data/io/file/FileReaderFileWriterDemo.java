package data.io.file;

import java.io.*;

public class FileReaderFileWriterDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("Hello1.txt");
		// 创建文件
		file.createNewFile();
		// 创建 FileWriter 对象
		FileWriter writer = new FileWriter(file);
		// 向文件写入内容
		writer.write("This\n is\n an\n example\n");
		writer.flush();
		writer.close();
		// 创建 FileReader 对象
		FileReader fr = new FileReader(file);
		char [] a = new char[50];
		fr.read(a);
		// 读取数组中的内容
		for (char c : a)
			System.out.print(c); // 逐个打印字符
		fr.close();
	}
}