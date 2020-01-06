package base.day02_Java编程基础;

public class WhileLoopStatementTest1 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 1;
		while (i <= 10) {
			sum *= i;
			i++;
		}
		System.out.println("10!为：" + sum);
	}
}
