package day06_常用类库.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss SSS");
		String nowDate = dateFormat.format(new Date());
		System.out.println(nowDate);
	}
}
