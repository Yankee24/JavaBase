package base.day06_常用类库.string;

public class StringManipulationStringBuffer {
	public static void main(String[] args) {
		// 产生5个对象
		String a = "a";
		String b = "b";
		String c = a + b + 1;
		System.out.println(c);
		
		// 产生1个对象
		String d = "a" + 1 + 2 + 3 + "b";// 常量相加没有性能问题（编译期进行了优化）
		System.out.println(d);
		
		// StringBuffer 的目的是为了来解决字符串相加时带来的性能问题
		// StringBuffer 的内部实现采用了字符数组，默认数组长度为16，超过数组大小时进行动态扩充： 原来长度*2 + 2
		// 当我们预知需要添加的长度时，建议使用带初始化容量的构造方法，来避免动态扩充的次数，从而提高效率
		// 线程安全的，synchronized，回影响性能
		StringBuffer stringBuffer = new StringBuffer(32);// 带容量的构造
		stringBuffer.append(a).append(b).append(c).append(d).append(d).append(d);
		System.out.println(stringBuffer.toString());
		
		StringBuffer stringBuffer2 = new StringBuffer("abc");// 在字符串基础上+16进行扩充
		System.out.println(stringBuffer2);
		System.out.println(stringBuffer2.delete(0, 1));
		System.out.println(stringBuffer2.indexOf("b"));
		System.out.println(stringBuffer2.insert(0, "abc"));
		System.out.println(stringBuffer2.replace(0, 3, "ss"));
		System.out.println(stringBuffer2.substring(2));
		System.out.println(stringBuffer2.reverse());
	}
}
