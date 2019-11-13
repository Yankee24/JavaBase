package day06_常用类库.string;

public class StringManipulationStringBuilder {
	public static void main(String[] args) {
		// 面试题：StringBuffer 和 StringBuilder 的区别？
		// StringBuffer 是线程安全的，性能低，适合在多线程中使用，在JDK1.0
		// StringBuilder 是线程不安全的，性能高，适合在单线程中使用，在JDK1.5之后
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.append("ss"));
		
		// 字符串相加操作
		// 1.多个字符串常量相加没有性能问题，在编译期优化
		// 2.变量与常量相加，会产生多个垃圾对象
		
		String a = "a" + 1;
		System.out.println(a);
		
		String b = a + "b";
		System.out.println(b);
		
		String c = null;
		for (int i = 0; i < 5; i++) {
			c += i;// 每次循环会产生一个 StringBuilder 对象实现拼接，性能低，最好是手动创建 StringBuilder 来拼接
		}
		System.out.println(c);
		// 1.字符串相加，在编译后，会使用 StringBuilder 来优化代码，实现拼接
	}
}
