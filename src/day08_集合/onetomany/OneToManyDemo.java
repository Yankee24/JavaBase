package day08_集合.onetomany;

/**
 * @author xiao儿
 * @date 2019/9/3 8:53
 * @Description OneToManyDemo
 */
public class OneToManyDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张老师", 18, "女");
        Student student = new Student("Tom", 13, "男");
        Student student1 = new Student("Job", 12, "男");
        Student student2 = new Student("Lily", 11, "女");

        // 关联关系
        teacher.getStudents().add(student);
        teacher.getStudents().add(student1);
        teacher.getStudents().add(student2);

        student.setTeacher(teacher);
        student1.setTeacher(teacher);
        student2.setTeacher(teacher);

        print(teacher);
    }

    private static void print(Teacher teacher) {
        System.out.println(teacher.getName());
        for (Student student : teacher.getStudents()) {
            System.out.println(student);
        }
    }
}
