package day02_Java编程基础;

import java.util.Scanner;

public class LogicalOperatorTest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入圆柱体的高：");
		int h = scanner.nextInt();
		System.out.println("请输入圆柱体的底面半径：");
		int r = scanner.nextInt();
		double result = 3.14 * r * r * h;
		System.out.println("圆柱体的体积是：" + result);
		scanner.close();
	}
}
