package day08_集合.collection.set;

import java.util.LinkedHashSet;

/**
 * @author xiao儿
 * @date 2019/9/1 22:23
 * @Description LinkedHashSetDemo
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        linkedHashSet();
    }

    /**
     * LinkedHashSet
     * 1.实现原理：哈希表和链表列表实现
     */
    private static void linkedHashSet() {
        LinkedHashSet<Cat> cats = new LinkedHashSet<>();
        Cat cat = new Cat("miaomiao", 5, 1);
        Cat cat1 = new Cat("huahua", 2, 3);
        Cat cat2 = new Cat("tom", 3, 2);
        Cat cat3 = new Cat("miaomiao", 4, 4);
        Cat cat4 = new Cat("beibei", 3, 3);
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        for (Cat c : cats) {
            System.out.println(c);
        }
    }
}
