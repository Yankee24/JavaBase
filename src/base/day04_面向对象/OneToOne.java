package base.day04_面向对象;

public class OneToOne {
	public static void main(String[] args) {
		Hero hero = new Hero("刘备", 300);
		Weapon weapon = new Weapon("双股剑", 3);
		
		// 把两个对象关联
		hero.setWeapon(weapon);
		weapon.setHero(hero);
		
		// 通过Hero来获取信息
		String name = hero.getName();
		int age = hero.getAge();
		Weapon w = hero.getWeapon();
		System.out.println("我是" + name + "，我今年" + age + "，岁了，我的武器是" + w.getName() + "，排行" + w.getGrade() + "级");
	}
}

// 英雄类
class Hero {
	private String name;
	private int age;
	// 一对一的关系
	private Weapon weapon;

	public Hero() {
	}

	public Hero(String name, int age) {
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

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}

// 兵器类
class Weapon {
	private String name;
	private int grade;
	private Hero hero;

	public Weapon() {
	}

	public Weapon(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

}