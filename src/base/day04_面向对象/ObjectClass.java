package base.day04_面向对象;

public class ObjectClass {
	public static void main(String[] args) {
		Doctor doctor = new Doctor(1, "飞飞", 18);
		// System.out.println(doctor.toString());
		// 默认会调用toString
		System.out.println(doctor);
		
		Doctor doctor2 = new Doctor(1, "飞飞", 18);
		boolean b = doctor.equals(doctor2);
		System.out.println("Doctor：" + b);
		
		String s1 = new  String("贝贝");
		String s2 = new String("贝贝");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(doctor.getClass() == doctor2.getClass());
	}
}

class Doctor {
	private String name;
	private int did;
	private int age;

	public Doctor() {
	}

	public Doctor(int did, String name, int age) {
		this.did = did;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 重写Object类中的toString方法
	@Override
	public String toString() {
		return "did = " + did + "，name = " + name + "，age = " + age;
	}
	
	// 重写toString类中的equals方法
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (obj instanceof Doctor) {
			Doctor doc = (Doctor) obj;
			if (!this.name.equals(doc.name)) {
				return false;
			} else if (this.did != doc.did) {
				return false;
			} else if (this.age != doc.age) {
				return false;
			}
			return true;
		}
		return false;
	}
}