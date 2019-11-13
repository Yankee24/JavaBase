package day06_常用类库.lambda;

public class LambdaDemo {
	public static void main(String[] args) {
		IEat iEat = new IEatImpl();
		iEat.eat();

		IEat iEat2 = new IEat() {
			@Override
			public void eat() {
				System.out.println("eat banana");
			}
		};
		iEat2.eat();

		// Lambda 表达式
		// 好处：1.代码更简洁；2.不会单独生成class文件
//		IEat iEat3 = () -> {
//			System.out.println("eat apple banana");
//		};
		// 没有参数时使用
		IEat iEat3 = () -> System.out.println("eat apple banana");
		iEat3.eat();
		
		// 带参数时使用
		IDrink iDrink = (thing, name) -> {
			System.out.println("drink--" + thing + "--");
			System.out.println(name);
		};
		iDrink.drink("water", "大冰");
		
		// 但返回值的方法
		IPlay iPlay = (thing, name) -> {
			System.out.println(name + " play " + thing);
			return 10;
		};
		iPlay.play("足球", "大冰");
		
		// 带返回值的方法只有一句代码实现
//		IPlay iPlay2 = (thing, name) -> {
//			return 10;
//		};
		// IPlay iPlay2 = (thing, name) -> 10;
		IPlay iPlay2 = (thing, name) -> thing == null ? 1 : 0;
		iPlay2.play("篮球", "大冰");
		
		// 带final关键字
		IPlay iPlay3 = (final String thing, final String name) -> 10;
		iPlay3.play("乒乓球", "大冰");
	}
}

// 只有一个抽象方法的接口
interface IEat {
	void eat();
	
	public default void print() {
		System.out.println("默认的方法");
	}
	
	public static void method() {
		System.out.println("静态的方法");
	}
}

class IEatImpl implements IEat {
	@Override
	public void eat() {
		System.out.println("eat apple");
	}
}

interface IDrink {
	void drink(String thing, String name);
}

interface IPlay {
	int play(String thing, String name);
}