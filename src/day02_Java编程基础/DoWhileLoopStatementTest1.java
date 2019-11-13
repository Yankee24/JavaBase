package day02_Java编程基础;

public class DoWhileLoopStatementTest1 {
	public static void main(String[] args) {
		int i = 1;
		int num = 0;// 总和
		do {
			int j = 1;
			int sum = 1;
			while (j <= i) {
				sum *= j;
				j++;
			}
			num += sum;
			i++;
		} while (i <= 10);
		System.out.println("1~10的阶乘和：" + num);
	}
}
