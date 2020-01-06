package base.day05_Eclipse与异常处理;

import java.util.Scanner;

/**
 * @author xiao儿
 * @date 2019年8月22日 上午10:20:58
 * @description 异常处理
 * 
 * 1.Throwable是异常的基类，分为Error和Exception，在编程中我们要关注Exception
 * 2.Exception分为编译期异常（受检）和运行期异常（非受检）
 * 3.异常会导致程序中断，无法继续执行
 * 4.在开发中，我们需要把可能出现异常的代码使用try语句块包裹起来
 * 5.处理异常可以让程序保持运行状态
 * 6.catch可以有多个，顺序为从子类到父类，大的放后面，小的放前面
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		div(x, y);
		scanner.close();
		
		method();
	}
	
	/**
	 * @param num1 被除数
	 * @param num2 除数
	 * @description 除法运算
	 */
	private static void div(int num1, int num2) {
		int[] arr = {1, 2, 3, 4, 5};
		try {
			System.out.println(arr[5]);
			// arr = null;
			System.out.println(arr.length);
			int result = num1 / num2;
			System.out.println("result = " + result);
		} catch (ArithmeticException e) {// 数学算数异常
			System.out.println("除数不可以为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} finally {
			System.out.println("程序执行完毕");
		}
		System.out.println("程序结束");
	}
	
	private static int method() {
		int a = 10;
		int b = 5;
		try {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			int c = a / b;
			System.out.println("a / b = " + c);
			return c;
		} catch (Exception e) {
			// 代码测试时使用
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		return -1;
	}
}
