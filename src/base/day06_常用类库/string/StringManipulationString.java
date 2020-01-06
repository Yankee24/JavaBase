package base.day06_常用类库.string;

import java.util.Arrays;

public class StringManipulationString {
	public static void main(String[] args) {
		String str = "fsdjlj23234";
		// 根据下标找到相应字符
		char c = str.charAt(1);
		System.out.println(c);
		
		// 以字符数组的形式返回所有的字符串内容
		System.out.println(str.toCharArray());
		
		char[] cs = {'a', 'b', 'c', 'd'};
		// 将全部的字符数组变成字符串
		String s = new String(cs);
		System.out.println(s);
		
		// 将指定范围的字符数组变成字符串
		String s2 = new String(cs, 0, 1);
		System.out.println(s2);
		
		byte[] bytes = str.getBytes();
		// 将字符串变成字节
		System.out.println(Arrays.toString(bytes));
		
		// 将字节数组变成字符串
		String  s3 = new String(bytes);
		System.out.println(s3);
		
		// 将指定范围内的字节数组变成字符串
		String s4 = new String(bytes, 0, 2);
		System.out.println(s4);
		
		// 从第一个位置判断是否以指定的字符串开头
		System.out.println(str.startsWith("fs"));
		
		// 从指定位置判断是否以指定的字符串开头
		System.out.println(str.startsWith("fsd", 3));
		
		// 判断是否以指定的字符串结尾
		System.out.println(str.endsWith("34"));
		
		// 替换指定字符
		String s5 = new String(str.replace('f', 'e'));
		System.out.println(s5);
		
		// 替换指定字符串
		String s6 = new String(str.replace("fsd", "sss"));
		System.out.println(s6);
		
		// 替换指定字符串
		System.out.println(str.replaceAll("[0-9]", "*"));
		
		// 从指定位置截取到末尾结束
		System.out.println("截取字符串到末尾：" + str.substring(4));
		
		// 截取指定范围的字符串
		System.out.println("截取指定范围字符串：" + str.substring(4, 8));
		
		// 按照指定的字符串进行拆分
		System.out.println(Arrays.toString(str.split("j")));
		
		// 指定拆分的个数
		System.out.println(Arrays.toString(str.split("j", 2)));
		
		// 返回字符串是否存在
		System.out.println(str.contains("s"));
		
		// 从头查找指定字符是否存在
		System.out.println(str.indexOf("j"));
		
		// 判断字符串是否为空
		System.out.println(str.isEmpty());
		
		// 获得字符串的长度
		System.out.println(str.length());
		
		// 转大写
		System.out.println(str.toUpperCase());
		
		// 拼接字符串
		System.out.println(str.concat("iii"));
	}
}
