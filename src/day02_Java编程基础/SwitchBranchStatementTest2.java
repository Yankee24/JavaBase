package day02_Java编程基础;

import java.util.Scanner;

public class SwitchBranchStatementTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = scanner.nextInt();
		System.out.println("请输入操作符(+,-,*,/)：");
		String op = scanner.next();
		switch (op) {
		case "+": {// 作用域
			System.out.println(num1 + op + num2 + "=" + (num1 + num2));
			break;
		}
		case "-":
			System.out.println(num1 + op + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + op + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + op + num2 + "=" + (num1 / num2));
			break;
		default:
			System.out.println("你输入的操作符不存在");
			break;
		}
		scanner.close();
	}
}
