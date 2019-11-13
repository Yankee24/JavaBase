package day04_面向对象;

public class SuperKeyword {
	public static void main(String[] args) throws Exception {
		HomeDog3 homeDog = new HomeDog3("旺财");
		homeDog.print();
		homeDog.eat();
	}
}

class Dog4 {
//	private String name;
//	private String sex;
	
	protected String name;
	protected String sex;

	public Dog4(String name, String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("我是Dog的有参的构造方法");
	}
	
//	public Dog2() {
//		System.out.println("我是Dog的构造方法");
//	}
	
	public void eat() throws Exception {
		System.out.println(name + "吃饭");
	}
}

class HomeDog3 extends Dog4 {
	
	public HomeDog3(String name) {
		super(name, "公");
		System.out.println("我是HomeDog的构造方法");
	}
	
	public void print() {
		// super.属性：表示调用父类的属性，如果继承过来的属性，那么super可以省略
		System.out.println(super.name + "我是一个家狗");
	}
	
	@Override
	public void eat() throws Exception {
		// super.方法名：表示调用父类的方法
		super.eat();
		System.out.println("我是家狗，我喜欢吃骨头");
	}
}

class HuskyDog3 extends Dog4 {
	
	public HuskyDog3() {
		super("哈士奇", "母");
		System.out.println("我是HuskyDog的构造方法");
	}
	
	public void show() {
		System.out.println("我是husky，我能跳舞");
	}
	
	public void eat() throws Exception {
		System.out.println("我是husky，我喜欢吃鸡肝");
	}
}