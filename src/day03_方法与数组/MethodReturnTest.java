package day03_方法与数组;

import java.util.Scanner;

public class MethodReturnTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要打印的三角形的行数：");
		int line = sc.nextInt();
		printTriangle(line);
		sc.close();
	}
	
	public static void printTriangle(int line) {
		// 外循环控制行数
		for (int i = 1; i <= line; i++) {
			// 内循环打印空格
			for (int j = i; j < line; j++) {
				System.out.print(" ");
			}
			// 内循环打印*
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
