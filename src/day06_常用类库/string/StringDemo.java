package day06_常用类库.string;

/**
 * @author xiao儿
 * @date 2019年8月23日 下午7:56:31
 * @description String测试类
 * String 表示一个字符串，内部使用字符数组实现，不能被继承（最终类），不可变
 */
public class StringDemo {
	public static void main(String[] args) {
		// String的两种赋值方式：推荐使用第1种
		
		// 1.直接赋值
		String name = "小白";
		// 2.使用new关键字创建对象，new表示申请内存空间
		// 面试题：以下代码会创建几个对象？两个。一个在常量池中，一个在堆内存中
		String name2 = new String("小白");
		
		String name3 = "小白";
		
		System.out.println(name == name2);
		System.out.println(name == name3);// 均保存在常量池中
		System.out.println("--------------------");
		
		// 代码示例：4种情况分析：直接赋值字符串连接时，考虑编译期和运行期
		// 如果在编译期，值可以被确定，那么就使用已有的对象，否则会创建新的对象
		String a = "a";
		String a1 = a + 1;
		String a2 = "a1";
		System.out.println(a1 == a2);
		System.out.println("--------------------");
		
		final String b = "b";
		String b1 = b + 1;
		String b2 = "b1";
		System.out.println(b1 == b2);
		System.out.println("--------------------");
		
		String c = getC();
		String c1 = c + 1;
		String c2 = "c1";
		System.out.println(c1 == c2);
		System.out.println("--------------------");
		
		final String d = getD();
		String d1 = d + 1;
		String d2 = "d1";
		System.out.println(d1 == d2);
	}
	
	private static String getC() {
		return "c";
	}
	
	private static String getD() {
		return "d";
	}
}
