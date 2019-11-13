package day04_面向对象;

public class RecursiveAlgorithm {
	public static void main(String[] args) {
		int result1 = factorial1(10);
		System.out.println("10! = " + result1);
		
		int result2 = factorial2(10);
		System.out.println("10! = " + result2);
	}
	
	public static int factorial1(int num) {
		int result = num;
		int i = num - 1;
		do {
			result = result * i;
			i--;
		} while (i > 1);
		return result;
	}
	
	// 递归算法：方法本身调用自己
	// 1.递归必须要有出口
	// 2.递归内存消耗大，容易发生内存溢出
	// 3.层次调用越多，越危险
	public static int factorial2(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial2(num - 1);
	}
}
