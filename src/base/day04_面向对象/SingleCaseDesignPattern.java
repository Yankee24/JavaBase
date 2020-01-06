package base.day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 *         单例设计模式： 1.构造方法私有化 2.声明一个本类对象 3.给外部提供一个静态方法获取对象实例
 * 
 *         两种实现方式： 1.懒汉式 2.饿汉式
 * 
 *         在项目中为什么要使用单例，单例有什么好处？ 1.在设计一些工具类的时候（通常工具类，只有功能方法，没有属性） 2.工具类可能会被频繁调用
 * 
 *         目的是为了节省重复创建对象所带来的内存消耗，从而来提高效率
 *         
 *         能不能使用构造方法私有化+静态方法来替代单例？
 * 
 */
public class SingleCaseDesignPattern {
	public static void main(String[] args) {
		// SingleCase_1 singleCase_1 = new SingleCase_1();
		SingleCase_1 singleCase_1 = SingleCase_1.getInstance();
		singleCase_1.print();
		SingleCase_2 singleCase_2 = SingleCase_2.getInstance();
		singleCase_2.print();
	}
}

// 使用构造方法私有化+静态方法 来实现工具类，比如Math
class Tools {
	private Tools() {
	}
	
	public static void print1() {
	}
	
	public static void print2() {
	}
}

// 饿汉式：在类被加载后，对象被创建，到程序结束后释放（占用内存的时间长，提高效率）
class SingleCase_1 {
	private SingleCase_1() {
	}

	private static SingleCase_1 singleCase_1 = new SingleCase_1();

	public static SingleCase_1 getInstance() {
		return singleCase_1;
	}

	public void print() {
		System.out.println("饿汉式测试方法");
	}
}

// 懒汉式：在第一次调用getInstance方法时，对象被创建，到程序结束后释放（占用内存的时间短，效率稍低）
// 在多线程访问时会有安全问题
class SingleCase_2 {
	private SingleCase_2() {
	}

	private static SingleCase_2 singleCase_2;

	public static SingleCase_2 getInstance() {
		if (singleCase_2 == null) {
			singleCase_2 = new SingleCase_2();
		}
		return singleCase_2;
	}

	public void print() {
		System.out.println("懒汉式测试方法");
	}
}