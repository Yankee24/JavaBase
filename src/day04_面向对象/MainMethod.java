package day04_面向对象;

public class MainMethod {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		for (String string : args) {
			System.out.println(string);
		}
	}
}

// 使用dos命令
// 传参数时可以使用java MainMethod "参数1" "参数2"