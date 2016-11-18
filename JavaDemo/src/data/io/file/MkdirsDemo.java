package data.io.file;

import java.io.File;
public class MkdirsDemo {
	public static void main(String[] args) {
		String dirname = "/tmp/user/java/bin";
		File d = new File(dirname);
		// 现在创建目录
		d.mkdirs();
	}
}