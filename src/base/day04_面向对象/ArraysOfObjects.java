package base.day04_面向对象;

import java.util.Arrays;

/**
 * 
 * @author xiao儿
 *
 * 动态数组：
 * 1.数组是一种线性数组结构
 * 2.数组不适合进行删除插入等操作，适合添加、查找、遍历操作
 */
public class ArraysOfObjects {
	public static void main(String[] args) {
		ChickenManager chickenManager = new ChickenManager(5);
		// 添加
		chickenManager.add(new Chicken(1, "小小", 10));
		chickenManager.add(new Chicken(2, "小二", 8));
		chickenManager.add(new Chicken(3, "小三", 6));
		chickenManager.add(new Chicken(4, "小四", 4));
		chickenManager.add(new Chicken(5, "小五", 2));

		chickenManager.add(new Chicken(6, "小豆", 1));
		System.out.println("数组的长度是：" + chickenManager.length());

		System.out.println("--------findAll---------");
		chickenManager.printAll();

		System.out.println("--------find-----------");
		Chicken chicken = chickenManager.find(5);
		chicken.print();
		
		System.out.println("--------update----------");
		chickenManager.update(new Chicken(1, "下蛋公鸡", 20));
		chickenManager.printAll();
		
		System.out.println("--------delete-----------");
		chickenManager.delete(6);
		chickenManager.printAll();
	}
}

// 小鸡管理类
class ChickenManager {
	private Chicken[] chickens = null;
	private int count = 0;// 当前数组的元素个数（下标）

	public ChickenManager(int size) {
		if (size > 0) {
			chickens = new Chicken[size];
		} else {
			chickens = new Chicken[5];
		}
	}

	public int length() {
		return chickens.length;
	}

	// 添加：实现动态数组
	public void add(Chicken chicken) {
		if (count >= chickens.length) {// 数组已满，需要扩充
			// 算法1：扩充原来数组大小的一半 chickens.length * 3 / 2 + 1
			// 算法2：扩充原来数组的一倍 chickens.length * 2
			int newLength = chickens.length * 2;
			chickens = Arrays.copyOf(chickens, newLength);
		}
		chickens[count] = chicken;
		count++;
	}

	// 删除
	public void delete(int id) {
		for (int i = 0; i < count; i++) {
			if (chickens[i].getId() == id) {
				// 找到了要删除的对象，把该对象之后的对象向前移动一起
				for (int j = i; j < count - 1; j++) {
					chickens[j] = chickens[j + 1];
				}
				// 把最后一个对象赋值为空（删除）
				chickens[count - 1] = null;
				count--;// 下标减一
				break;
			}
		}
	}

	// 更新
	public void update(Chicken chicken) {
		Chicken tempChicken = find(chicken.getId());
		if (tempChicken != null) {
			tempChicken.setNameString(chicken.getNameString());
			tempChicken.setAge(chicken.getAge());
		}
	}

	// 查找
	public Chicken find(int id) {
		for (int i = 0; i < count; i++) {
			if (chickens[i].getId() == id) {
				return chickens[i];
			}
		}
		return null;
	}

	// 输出所有
	public void printAll() {
		for (int i = 0; i < count; i++) {
			chickens[i].print();
		}
	}
}

// 小鸡类（数据对象）value object (VO)
class Chicken {
	private int id;
	private String nameString;
	private int age;

	public Chicken() {
	}// 一般情况下最好保留默认的构造方法

	public Chicken(int id, String nameString, int age) {
		this.id = id;
		this.nameString = nameString;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println("id = " + id + "，name = " + nameString + "，age = " + age);
	}
}