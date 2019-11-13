package day02_Java编程基础;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		
		a = 10;
		b = 3;
		System.out.println(a / b);
		System.out.println(a % b);
		
		a = b++;// 先赋值后自增
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		// a = 3，b = 4
		a = ++b;// 先自增后赋值
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int x = 1;
		int y = 2;
		y = x + y - (++y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
