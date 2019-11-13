package day02_Java编程基础;

import java.util.Scanner;

public class IfElseBranchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字母：");
		int c = sc.nextInt();
		if (c >= 65 && c <= 90) {
			System.out.println("您输入的是大写字母：" + (char)c);
		} else {
			System.out.println("您输入的是小写字母：" + (char)c);
		}
		
		// 写一个程序，判断某一年是否为闰年
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("闰年");
		} else {
			System.out.println("平年");
		}
		sc.close();
	}
}
