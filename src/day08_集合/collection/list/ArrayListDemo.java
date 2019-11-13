package day08_集合.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/1 14:09
 * @Description ListDemo
 *
 * Collection 接口：用于存储单个对象的集合
 * List 接口：
 * 1.有序的，可以重复的
 * 2.允许多个null元素
 * 3.具体的实现类：ArrayList、Vector、LinkedList
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        arrayList();
    }

    /**
     * ArrayList
     * 1.实现原理：采用动态对象数组实现，默认的构造方法创建了一个空数组
     * 2.第一次添加元素，扩充容量为10，之后的扩充算法：原来数组大小 + 原来数组大小的一半
     * 3.不适合进行删除或者插入操作
     * 4.为了防止数组动态的扩充次数过多，建议创建 ArrayList 时，给定初始容量
     * 5.线程不安全，适合在单线程访问时使用，效率较高
     * JDK1.2开始
     */
    private static void arrayList() {
        // 使用集合来存储多个不同类型的元素（对象），那么在处理时会比较麻烦，在实际开发中，不建议这样使用
        // 在一个集合中存储相同的类型的对象
        List<String> list = new ArrayList<>();
        list.add("旺仔");
        list.add("真果粒");
        list.add("蒙牛");
        list.add("银桥");
        // list.add(10);

        // 遍历集合
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("旺仔是否存在于list中：" + list.contains("旺仔"));
        list.remove("银桥");
        System.out.println("list_size：" + list.size());

        String[] array = list.toArray(new String[]{});
        for (String str : array) {
            System.out.println(str);
        }
    }
}
