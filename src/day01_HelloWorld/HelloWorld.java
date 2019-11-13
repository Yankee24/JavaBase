package day01_HelloWorld;

/**
 * 表示文档注释
 * @author xiao儿
 * public：关键字，公共的（公有的）
 * class：关键字，类别（分类）
 * HelloWorld：自定义的类名
 * {}表示作用范围
 */
public class HelloWorld {
	/*
	 * 多行注释
	 * static：关键字，表示静态的
	 * void：关键字，返回值类型（空，没有返回值）
	 * main：不是关键字，表示主函数名
	 * main后面的（）表示函数的参数列表
	 * String[]：表示字符串的数组
	 * args：表示字符串数组的名称
	 */
	public static void main(String[] args) {
		// 向控制台输出一句话：HelloWorld!
		System.out.println("HelloWorld!");
	}
}