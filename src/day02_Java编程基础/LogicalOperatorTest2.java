package day02_Java编程基础;

public class LogicalOperatorTest2 {
	public static void main(String[] args) {
		int num = 12331;
		int w = num / 10000;
		int q = num / 1000 % 10;
		int b = num / 100 % 10;
		int s = num / 10 % 10;
		int g = num % 10;
		System.out.println("输出的结果是：" + (w + q + b + s + g));
	}
}
