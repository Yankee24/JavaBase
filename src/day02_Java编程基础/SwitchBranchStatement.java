package day02_Java编程基础;

import java.util.Scanner;

public class SwitchBranchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("今天是星期几？");
		int day = sc.nextInt();
		// switch括号内的表达式的返回值必须是int/char/short/byte，1.7后支持String
		// 每一个case子句必须是唯一的常量值，需要添加break语句，否则将继续往下执行 
		// default语句可以省略
		switch (day) {
		case 1:
			System.out.println("星期一");
			System.out.println("周一比较堵，请慎重选择出行方法。（1.公交    2.地铁）");
			int method = sc.nextInt();
			if (method == 1) {
				System.out.println("公交出行");
			} else {
				System.out.println("地铁出行");
			}
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("地球不适合你，请回火星吧。");
			break;
		}
		sc.close();
	}
}
