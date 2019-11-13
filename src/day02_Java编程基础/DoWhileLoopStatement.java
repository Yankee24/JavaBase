package day02_Java编程基础;

/**
 * 
 * @author xiao儿
 * do...while循环：先执行，再判断
 */
public class DoWhileLoopStatement {
	public static void main(String[] args) {
		int i = 10;// 增量
		do {
			// 循环体
			System.out.println(i);
			i--;
		} while (i >= 0);// 循环条件
	}
}
