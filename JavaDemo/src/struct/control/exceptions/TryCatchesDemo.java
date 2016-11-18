package struct.control.exceptions;

import java.io.*;
public class TryCatchesDemo {
	public static void main(String[] args) {
		System.out.println(readFile("test.txt"));
	}
	static int readFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
			byte x = (byte) file.read();
			file.close();
			return x;
		} catch (FileNotFoundException f) {
			f.printStackTrace();
			return -1;
		} catch (IOException i) {
			i.printStackTrace();
			return -1;
		}
	}
}