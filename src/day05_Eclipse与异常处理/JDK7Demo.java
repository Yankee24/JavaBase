package day05_Eclipse与异常处理;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDK7Demo {
	public static void main(String[] args) {
		// 1.5之后
		// Scanner scanner = new Scanner(System.in);
		// 1.5之前接收控制台输入，直接使用文件IO流
		// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// String info = bufferedReader.readLine();
		// bufferedReader.close();
		// 自动关闭流
		// 1.7之后的新特性
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("请输入：");
			String info = br.readLine();
			int num = Integer.parseInt(info);
			System.out.println(num);
			System.out.println(info);
			// br.close();
		} catch (IOException | NumberFormatException e) {// 只有并列时才可以
			e.printStackTrace();
		}
	}
}
