package day02_Java编程基础;

public class BaseDataType {
	public static void main(String[] args) {
		// 八种基本数据类型
		byte b = 10;// 字节型，占用1个字节，取值范围-128~127
		short s = 10;// 短整型，占用2个字节，取值范围-32768~32767，在实际开发中使用较少
		int i = 10;// 整型，占用4个字节
		long lon = 100L;// 长整型，占用8个字节
		float f = 10.98F;// 单精度浮点型，占用4个字节
		double d = 10.98D;// 双精度浮点型，占用8个字节
		char c = '杨';// 字符型，占用2个字节，取值范围0~65535
		boolean bool = true;// 布尔型，取值范围true,false
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(lon);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		
		// 定义变量的格式：
		// 类型 变量名;// 声明一个变量
		// 类型 变量名 = 值;// 声明变量的同时给变量赋值
		
		char c2 = 97;// ASCII码表
		System.out.println(c2);
		
		char c3 = 65;// ASCII码表
		System.out.println(c3);
		
		char c4 = 48;// ASCII码表
		System.out.println(c4);
	}
}