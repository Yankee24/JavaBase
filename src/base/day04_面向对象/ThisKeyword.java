package base.day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * 调用类中的属性
 * 调用类中的方法或构造方法
 * 表示当前对象：在方法调用的过程中，那个对象调用了方法，在方法内部的this就代表谁
 * 类名.this
 */
public class ThisKeyword {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("咪咪");
		cat.setAge(3);
		cat.eat();
	}
}

class Cat {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {// name = 咪咪
		this.name = name;// this代表的是当前对象
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		// 在方法中可以使用this调用类中的其他方法，this可以省略，this前面可以使用当前的类名.this
		// 在后面的内部类知识点中会涉及到
		System.out.println("我是" + Cat.this.getName() + "，我要吃鱼！");
		// 在方法中可以使用this调用类中的其他属性，this可以省略
		// System.out.println("我是" + this.name + "，我要吃鱼！");
	}
}
