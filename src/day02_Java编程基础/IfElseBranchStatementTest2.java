package day02_Java编程基础;

import java.util.Scanner;

/**
 * 
 * @author xiao儿
 * if语句的嵌套
 *
 */
public class IfElseBranchStatementTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数：");
		int num1 = sc.nextInt();
		System.out.println("输入第二个数：");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("第一个数大于第二个数");
		} else if (num1 < num2) {
			System.out.println("第一个数小于第二个数");
		} else {
			System.out.println("第一个数等于第二个数");
		}
		sc.close();
	}
}
