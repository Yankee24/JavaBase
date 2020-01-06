package base.day02_Java编程基础;

// 转义字符
public class EscapeCharacter {
	public static void main(String[] args) {
		System.out.print("转义字符");
		System.out.print("\n");// 回车符
		// 如果需要在文件中实现换行，就需要\n\r
		System.out.print("我想输出一个回车符\n");
		System.out.println("\t这是一个制表符");
		System.out.println("输出一个反斜线：\\");
		System.out.println("输出一个单引号：\'");
		System.out.println("输出一个双引号：\"");
	}
}
