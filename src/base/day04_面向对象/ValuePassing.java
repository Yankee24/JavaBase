package base.day04_面向对象;

// 值传递
public class ValuePassing {
	public static void main(String[] args) {
		int x = 10;
		method(x);
		System.out.println("x = " + x);
	}

	public static void method(int m) {
		m = 20;
	}
}
