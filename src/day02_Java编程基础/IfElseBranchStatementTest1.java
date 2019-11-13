package day02_Java编程基础;

import java.util.Scanner;

/**
 * 
 * @author xiao儿 
 * if 语句的嵌套
 */
public class IfElseBranchStatementTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个成绩：");
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else if (score < 60) {
			System.out.println("E");
		}
		sc.close();
	}
}