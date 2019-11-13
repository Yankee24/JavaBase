package day03_方法与数组;

public class ArrayTest2 {
	public static void main(String[] args) {
		char[] cs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		int len = cs.length;
		
		for (int i = 1; i <= len; i++) {
			for (int j = i; j < len; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 -1; j++) {
				System.out.print(cs[i-1]);
			}
			System.out.println();
		}
	}
}
