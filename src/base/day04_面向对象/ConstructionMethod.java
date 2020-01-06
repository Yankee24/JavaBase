package base.day04_面向对象;

public class ConstructionMethod {
	public static void main(String[] args) {
		Dog dog = new Dog();// 调用无参数的构造方法
		dog.setName("小白");
		dog.setAge(10);
		System.out.println("我叫" + dog.getName() + "，今年" + dog.getAge() + "岁了。");
		
		Dog dog2 = new Dog("旺旺", 12);
		System.out.println(dog2);
		dog2 = null;// 销毁对象
	}
}

class Dog {
	
	public Dog() {
		System.out.println("无参的构造方法执行了！");
	}
	
	public Dog(String name) {
		System.out.println("带一个参数的构造方法执行了！");
	}
	
	public Dog(String name, int age) {
		this(name);// 调用其他构造方法时，此语句需要在第一句，在构造方法相互调用时必须要有出口
		// this.name = name;
		this.age = age;
		System.out.println("带两个参数的构造方法执行了！");
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}