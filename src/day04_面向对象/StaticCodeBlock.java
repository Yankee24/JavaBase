package day04_面向对象;

public class StaticCodeBlock {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher);
	}
}

class Teacher {
	{
		System.out.println("构造代码块");
	}
	
	static {
		System.out.println("静态代码块");
	}
	
	public Teacher() {
		System.out.println("构造方法");
	}
}
