package base.day06_常用类库.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @author xiao儿
 * @date 2019年8月26日 上午9:02:44
 * @description 程序国际化
 * 1.Locale
 * 2.Properties 文件：属性文件（配置文件），内容以键值对的形式存放：key:value
 * 3.ResourceBundle 工具类：来绑定属性文件，并指定 Locale 对象，来自动选择使用那个属性文件，默认将使用与操作系统相同的语言环境
 * 	getString() 方法从属性文件中使用key来获取value
 * 注意：配置文件是只读的
 */
public class Internationalization {
	public static void main(String[] args) {
		// 创建一个本地语言环境对象，该对象会根据参数设置来自动选择与之相关的语言环境
		// 参数：语言，地区
		// Locale locale_CN = new Locale("zh", "CN");
		Locale locale_US = new Locale("en", "US");
		// 获取当前系统默认的语言环境
		// Locale locale_default = Locale.getDefault();
		
		Scanner scanner = new Scanner(System.in);
		// 用户绑定属性文件的工具类（参数：属性文件的基本名（就是前缀，比如：info））
		ResourceBundle resourceBundle = ResourceBundle.getBundle("base.day06_常用类库.i18n.info", locale_US);
		System.out.println(resourceBundle.getString("System.name"));
		System.out.println(resourceBundle.getString("input.username"));
		String username = scanner.nextLine();
		System.out.println(resourceBundle.getString("input.password"));
		String password = scanner.nextLine();
		
		if ("admin".equals(username) && "123456".equals(password)) {
			System.out.println(resourceBundle.getString("login.success"));
			String welcome = resourceBundle.getString("welcome");
			// 动态文本格式化
			welcome = MessageFormat.format(welcome, username);
			System.out.println(welcome);
		} else {
			System.out.println(resourceBundle.getString("login.error"));
		}
		
		scanner.close();
	}
}
