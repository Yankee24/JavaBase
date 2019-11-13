package day03_方法与数组;

public class DirectInsertionSort {
	public static void main(String[] args) {
		int[] nums = {34, 4, 56, 89, 12, 9};// 待排序的数列
		// 控制比较的轮数
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];// 记录操作数
			int j = 0;
			for (j = i - 1; j >= 0; j--) {
				if (nums[j] > temp) {
					nums[j + 1] = nums[j];
				} else {
					break;
				}
			}
			if (nums[j + 1] != temp) {
				nums[j + 1] = temp;
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

// 34  34  56  89  12  9
// 4  34  56  89  12  9		// 第一轮：i = 1		temp = 4

// 4  34  56  89  12  9		// 第二轮：i = 2		temp = 56

// 4  34  56  89  12  9		// 第三轮：i = 3		temp = 89

// 4  34  56  89  89  9
// 4  34  56  56  89  9		
// 4  34  34  56  89  9
// 4  12  34  56  89  9		// 第四轮：i = 4		temp = 12

// 4  12  34  56  89  89
// 4  12  34  56  56  89
// 4  12  34  34  56  89
// 4  12  12  34  56  89
// 4  9  12  34  56  89		// 第五轮：i = 5		temp = 9