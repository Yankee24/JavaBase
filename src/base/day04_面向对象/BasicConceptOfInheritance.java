package base.day04_面向对象;

// 继承：继承是从已有的类创建新类的过程
// 继承一个父类，只能集成非私有的东西（属性和方法）
// protected：访问权限修饰符，在继承关系中使用，在父类中使用protected修饰的属性或犯方法可以被子类继承
// 创建子类对象时，父类的构造方法也会被调用，为什么？
// 因为子类要使用到父类的数据，那么就要通过父类的构造方法来初始化数据
// 如果创建子类对象时使用默认的构造方法，那么父类的默认构造方法也会被调用
// 如果创建子类对象时调用父类的默认构造方法

// 当父类中没有无参数的构造方法时，子类必须显示的调用父类的带参数的构造方法，采用super
public class BasicConceptOfInheritance {
	public static void main(String[] args) {
		HomeDog homeDog = new HomeDog("旺财");
		homeDog.print();
		homeDog.eat();
	}
}

class Dog2 {
//	private String name;
//	private String sex;
	
	protected String name;
	protected String sex;

	public Dog2(String name, String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("我是Dog的有参的构造方法");
	}
	
//	public Dog2() {
//		System.out.println("我是Dog的构造方法");
//	}
	
	public void eat() {
		System.out.println(name + "吃饭");
	}
}

class HomeDog extends Dog2 {
	
	public HomeDog(String name) {
		super(name, "公");
		System.out.println("我是HomeDog的构造方法");
	}
	
	public void print() {
		System.out.println(name + "我是一个家狗");
	}
}

class HuskyDog extends Dog2 {
	
	public HuskyDog() {
		super("哈士奇", "母");
		System.out.println("我是HuskyDog的构造方法");
	}
	
	public void show() {
		System.out.println("我是husky，我能跳舞");
	}
}