package day04_面向对象;

/**
 * 
 * @author xiao儿
 *
 * static关键字
 */
public class StaticKeyword {
	public static void main(String[] args) {
//		 Role beibei = new Role("刘备", "蜀国");
//		 Role yunchang = new Role("云长", "蜀国");
//		 Role feifei = new Role("张飞", "蜀国");
		Role beibei = new Role("刘备");
		Role yunchang = new Role("云长");
		Role feifei = new Role("张飞");
		
		System.out.println(beibei.getInfo());
		System.out.println(yunchang.getInfo());
		System.out.println(feifei.getInfo());
		
//		System.out.println("---------------");
//		System.out.println(beibei.country);
//		System.out.println(yunchang.country);
//		System.out.println(feifei.country);
		
//		System.out.println("----------------");
//		beibei.country = "秦国";
//		System.out.println(beibei.country);
//		System.out.println(yunchang.country);
//		System.out.println(feifei.country);
		
		System.out.println("----------------");
		System.out.println(Role.country);// 用类名调用静态变量
	}
}

// 角色
class Role {
	private String name;
	// private String country;
	static String country = "蜀国";// 静态变量（全局变量）

//	 public Role(String name, String country) {
//		 this.name = name;
//		 this.country = country;
//	 }
	
	public Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 静态方法不能访问非静态数据
	public static void setCountry(String country) {
		Role.country = country;
	}

//	public String getCountry() {
//		return country;
//	}

//	public void setCountry(String country) {
//		this.country = country;
//	}
	
	public String getInfo() {
		return "name = " + name + "，country = " + country;
	}
}