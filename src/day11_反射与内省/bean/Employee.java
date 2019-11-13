package day11_反射与内省.bean;

/**
 * @author xiao儿
 * @date 2019/9/10 9:31
 * @Description Employee
 */
public class Employee {
    private String name;
    private int age;
    private int salary;

    public String getInfo() {
        return "name=" + name + "，age=" + age + "，salary=" + salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
