package day08_集合.collection.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author xiao儿
 * @date 2019/9/2 7:54
 * @Description ForEachDemo
 */
public class ForEachDemo {
    public static void main(String[] args) {
        foreach();
    }

    /**
     * JDK1.8新的迭代方法
     */
    private static void foreach() {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Job");
        list.add("Jack");
        list.add("Lily");

        list.forEach((String s) -> {
            System.out.println(s);
        });
        System.out.println("-----------");
        list.forEach(System.out::println);
        System.out.println("-----------");
        // list.forEach(new MyConsumer());// 自己写一个类 MyConsumer 实现 Consumer 接口
    }
}
