package base.day15_注解;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/11 9:18
 * @Description AnnotationDemo
 */
// 消除警告信息
@SuppressWarnings("all")
public class AnnotationDemo {
    @Test
    public void test1() {
        Cat cat = new Cat("喵喵", 4);
        cat.showInfo();// 调用了一个已过时的方法

        List list = new ArrayList();
        list.add("vince");
        list.add(10);
        list.add(10.1f);
    }

    // 反射来处理注解
    @Test
    public void test2() {
        Class<Cat> catClass = Cat.class;
        // 获取类上应用的指定注解
        MyAnnotation annotation = catClass.getAnnotation(MyAnnotation.class);
        // 获取注解上的变量值
        String name = annotation.name();
        int age = annotation.age();
        String[] like = annotation.like();
        Color color = annotation.color();
        try {
            Cat cat = catClass.newInstance();
            cat.setName(name);
            cat.setAge(age);
            cat.setLike(like);
            cat.setColor(color);
            System.out.println(cat);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        try {
            Class<?> aClass = Class.forName("day15_注解.Cat");
            Method method = aClass.getMethod("getName");// 找到getName()方法
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                String name = annotation.name();
                int age = annotation.age();
                String[] like = annotation.like();
                Color color = annotation.color();
                Cat cat = (Cat) aClass.newInstance();
                cat.setName(name);
                cat.setAge(age);
                cat.setLike(like);
                cat.setColor(color);
                System.out.println(cat);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
