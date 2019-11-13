package day08_集合.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiao儿
 * @date 2019/9/1 18:03
 * @Description HashSetDemo
 * <p>
 * Set 接口：
 * 1.无序的（不保证顺序）
 * 2.不允许重复元素
 * 3.可以存在一个null元素
 * 4.具体实现类：HashSet、TreeSet 和 LinkedHashSet
 */
public class HashSetDemo {
    public static void main(String[] args) {
        hashSet();
    }

    /**
     * HashSet
     * 1.实现原理：基于哈希表（HashMap）实现
     * 2.不允许重复元素，可以有一个null元素
     * 3.不保证顺序恒久不变
     * 4.添加元素时把元素作为 HashMap 的key存储，HashMap的value使用一个固定的Object对象
     * 5.排除重复元素是通过equals来检查对象是否相同
     * 6.判断两个对象是否相同：先判断两个对象的hashCode是否相同（如果两个对象的hashCode相同，不一定是同一对象，如果不同，
     * 那一定不是同一个对象），如果不同则两个对象不是同一个对象，如果相同，还要进行equals判断，equals相同则是同一个对象，
     * 不同则不是同一个对象
     * 7.自定义对象要认为属性值都相同时为同一个对象，有这种需求时，那么我们需要重写所在类的hashCode和equals方法
     *
     * 小结：
     * （1）哈希表的存储结构：数组+链表（数组里的每一个元素以链表中的形式存储）
     * （2）如果把对象存储到哈希表中，先计算对象的hashCode值，在对数组长度求余数，来决定对象要存储在数组中的那个位置
     * （3）解决hashSet中的重复值使用的方式是：第6点
     */
    private static void hashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("旺仔");
        hashSet.add("真果粒");
        hashSet.add("蒙牛");
        hashSet.add("银桥");
        hashSet.add("旺仔");

        System.out.println(hashSet.size());

        String[] strings = hashSet.toArray(new String[]{});
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(strings));

        Cat cat = new Cat("miaomiao", 5, 1);
        Cat cat1 = new Cat("huahua", 2, 3);
        Cat cat2 = new Cat("tom", 4, 2);
        Cat cat3 = new Cat("miaomiao", 5, 4);
        Cat cat4 = new Cat("beibei", 3, 3);
        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat);
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat);
        System.out.println("catSet的长度：" + catSet.size());

        for (Cat c : catSet) {
            System.out.println(c);
        }
        System.out.println("cat的hashCode是：" + cat.hashCode() % 16);
        System.out.println("cat1的hashCode是：" + cat1.hashCode() % 16);
        System.out.println("cat2的hashCode是：" + cat2.hashCode() % 16);
        System.out.println("cat3的hashCode是：" + cat3.hashCode() % 16);
        System.out.println("cat4的hashCode是：" + cat4.hashCode() % 16);
    }
}
