package base.day04_面向对象;

// final关键字
//  1.使用final声明一个属性，就是常量，常量的命名规则建议使用去全大写，常量必须在定义时或在构造器中完成初始化
//  2.使用final声明的方法，不能被子类重写，只能被继承
//  3.使用final修饰的类不能被继承
public class FinalKeyWord {
	public static void main(String[] args) {
		System.out.println(Constent.PERSON_NUM);
		
		FinalClass finalClass = new FinalClass();
		finalClass.setLength(10);
	}
}

// 常量类（工具类）：在实际项目开发中，常量类常用于定义项目中的一些公开的、不变的数据
class Constent {
	public static final int PERSON_NUM = 10;// 人数
}

final class FinalClass {
	public final int DAY_NUMBER;// 工作天数
	
	public FinalClass() {
		DAY_NUMBER = 20;
	}
	
	public final void print() {
		System.out.println("我是final方法");
	}
	
	public void setLength(final int size) {
		// size++;// 只能使用size，不能对size做任何的改变
		System.out.println("size = " + size);
	}
}

//class SubClass extends FinalClass {
//	@Override
//	public final void print() {
//		System.out.println("我是继承的final方法");
//	}
//}