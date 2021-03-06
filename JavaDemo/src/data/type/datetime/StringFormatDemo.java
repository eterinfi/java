package data.type.datetime;

import java.util.*;

public class StringFormatDemo {
	public static void main(String[] args) {
		// 初始化 Date 对象
		Date date = new Date();
		
		// 使用 String.format 格式化日期和时间
		String str = String.format("Current Date/Time: %tc%n", date);
		// 使用 System.out.printf 显示日期和时间
		System.out.printf(str);
		
		// 使用 System.out.printf 格式化并显示日期和时间
		System.out.printf("%1$s %2$tB %2$td, %2$tY%n", "Due date: ", date);
		// 等价写法
		System.out.printf("%s %tB %<te, %<tY%n", "Due date: ", date);
	}
}