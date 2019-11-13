package day02_Java编程基础;

public class LogicalOperatorTest4 {
	boolean a = true;
	boolean b = false;
	
	boolean c = (!a) & b;
	// 面试题：&和&&的区别
	// &：在算术运算时，分别计算表达式两边的结果，再做&运算；在位运算时，&表示按位与
	// &&：短路与运算，先计算左边的表达式，如果结果是false，那么不用计算右边表达式的值，直接返回false
	// 如果左边的表达式结果是true，再计算右边的表达式，如果右边的表达式为true，结果为true，否则为false
	
	// | 和 || 的原谅同上
	// 所以短路与和短路或的运算效率较高，建议使用
}
