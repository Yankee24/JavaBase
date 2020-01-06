package base.day06_常用类库.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaStudent {
	public static void main(String[] args) {
		Student[] students = { new Student("张三", 4), new Student("李四", 5), new Student("小明", 2) };
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}			
		});
		System.out.println(Arrays.toString(students));
		System.out.println("----------------");
		
		Comparator<Student> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
		Arrays.sort(students, comparator);
		System.out.println(Arrays.toString(students));
		System.out.println("-----------------");
		
		Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println(Arrays.toString(students));
	}
}
