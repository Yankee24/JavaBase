package day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * 构造代码块：在类中定义的代码块
 */
public class ConstructCodeBlock {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
	}
}

class Student {
	public Student() {
		System.out.println("我是构造方法");
	}
	
	{
		System.out.println("我是构造代码块");
	}
}
