package base.day04_面向对象;

//  String传递
public class ReferencePassing2 {
	public static void main(String[] args) {
		String name = "小飞";
		method(name);
		System.out.println("name = " + name);
	}
	
	public static void method(String sname) {
		sname = "小贝";
	}
}
