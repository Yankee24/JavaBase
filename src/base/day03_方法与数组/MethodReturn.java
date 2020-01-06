package base.day03_方法与数组;

import java.util.Scanner;

public class MethodReturn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		boolean result = isYear(year);
		// false出现的几率大，因此首先进行false判断，可以提升程序效率
		if (result == false) {
			System.out.println(year + "是平年");
		} else {
			System.out.println(year + "是闰年");
		}
		sc.close();
	}
	
	// 判断给定的年份是否是闰年
	public static boolean isYear (int year) { 
		if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
