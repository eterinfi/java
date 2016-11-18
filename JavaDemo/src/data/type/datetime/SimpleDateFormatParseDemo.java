package data.type.datetime;

import java.util.*;
import java.text.*;

public class SimpleDateFormatParseDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		String input = args.length == 0 ? "1818-11-11" : args[0];
		System.out.print(input + " parses as ");
		Date t;
		try {
			t = sdf.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparsable using " + sdf);
		}
	}
}