package base.day02_Java编程基础;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		// 关系运算符
		int x = 1;
		int y = 2;
		System.out.println(x == y);
		
		// 创建一个键盘输入的工具
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int x1 = scanner.nextInt();// 从键盘接收一个整数
		System.out.println(x1);
		
		System.out.println("请输入一个字符串：");
		String s = scanner.next();
		System.out.println(s);
		
		scanner.close();
	}
}
