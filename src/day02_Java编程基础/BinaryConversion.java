package day02_Java编程基础;

public class BinaryConversion {
	public static void main(String[] args) {
		// -8
		// 0000 1000 |-8|的原码
		// 1111 0111  按位取反
		// 1111 1000  再加一
		
		// -3
		// 0000 0011
		// 1111 1100
		// 1111 1101
		
		// 1100.01
		// 8+4+0+0 0+0.25
		// 12.25
		
		// 25 = (11001)2
		// 12 .. 1
		// 6  .. 0
		// 3  .. 0
		// 1  .. 1
		// 0  .. 1
		
		// 0.25 = (0.01)2
		// 0.5
		// 1.0
		
		int x = 0x25;
		System.out.println(x);
	}
}
