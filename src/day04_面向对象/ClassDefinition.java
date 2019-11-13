package day04_面向对象;

public class ClassDefinition {
	public static void main(String[] args) {
		Horse horse = null;// 声明一个类的变量（除了八种基本数据类型以外，都是引用数据类型，包括数组）
		horse = new Horse();// 创建一个Horse类型的对象，实例对象
		// 可以调用对象的属性和方法
		horse.name = "赤兔宝马";
		horse.age = 350;
		// 调用方法，那么方法就会被执行
		horse.run();
		horse.eat();
		
		// 匿名对象
		new Horse().eat();
		
		horse = null;// 把对象释放
		// horse.eat();// 当对象不存在时，调用该对象的属性和方法将报错（空指针）java.lang.NullPointerException
		
		System.out.println("----------------------");
		Horse h1 = null;
		Horse h2 = null;
		h1 = new Horse();
		// h2 = new Horse();
		h1.name = "小白";
		h1.age = 4;
		// h2.name = "小黑";
		// h2.age = 5;
		// 对象之间的赋值：相同类型的才可以赋值
		h2 = h1;
		h2.name = "小黑";
		System.out.println(h1.name);
		
		System.out.println("------------------");
		Horse h3 = null;
		Horse h4 = null;
		h3 = new Horse();
		h4 = new Horse();
		h3.name = "小黑";
		h3.age = 4;
		h4.name = "小白";
		h4 = h3;// 此时h4的堆内存区域成为了垃圾
		h4.name = "嘿嘿";
		System.out.println(h3.name);
	}
}

//自定义一个类（类型）
class Horse {
	// 在类中定义属性（特征）
	String name;
	int age;

	// 在类中定义方法
	public void run() {
		System.out.println("我是" + name + "，今年" + age + "岁了。");
		System.out.println("又要马儿跑，又要马儿不吃草！");
	}
	
	public void eat() {
		System.out.println("我吃仙草！");
	}
}