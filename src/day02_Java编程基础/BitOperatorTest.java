package day02_Java编程基础;

import java.util.Scanner;

public class BitOperatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 面试题：交换两个数的顺序
		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();
		System.out.println("a = " + a + "，b = " + b);
		
		// 1.通过第三个变量来交换
		int c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + "，b = " + b);
		
		// 2.不通过第三个变量如何交换两个数
		// (1).通过表达式
		a = a + b - (b = a);
		System.out.println("a = " + a + "，b = " + b);
		
		// (2).通过+-计算
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + "，b = " + b);
		
		// (3).通过异或计算
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a = " + a + "，b = " + b);
		
		// (4).通过乘除计算
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a = " + a + "，b = " + b);
		
		scanner.close();
	}
}
