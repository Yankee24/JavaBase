package base.day02_Java编程基础;

// 逻辑运算符
public class LogicalOperator {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		// 与运算，分别计算表达式两边的结果再做&运算，只有两个都为true，结果才为true，否则为false
		System.out.println(a & b);
		// 或运算，分别计算表达式两边的结果再做|&运算，只有有一个都为true，结果就为true，两个为false，结果才是false
		System.out.println(a | b);
		// 异或运算，两边相同为false，不同为true
		System.out.println(a ^ b);
		// 非运算
		System.out.println(!b);
		// 短路与
		System.out.println(a && b);
		// 短路或
		System.out.println(a || b);
		// 面试题：&和&&的区别
	}
}
