package day03_方法与数组;

public class BinarySearch {
	public static void main(String[] args) {
		// 必须保证数列是有序的
		int[] nums = {10, 20, 30, 75, 89, 99};
		int index = binarySearch(nums, 89);
		System.out.println(index);
	}
	
	// 二分查找算法BinarySearch
	public static int binarySearch (int[] nums, int key) {
		int start = 0;// 开始下标
		int end = nums.length - 1;// 结束下标
		
		while (start <= end) {
			int middle = (start + end) / 2;// 也可以使用>>>1
			if (nums[middle] > key) {
				end = middle - 1;
			} else if (nums[middle] < key) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
