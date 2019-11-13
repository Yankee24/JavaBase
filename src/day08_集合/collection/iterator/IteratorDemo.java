package day08_集合.collection.iterator;

import day08_集合.collection.set.Cat;

import java.util.*;

/**
 * @author xiao儿
 * @date 2019/9/1 23:33
 * @Description IteratorDemo
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        Cat cat = new Cat("miaomiao", 5, 1);
        Cat cat1 = new Cat("huahua", 2, 3);
        Cat cat2 = new Cat("tom", 4, 2);
        Cat cat3 = new Cat("miaomiao", 5, 4);
        Cat cat4 = new Cat("beibei", 3, 3);
        list.add(cat);
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        list.add(cat4);

        foreach(list);
        System.out.println("-----------------");
        iterator(list);
        System.out.println("-----------------");
        enumeration();
    }

    // foreach(1.5)
    private static void foreach(Collection<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    // iterator(1.5之前统一的迭代集合方式）
    private static void iterator(Collection<Cat> cats) {
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    // enumeartion
    private static void enumeration() {
        Vector<String> vector = new Vector<>();
        vector.add("Tom");
        vector.add("Jack");
        vector.add("Job");
        vector.add("Lily");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
