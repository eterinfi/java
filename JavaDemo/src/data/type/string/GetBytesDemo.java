package data.type.string;

import java.io.*;

public class GetBytesDemo {
	public static void main(String[] args) {
		String str1 = new String("runoob");
		try {
			byte[] str2 = str1.getBytes();
			System.out.println("返回值：" + str2);
			str2 = str1.getBytes("UTF-8");
			System.out.println("返回值：" + str2);
			str2 = str1.getBytes("ISO-8859-1");
			System.out.println("返回值：" + str2);
		} catch (UnsupportedEncodingException e) {
			System.out.println("不支持的字符集");
		}
	}
}