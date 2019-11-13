package day03_方法与数组;

import java.util.Scanner;

public class ParametricMethodDefinition {
	// 主方法
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要答应的星星的行数：");
		int line = sc.nextInt();
		// 在调用方法时传入的参数称为实参
		printStar(line);
		sc.close();
	}
	
	// 带有参数的方法
	// 形参：line，在方法定义时的参数
	public static void printStar(int line) {
		// 外循环控制行数
		for (int i = 1; i <= line; i++) {
			// 内循环控制列数
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
