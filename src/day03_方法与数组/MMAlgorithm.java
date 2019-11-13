package day03_方法与数组;

public class MMAlgorithm {
	public static void main(String[] args) {
		int[] num = {12, 3, 54, 67, 88, 34};
		int max = max(num);
		System.out.println("数列中的最大值是：" + max);
		int min = min(num);
		System.out.println("数列中的最小值是：" + min);
	}
	
	// 求数列中的最大值
	public static int max(int[] num) {
		int max = num[0];
		int len = num.length;
		for (int i = 1; i < len; i++) {
			if (num[i] > max) {
				num[i] = num[i] + max;
				max = num[i] - max;
				num[i] = num[i] - max;
			}
		}
		return max;
	}
	
	// 求数列中的最小值
	public static int min(int[] num) {
		int min = num[0];
		int len = num.length;
		for (int i = 0; i < len; i++) {
			if (num[i] < min) {
				num[i] = num[i] + min;
				min = num[i] - min;
				num[i] = num[i] - min;
			}
		}
		return min;
	}
}
