package day06_常用类库.date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		// 使用两个构造方法：
		// Date(long date);// 参数是毫秒
		// Date();
	}
}
