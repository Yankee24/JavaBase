package base.day02_Java编程基础;

public class WhileLoopStatementTest2 {
	public static void main(String[] args) {
		int i = 1;// 增量
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println("偶数：" + i);
			} else {
				System.out.println("奇数：" + i);
			}
			if (i % 3 == 0) {
				System.out.println("3的倍数：" + i);
			}
			i++;
		}
	}
}
