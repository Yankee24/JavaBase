package day04_面向对象;

public class PackagingClass {
	public static void main(String[] args) {
		// 自动装箱操作，把基本数据类型转换为包装类
		Integer integer = new Integer(10);
		// 自动拆箱操作，把包装类转换为基本数据类型
		int i = integer.intValue();
		System.out.println(i);
		
		// 便于使用
		Integer integer2 = 10;// 建议使用的方式
		System.out.println(integer2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		Integer integer3 = new Integer("123");
		System.out.println(integer3);
		
		// 把数值字符串转换为int类型
		String string = "12";
		int j = Integer.parseInt(string);
		System.out.println(j);
		
		// 自动拆箱
		int k = Integer.valueOf(string);
		System.out.println(k);
		
		// 面试题
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		System.out.println(x1 == x2);
		System.out.println(x1.equals(x2));
		
		Integer x3 = new Integer(128);
		Integer x4 = new Integer(128);
		System.out.println(x3 == x4);
		System.out.println(x3.equals(x4));
		
		Integer x5 = 10;
		Integer x6 = 10;
		System.out.println(x5 == x6);
		System.out.println(x5.equals(x6));
		
		Integer x7 = 128;
		Integer x8 = 128;
		System.out.println(x7 == x8);
		System.out.println(x7.equals(x8));
	}
}
