package day03_方法与数组;

public class SelectSort {
	public static void main(String[] args) {
		int[] nums = {34, 4, 56, 89, 12, 9};// 待排序的数列
		int minIndex = 0;// 用于记录每次比较的最小值下标
		for (int i = 0; i < nums.length - 1; i++) {
			minIndex = i;// 每轮设定一个最小值下标
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[minIndex] > nums[j]) {
					minIndex = j;
				}
			}
			// 判断需要交换的数下标是否是自己
			if (minIndex != i) {
				nums[minIndex] = nums[minIndex] + nums[i];
				nums[i] = nums[minIndex] - nums[i];
				nums[minIndex] = nums[minIndex] - nums[i];
			}
		}
		// 输出结果
		System.out.print("排序后的数组为：");
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}

// 34  4  56  89  12  9

// 4  34  56  89  12  9		// 第一轮 5次

// 4  9  56  89  12  34		// 第二轮 4次

// 4  9  12  89  56  34		// 第三轮 3次

// 4  9  12  34  56  89		// 第四轮 2次

// 4  9  12  34  56  89		// 第五轮 1次