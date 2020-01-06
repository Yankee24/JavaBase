package base.day06_常用类库.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();

		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH);
		int day = c1.get(Calendar.DAY_OF_MONTH);
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		int millisecond = c1.get(Calendar.MILLISECOND);

		StringBuilder stringBuilder = new StringBuilder(50);
		stringBuilder.append(year).append("年").append(month).append("月").append(day).append("日").append(hour)
				.append(":").append(minute).append(":").append(second).append(" ").append(millisecond);
		System.out.println(stringBuilder);
		
		System.out.println(c2.get(Calendar.YEAR));
	}
}
