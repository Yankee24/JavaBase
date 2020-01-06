package base.day05_Eclipse与异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsAndThrow {
	public static void main(String[] args) {
		input();
		try {
			div(20, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int div(int num1, int num2) throws ArithmeticException {
		try {
			int c = num1 / num2;
			return c;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("除数不能为0");
		} finally {
			System.out.println("运行结束");
		}
	}
	
	private static void input() {
		// ctrl + shift + o 自动导包
		Scanner scanner = new Scanner(System.in);
		try {
			int num = scanner.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			System.out.println("输入不匹配");
		}
		scanner.close();
	}
}
