package base.day02_Java编程基础;

import java.util.Scanner;

public class TrinocularOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩：");
		int score = sc.nextInt();
		boolean bool = score >= 60 ? true : false;
		System.out.println(bool);
		sc.close();
	}
}
