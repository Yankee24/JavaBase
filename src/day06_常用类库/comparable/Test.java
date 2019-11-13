package day06_常用类库.comparable;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = {11, 23, 34, 1, 35, 232, 9};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] names = {"jack", "tom", "abe", "甜甜"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Cat[] cats = {new Cat("愤愤", 1), new Cat("菲菲", 3), new Cat("Tom", 2)};
		Arrays.sort(cats);
		System.out.println(Arrays.toString(cats));
		
		Dog[] dogs = {new Dog("愤愤", 1), new Dog("菲菲", 3), new Dog("Tom", 2)};
		Arrays.sort(dogs, new DogComparator());
		System.out.println(Arrays.toString(dogs));
	}
}
