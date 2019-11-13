package day04_面向对象;

public class OverrideMethod {
	public static void main(String[] args) throws Exception {
		HomeDog2 homeDog = new HomeDog2("旺财");
		homeDog.print();
		homeDog.eat();
	}
}

class Dog3 {
//	private String name;
//	private String sex;
	
	protected String name;
	protected String sex;

	public Dog3(String name, String sex) {
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

class HomeDog2 extends Dog3 {
	
	public HomeDog2(String name) {
		super(name, "公");
		System.out.println("我是HomeDog的构造方法");
	}
	
	public void print() {
		System.out.println(name + "我是一个家狗");
	}
	
	@Override
	public void eat() throws Exception {
		System.out.println("我是家狗，我喜欢吃骨头");
	}
}

class HuskyDog2 extends Dog3 {
	
	public HuskyDog2() {
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