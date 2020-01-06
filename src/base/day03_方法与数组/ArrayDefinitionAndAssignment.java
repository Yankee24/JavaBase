package base.day03_方法与数组;

/**
 * 
 * @author xiao儿
 * 
 * 数组的定义：一组能够存储相同数据类型的数据集合
 * 数组一定要有长度
 * 数组中的每一个数据称为元素
 * 数组元素的位置从0开始
 * 数组中的位置称为下标
 */
public class ArrayDefinitionAndAssignment {
	public static void main(String[] args) {
		// 1.使用默认的初始值来初始化数组中的每一个元素
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		// 2.先声明，然后再赋予默认的初始值
		int[] nums2;
		nums2 = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = i + 1;
		}
		
		// 3.先声明，然后再使用指定的值进行初始化
		int[] nums3 = new int[]{45, 54, 89};
		System.out.println(nums3.length);
		
		// 4.将第三种写法可以简化为（使用数组常量值给数组进行赋值）
		int[] nums4 = {45, 54, 89};
		System.out.println(nums4.length);
	}
}
