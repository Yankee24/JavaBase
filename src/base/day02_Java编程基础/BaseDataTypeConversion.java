package base.day02_Java编程基础;

public class BaseDataTypeConversion {
	public static void main(String[] args) {
		byte b = 10;
		short s = b;// 把一个字节赋值给一个短整型变量，自动转换
		int i = s;// 把一个短整型赋值给一个整型变量，自动转换
		long lon = i;// 把一个整型变量赋给一个长整型变量，自动转换
		System.out.println(lon);
		
		// char -> int 自动转换
		char sex = '男';
		int sex2 = sex;
		System.out.println(sex2);
		
		// float -> double 自动转换
		float f = 20f;
		double d = f;
		System.out.println(d);
		
		// float 和 double 是属于近似值
		// byte char short int long 属于精确值
		// 精确值转近似值时可能会丢失精度
		
		int num = 231232331;
		float num2 = num;
		// 如果用于表示货币值，不建议使用float或者double
		System.out.println(num2);
		
		// 面试题：short、byte、int：三者在计算时会自动转换成int
		short s1 = 10;
		// s1 = s1 + 1;
		int s2 = s1 + 1;
		System.out.println(s2);
		
		// int x = lon;// 从long转换到int可能会有损失
		int x = (int)lon;
		System.out.println(x);
	}
}
