package day06_常用类库.system;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SystemDemo {
	public static void main(String[] args) {
		System.out.println("向控制台输出：");
		System.err.println("出错了");
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int[] nums2 = new int[nums.length];
		// 参数：原数组，原数组的起始位置，目标数组，目标数组的起始位置，长度
		System.arraycopy(nums, 0, nums2, 0, nums.length);
		System.out.println(Arrays.toString(nums2));
		
		System.out.println(System.currentTimeMillis());
		Date nowDate = new Date(System.currentTimeMillis());
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String now = dateFormat.format(nowDate);
		System.out.println(now);
		
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
	}
}
