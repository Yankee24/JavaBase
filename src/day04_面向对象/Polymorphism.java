package day04_面向对象;

public class Polymorphism {
	public static void main(String[] args) {
		// 用父类的引用指向子类对象（用大的类型来表示晓得类型），自动转换（向上转型）
		Chicken2 homeChicken = new HomeChicken("小鸡鸡");
		homeChicken.eat();

		YeChicken yeChicken = new YeChicken("大鸡鸡");
		yeChicken.eat();

		homeChicken = yeChicken;
		homeChicken.eat();

		eat(homeChicken);
		eat(yeChicken);

		Chicken2 jjc = new JianJiaoChicken("尖椒鸡");
		eat(jjc);
	}

	// 抽象（粒度）：面向抽象编程（面向接口编程）
	public static void eat(Chicken2 c) {
		System.out.println("鸡吃饭");
		c.eat();
		// 当我们需要把父类的实例强制转换为子类引用时，为了避免类型转换异常 java.lang.ClassCastException
		// 那么我们需要在转换之前做类型检查（判断）
		if (c instanceof JianJiaoChicken) {// 成立的条件是：对象本身及对象的父类型，都可以通过检查
			JianJiaoChicken jjc = (JianJiaoChicken) c;// 大的类型转换为小的类型，强制转换（向下转型）
			jjc.song();
		}
	}
}

// 鸡
abstract class Chicken2 {
	private String name;

	public Chicken2() {
	}

	public abstract void eat();

	public Chicken2(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

// 家鸡
class HomeChicken extends Chicken2 {
	public HomeChicken(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(this.getName() + "我爱吃米");
	}
}

// 野鸡
class YeChicken extends Chicken2 {
	public YeChicken(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(this.getName() + "我爱吃虫子");
	}
}

class JianJiaoChicken extends Chicken2 {

	public JianJiaoChicken(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + "我不吃东西");
	}

	public void song() {
		System.out.println("唧唧");
	}

}