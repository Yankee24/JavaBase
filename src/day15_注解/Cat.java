package day15_注解;

import java.util.Arrays;

/**
 * @author xiao儿
 * @date 2019/9/11 9:18
 * @Description Cat
 */
@MyAnnotation(name = "vince", like = {"鱼", "草"}, color = Color.RED)
public class Cat {
    private String name;
    private int age;
    private String[] like;
    private Color color;

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

    public String[] getLike() {
        return like;
    }

    public void setLike(String[] like) {
        this.like = like;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 用于验证方法是否覆盖父类中的方法
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like=" + Arrays.toString(like) +
                ", color=" + color +
                '}';
    }

    // 用于标记方法已过时，不建议使用
    @Deprecated
    public String showInfo() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
