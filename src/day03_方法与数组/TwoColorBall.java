package day03_方法与数组;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author xiao儿
 *
 * 1.用户选择是机选还是手选号码
 * 2.接收用户选号（6红，1蓝）
 * 3.生成系统号码（6红，1蓝）
 * 4.比较系统号码和用户号码，记录个数
 * 5.验证是否中奖
 * 6.系统号码排序
 * 7.公布结果
 * 
 */
public class TwoColorBall {
	public static void main(String[] args) {
		
		// 定义相关的变量
		int[] userRedBall = new int[6];// 用户选择的红球号码
		int[] sysRedBall = new int[6];// 系统生成的红球号码
		int userBlueBall = 0;// 用户选择的蓝球号码
		int sysBlueBall = 0;// 系统生成的蓝球号码
		int redCount = 0;// 记录用户选择正确的红球数
		int blueCount = 0;// 记录用户选择正确的蓝球数
		int[] redBall = new int[33];// 用户存储1~33的红球号码
		// 需要随机生成6个在1~33之间不重复的数（算法）
		for (int i = 0; i < redBall.length; i++) {
			redBall[i] = i + 1;
		}
		
		// 游戏开始，系统提示
		System.out.println("双色球游戏开始，Good Luck!");
		System.out.println("请问您是要机选或手选（1.机选  2.手选）：");
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();// 生成随机数的工具
		
		boolean flag = true;// 用于判断是否要重新输入机选或手选
		while (flag) {
			int isAuto = sc.nextInt();
			switch (isAuto) {
			case 1:
				// 机选
				computerSelection(redBall, userRedBall);// 机选红球
				userBlueBall = random.nextInt(16) + 1;// 机选蓝球
				flag = false;
				break;
			case 2:
				// 手选
				System.out.println("请选择6个红球号码（1~33）：");
				for (int i = 0; i < userRedBall.length; i++) {
					userRedBall[i] = sc.nextInt();
				}
				System.out.println("请选择1个篮球号码（1~16）：");
				userBlueBall = sc.nextInt();
				flag = false;
				break;
			default:
				System.out.println("请问您是要机选或手选（1.机选  2.手选）：");
				break;
			}
		}
		
		// 系统随机生成号码
		// 红球
		computerSelection(redBall, sysRedBall);
		// 蓝球
		sysBlueBall = random.nextInt(16) + 1;
		
		// 统计结果
		// 统计红球
		for (int i = 0; i < userRedBall.length; i++) {
			for (int j = 0; j < sysRedBall.length - redCount; j++) {
				if (userRedBall[i] == sysRedBall[j]) {
					int temp = sysRedBall[j];
					sysRedBall[j] = sysRedBall[sysRedBall.length - 1 - redCount];
					sysRedBall[sysRedBall.length - 1 - redCount] = temp;
					redCount++;
					break;
				}
			}
		}
		// 统计蓝球
		if (userBlueBall == sysBlueBall) {
			blueCount = 1;
		}
		
		// 验证是否中奖（从条件成功率高的排前面）
		if (blueCount == 0 && redCount <= 3) {
			System.out.println("革命尚未成功，同志仍需努力！");
		} else if (blueCount == 1 && redCount < 3) {
			System.out.println("六等奖，5元大洋！");
		} else if ((blueCount == 1 && redCount == 3) || (blueCount == 0 && redCount == 4)) {
			System.out.println("五等奖，10元大洋！");
		} else if ((blueCount == 1 && redCount == 4) || (blueCount == 0 && redCount == 5)) {
			System.out.println("四等奖，200元大洋！");
		} else if (blueCount == 1 && redCount == 5) {
			System.out.println("三等奖，3000元大洋！");
		} else if (blueCount == 0 && redCount == 6) {
			System.out.println("二等奖，1500000元大洋！");
		} else if (blueCount == 1 && redCount == 6) {
			System.out.println("一等奖，5000000元大洋！");
		} else {
			System.out.println("系统有误，中奖无效！");
		}
		
		// 公布系统号码
		System.out.println("本期中奖红球号码：");
		sort(sysRedBall);
		System.out.println(Arrays.toString(sysRedBall));
		System.out.println("本期中奖蓝球号码为：" + sysBlueBall);
		
		// 公布用户号码
		System.out.println("您选择的红球号码：");
		sort(userRedBall);
		System.out.println(Arrays.toString(userRedBall));
		System.out.println("您选择的蓝球号码为：" + userBlueBall);
		
		System.out.println("买双色球，造福你我他！谢谢参与！");
		
		sc.close();
	}
	
	/**
	 * 冒泡排序
	 * @param ball
	 */
	public static void sort(int[] ball) {
		for (int i = 0; i < ball.length; i++) {
			for (int j = 0; j < ball.length - 1 - i; j++) {
				if (ball[j] > ball[j + 1]) {
					ball[j] = ball[j] + ball[j + 1];
					ball[j + 1] = ball[j] - ball[j + 1];
					ball[j] = ball[j] - ball[j + 1];
				}
			}
		}
	}
	
	/**
	 * 用于在指定数列中，随机生成多个不重复的数
	 * @param redBall
	 * @param userRedBall
	 */
	public static void computerSelection(int[] redBall, int[] userRedBall) {
		Random random = new Random();// 生成随机数
		int index = -1;
		for (int i = 0; i < userRedBall.length; i++) {
			index = random.nextInt(redBall.length - i);
			userRedBall[i] = redBall[index];
			// 交换生成的数和最后一个数的位置
			int temp = redBall[index];
			redBall[index] = redBall[redBall.length - 1 - i];
			redBall[redBall.length - 1 -i] = temp;
		}
	}
}
