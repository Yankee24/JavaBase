package day03_方法与数组;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 生成伪随机数
		// int[] nums = {30, 17, 6, 2, 22, 27};
		int[] nums = new int[5];
		int len = nums.length;
		Random r = new Random();// 创建一个可以生成随机数的工具
		for (int i = 0; i < len; i++) {
			nums[i] = r.nextInt(50);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要猜的数（50以内）：");
		int userNum = scanner.nextInt();
		// 遍历数组
		boolean flag = false;
		for (int x : nums) {
			if (userNum == x) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("恭喜你，猜对了");
		} else {
			System.out.println("没猜对，加油");
		}
		
		scanner.close();
	}
}
