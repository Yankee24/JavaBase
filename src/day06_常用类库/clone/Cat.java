package day06_常用类库.clone;

/**
 * @author xiao儿
 * @date 2019年8月26日 下午5:43:19
 * @description Cat对象
 * 对象需要具备克隆功能：
 * 1.实现 Cloneable 接口（标记接口）
 * 2.重写 Object 类中的 clone() 方法
 */
public class Cat implements Cloneable {
	private String name;
	private int age;

	public Cat() {
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	// 重写 Object 中的 clone() 方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
