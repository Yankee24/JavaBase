package base.day07_文件与IO.objectstream;

import java.io.Serializable;

/**
 * @author xiao儿
 * @date 2019/9/1 10:14
 * @Description Dog
 */

// 如果一个类创建的对象需要被序列化，那么该类必须实现 Serializable 接口
// Serializable 和 Cloneable 一样是一个标记接口，没有任何定义，为了告诉JVM该类对象可以被序列化

// 什么时候对象需要被序列化？
// 1.把对象保存到文件中（存储到物理介质）
// 2.对象需要在网络上进行传输

// 如果对象没有实现 Serializable 接口，会报错误：java.io.NotSerializableException
public class Dog implements Serializable {
    private String name;
    private int age;
    private String sex;
    private transient int id;// 在对象序列化时被忽略

    public Dog() {
    }

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
