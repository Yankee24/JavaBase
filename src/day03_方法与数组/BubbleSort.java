package day03_方法与数组;

// 相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定的排序算法
public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = {34, 4, 56, 89, 12, 9};// 待排序的数列
		// 外循环控制轮数
		for (int i = 0; i < nums.length - 1; i++) {// 比较轮数等于数列的长度-1
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					nums[j] = nums[j] + nums[j + 1];
					nums[j + 1] = nums[j] - nums[j + 1];
					nums[j] = nums[j] - nums[j + 1];
				}
			}
		}
		// 输出结果
		System.out.print("排序后的元素为：");
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}

// 34  4  56  89  12  9

// 4  34  56  12  9  89		// 第一轮 5次

// 4  34  12  9  56			// 第二轮 4次

// 4  12  9  34				// 第三轮 3次

// 4  9  12					// 第四轮 2次

// 4  9						// 第五轮 1次