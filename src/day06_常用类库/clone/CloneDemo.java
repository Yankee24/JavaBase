package day06_常用类库.clone;

public class CloneDemo {
	public static void main(String[] args) {
		Cat cat = new Cat("喵喵", 3);
		try {
			Cat newCat = (Cat) cat.clone();
			System.out.println("cat=" + cat);
			System.out.println("newCat=" + newCat);
			System.out.println(cat == newCat);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
