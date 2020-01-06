package base.day03_方法与数组;

public class ArrayTraversal {
	public static void main(String[] args) {
		int[] scores = {10, 32, 98, 100};
		System.out.println("数组的长度为：" + scores.length);
		
		// 遍历数组：简单的for循环
		System.out.print("数组中的元素为：");
		int len = scores.length;
		for (int i = 0; i < len ; i++) {
			int score = scores[i];
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 遍历数组：增强for循环foreach遍历
		// JDK1.5之后新增加的特性
		for (int x : scores) {
			System.out.print(x + " ");
		}
		System.out.println("\n" + "------------");
		
		// new关键字表示创建一个数组
		int[] nums = new int[] {1, 2, 3, 4, 5};
		System.out.println(nums);
		
		// 调用方法
		print(scores);
		print2(10, 32, 98, 100);
		System.out.println("-----------");
		print3(scores);
		print4(scores);
		print3(null);
	}
	
	public static void print(int[] array) {
		int len = array.length;
		for (int i = 0; i < len; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// JDK1.5可变参数
	// 可变参数只能是参数列表中的最后一个
	// 可变参数作为数组使用
	public static void print2(int...array) {
		int len = array.length;
		for (int i = 0; i < len; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// 测试数组的异常，空指针异常NullPointerException
	public static void print3(int[] array) {
		// java.lang.NullPointerException
		// 当一个变量为null（没有赋值时）时，我们调用了该变量的属性和方法
		System.out.println("数组的长度：" + array.length);
	}
	
	// 测试数组的异常，数组下标越界ArrayIndexOutOfBoundsException
	public static void print4(int[] array) {
		// java.lang.ArrayIndexOutOfBoundsException
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
