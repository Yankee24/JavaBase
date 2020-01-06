package base.day02_Java编程基础;

public class BitOperator {
	public static void main(String[] args) {
		System.out.println(~10);
		// 0000 1010
		// 1111 0101

		// 面试题：以最快的速度计算8*4的结果
		// int result = 8 * 4;
		// 0000 1000 8
		// 0010 0000 32
		System.out.println(8 << 2);// 最快计算速度
		
		// 40 / 4
		System.out.println(40 >> 2);
	}
}
