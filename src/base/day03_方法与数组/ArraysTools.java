package base.day03_方法与数组;

import java.util.Arrays;

public class ArraysTools {
	public static void main(String[] args) {
		int[] nums = {12, 34, 9, 45, 99, 4};
		
		// 快速排序
		Arrays.sort(nums);
		// 二分查找
		int index = Arrays.binarySearch(nums, 45);
		System.out.println("找到的下标是：" + index);
		
		// 输出数组
		System.out.print("排序后的数组为：");
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println("\n" + "------------------------");
		// 调用toString()类输出数组
		System.out.println(Arrays.toString(nums));
		
		System.out.println("------------------------");
		// 数组的复制
		int[] nums2 = Arrays.copyOf(nums, 10);
		System.out.println(Arrays.toString(nums2));
		System.out.println("------------------------");
		int[] newNums = new int[nums.length];
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		System.out.println(Arrays.toString(newNums));
		
		// 小结，数组的复制：
		// 效率由高到低排序是：System.arraycopy --> Arrays.copyOf --> for
		
		System.out.println("------------------------");
		// 判断数组是否相等
		System.out.println(Arrays.equals(nums, newNums));
		System.out.println("------------------------");
		
		// 填充数组
		Arrays.fill(nums2, 9);
		System.out.println(Arrays.toString(nums2));
		
	}
}
