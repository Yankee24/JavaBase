package base.day05_Eclipse与异常处理;

import java.util.Scanner;

/**
 * @author xiao儿
 * @date 2019年8月22日 下午8:24:47
 * @description LoginDemo类
 */
public class LoginDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = scanner.nextLine();
		System.out.println("请输入密码：");
		String password = scanner.nextLine();
		
		UserService userService = new UserService();
		try {
			User user = userService.login(name, password);
			System.out.println("登录成功");
			System.out.println(user);
		} catch (CustomException e) {
			e.printStackTrace();
		}

		scanner.close();
	}
}
