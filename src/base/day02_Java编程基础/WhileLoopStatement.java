package base.day02_Java编程基础;

/**
 * 
 * @author xiao儿
 * while循环：先判断，再执行
 */
public class WhileLoopStatement {
	public static void main(String[] args) {
		int num = 0;
		int i = 1;
		while (i <= 100) {
			num += i;
			i++;
		}
		System.out.println("1~100的和为：" + num);
	}
}
