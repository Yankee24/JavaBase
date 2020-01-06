package base.day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * 抽象类：用abstract关键字声明的类称为抽象类
 * 很多具有相同特征和行为的关键字可以抽象为一个类
 * 很多具有相同特征和行为的类可以抽象为一个抽象类
 * 
 * 抽象类可以没有抽象方法，有抽象方法的类必须是抽象类
 * 非抽象类继承抽象类必须实现所有的抽象方法
 * 抽象类可以继承抽象类，可以不实现父类抽象方法
 * 抽象类可以有方法实现和属性
 * 抽象类不能被实例化
 * 抽象类不能声明final
 * 抽象类可以有构造方法
 * 
 */
public class AbstractClass {
	public static void main(String[] args) {
		Man man = new Man();
		man.eat();
		man.move();
		
		Women women = new Women();
		women.eat();
		women.move();
	}
}

// 动物类
abstract class Animal {
	public abstract void move();// 方法的声明，抽象爱那个方法只有声明，没有实现
}

abstract class Peoople extends Animal {
	// 抽象方法
	public abstract void eat();
	public void sleep() {
		System.out.println("我要睡觉");
	}
}

// 具体类
// 继承抽象类的具体类必须实现所有抽象方法
class Man extends Peoople {
	@Override
	public void eat() {
		System.out.println("我是男人，我爱吃肉");
	}

	@Override
	public void move() {
		System.out.println("我爱跑步");
	}
}

// 具体类
class Women extends Peoople {
	@Override
	public void eat() {
		System.out.println("我是女人，我爱吃香蕉");
	}

	@Override
	public void move() {
		System.out.println("我喜欢逛街");
	}
}