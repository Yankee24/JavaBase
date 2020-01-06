package base.day02_Java编程基础;

import java.util.Scanner;

public class IfElseBranchStatementTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("今天天气如何（1.好    2.霾）");
		int weather = sc.nextInt();
		if (weather == 1) {
			System.out.println("今天天气太好了，我是逛街还是逛公园呢？（1.逛街    2.逛公园）");
			int flag = sc.nextInt();
			if (flag == 1) {
				System.out.println("陪女票逛街");
			} else if (flag == 2) {
				System.out.println("去公园遛女票");
			}
		} else if (weather == 2) {
			System.out.println("今天天气不好，在家里看电影还是玩游戏呢？（1.看电影    2.玩游戏）");
			int flag = sc.nextInt();
			if (flag == 1) {
				System.out.println("配女票看动作电影");
			} else if (flag == 2) {
				System.out.println("背着女票打游戏");
			}
		}
		sc.close();
	}
}
