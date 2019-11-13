package day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * 内部类
 * 1.成员内部类：直接在类中定义的类
 * 2.方法内部类：直接在一个类中的方法中定义一个类
 *  (1).方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化
 *  (2).方法内部类对象不能使用该内部类所在方法的非final局部变量
 * 3.静态内部类：在一个类内部定义一个静态修饰的内部类
 *  静态内部类是该内部类可以像其他静态成员一样，没有外部类对象时，也能够访问它。
 *  静态嵌套类仅能访问外部类的静态成员和方法
 * 4.匿名内部类：没有名字的内部类
 *  匿名内部类的三种情况：
 *   （1)继承式的匿名内部类
 *   (2)接口式的匿名内部类
 *    (3)参数式的匿名内部类
 */
public class InternalClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		// 在外部创建成员内部类的实例，因为成员内部类需要依赖外部类的对象
		// 通常情况下我们不建议这样来实例化内部类的对象
		// Outer.Inner inner = outer.new Inner();
		// inner.print();
		outer.innerPrint();
		outer.show();
		
		Outer.Inner3 inner3 = new Outer.Inner3();
		inner3.print();
		
		outer.print1();
		outer.print2();
		outer.print3(new Eat() {
			// 参数式匿名内部类
			@Override
			public void eat() {
				System.out.println("eat：参数式匿名内部类");
			}
		});
	}
}

class Outer {
	private String name = "Outer";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// ---------局部内部类-----------
	// 建议在外部类中定义一个方法，对外提供访问内部类的接口
	public void innerPrint() {
		Inner inner = new Inner();
		inner.print();
	}

	// 成员内部类
	private class Inner {
		public void print() {
			System.out.println("成员内部类" + name);
		}
	}

	// ---------方法内部类-----------
	// show方法的局部变量或方法的参数必须是常量（final）
	public void show() {
		final int x = 10;
		class Inner2 {
			public void print() {
				// x++;
				System.out.println("方法内部类" + x + name);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	
	// --------静态内部类------------
	static class Inner3 {
		public void print() {
			System.out.println("静态内部类");
		}
	}
	
	// --------匿名内部类-------------
	public void print1() {
		// (1)继承式匿名内部类
		Cat2 cat2 = new Cat2() {
			@Override
			public void eat() {
				System.out.println("eat：继承式匿名内部类");
			}
		};
		cat2.eat();
	}
	
	public void print2() {
		// (2)接口式匿名内部类
		Eat eat = new Eat() {
			@Override
			public void eat() {
				System.out.println("eat：接口式匿名内部类");
			}
		};
		eat.eat();
	}
	
	public void print3(Eat eat) {
		// 参数式匿名内部类
		eat.eat();
	}
}

abstract class Cat2 {
	public abstract void eat();
}

interface Eat {
	public void eat();
}