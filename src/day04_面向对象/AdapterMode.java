package day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * 适配器模式：将一个类的接口转换客户希望的另一个接口。
 * 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 */
public class AdapterMode {
	public static void main(String[] args) {
		PowerA powerA = new PowerAImpl();
		work(powerA);
		
		PowerB powerB = new PowerBImpl();
		// work(powerB);
		Adapter adapter = new Adapter(powerB);
		work(adapter);
	}
	
	public static void work(PowerA a) {
		System.out.println("正在连接...");
		a.insert();
		System.out.println("工作结束");
	}
}

interface Animall {
	public void sing();
	public void cry();
	public void run();
	public void swim();
}

abstract class AnimallFunciton {
	public void sing() {
	}
	
	public void cry() {
	}
	
	public void run() {
	}
	
	public void swim() {
	}
}

class Dogg extends AnimallFunciton {
	@Override
	public void run() {
		System.out.println("我是疯狗，疯狂的跑");
	}
}

// 适配器
class Adapter implements PowerA {
	private PowerB PowerB;
	
	public Adapter(PowerB powerB) {
		this.PowerB = powerB;
	}
	
	@Override
	public void insert() {
		PowerB.connect();
	}
}

interface PowerA {
	public void insert();
}

interface PowerB {
	public void connect();
}

class PowerAImpl implements PowerA {
	@Override
	public void insert() {
		System.out.println("电源A开始工作");
	}
}

class PowerBImpl implements PowerB {
	@Override
	public void connect() {
		System.out.println("电源B开始工作");
	}
}