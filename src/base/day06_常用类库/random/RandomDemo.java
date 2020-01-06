package base.day06_常用类库.random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextLong());
		System.out.println(random.nextInt(5));
	}
}
