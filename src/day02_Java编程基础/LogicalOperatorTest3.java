package day02_Java编程基础;

import java.util.Scanner;

public class LogicalOperatorTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入天数：");
		int day = scanner.nextInt();
		System.out.println("周数是：" + (day / 7));
		System.out.println("剩余的天数是：" + (day % 7));
		scanner.close();
	}
}
