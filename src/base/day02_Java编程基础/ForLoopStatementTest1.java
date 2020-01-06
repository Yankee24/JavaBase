package base.day02_Java编程基础;

public class ForLoopStatementTest1 {
	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			if (i % 7 == 0 && i % 4 != 0) {
				System.out.println(i);
			}
		}
	}
}
