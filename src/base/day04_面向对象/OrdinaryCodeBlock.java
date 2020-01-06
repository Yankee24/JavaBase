package base.day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * 代码块：
 * 1.普通代码块，在方法中写的代码块
 */
public class OrdinaryCodeBlock {
	public static void main(String[] args) {
		{
			// 普通代码块
			String infoString = "局部变量1";
			System.out.println(infoString);
		}
		String infoString = "局部变量2";
		System.out.println(infoString);
	}
}
