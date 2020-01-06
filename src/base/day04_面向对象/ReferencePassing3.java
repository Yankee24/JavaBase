package base.day04_面向对象;

//  String传递
public class ReferencePassing3 {
	public static void main(String[] args) {
		Perso p = new Perso();
		method(p);
		System.out.println("Perso perso = " + p.name);
	}
	
	public static void method(Perso perso) {
		perso.name = "贝贝";
	}
}

class Perso {
	String name = "飞飞";// 省略封装
}