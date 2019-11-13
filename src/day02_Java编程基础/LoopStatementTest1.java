package day02_Java编程基础;

public class LoopStatementTest1 {
	public static void main(String[] args) {
		// 外循环控制行数
		for (int i = 1; i <= 5; i++) {
			// 内循环控制列数
			for (int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
