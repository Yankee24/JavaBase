package day06_常用类库.math;

import static java.lang.Math.floor;// 静态导入

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		// Math.random() 产生大于等于0.0且小于1.0的数
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(10.23));
		System.out.println(Math.sqrt(2));
		System.out.println(floor(3.242));
	}
}
