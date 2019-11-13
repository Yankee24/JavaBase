package day04_面向对象;

public class Interface {
	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setName("玛丽");
		girl.sleep();
		girl.eat();
		girl.run();
	}
}

// 接口
interface IEat {
	// public abstract void eat();
	void eat();

	// public static final int NUM = 10;
	int NUM = 10;
}

interface IRun {
	void run();
}

// 接口之间可以多继承（注意：类只能是单继承）
interface ISleep extends IEat, IRun {
	void sleep();
}

// 实现接口的类：必须实现接口的所有抽象方法
class Girl implements IEat, ISleep {

	private String name;
	
	public Girl() {
	}
	
	public Girl(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void sleep() {
		System.out.println("我要睡觉");
	}

	@Override
	public void eat() {
		System.out.println("我想吃");
	}

	@Override
	public void run() {
		System.out.println("我能跑");
	}

}