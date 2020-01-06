package base.day04_面向对象;

// 封装性
// 如果属性没有封装，那么在本类之外创建对象后，可以直接访问属性
// private关键字：访问权限修饰符，表示私有的，私有的属性或方法，只能在本类中访问
// public关键字：表示共有的，公有的属性和方法，可以被类外部的其他类访问
public class Encapsulation {
	public static void main(String[] args) {
		Person person = new Person();
		// person.name = "小明";
		// person.age = 10;
		person.setName("小明");
		person.setAge(10);
		System.out.println("我叫" + person.getName() + "，今年" + person.getAge() + "岁啦！");
		
		person.run(34);
		// 销毁对象person
		person = null;
	}
}


// 没有封装之前
class Person {
	// String name;
	// int age;
	// 属性的封装
	private String name;
	private int age;
	
	// 对外部提供一个为name属性设置值得方法
	public void setName(String name) {
		this.name = name;
	}
	
	// 对外提供一个获取name属性的方法
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void run(int len) {// 参数也是局部变量
		int m = len;// m 也是局部变量
		System.out.println("我跑了" + m + "米");
	}
}