package day06_常用类库.comparable;

/**
 * @author xiao儿
 * @date 2019年8月26日 下午4:53:20
 * @description 自定义对象，实现排序
 * 1.可以实现 Comparable 的 comparaTo() 方法
 */
public class Cat implements Comparable<Cat> {
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

	@Override
	public int compareTo(Cat cat) {
//		if (this.age < cat.age)
//			return -1;
//		if (this.age > cat.age)
//			return 1;
//		return 0;
		return this.age - cat.age;
	}
}
