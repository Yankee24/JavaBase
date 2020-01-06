package base.day08_集合.collection.set;

import java.util.TreeSet;

/**
 * @author xiao儿
 * @date 2019/9/1 21:55
 * @Description TreeSetDemo
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        treeSet();
    }

    /**
     * TreeSet
     * 1.有序的，基于 TreeMap（二叉树数据结构），对象需要比较大小，通过对象比较器 Comparator，对象比较器还可以去除重复元素
     * 如果自定义的数据类，没有实现比较器接口，将无法添加到 TreeSet 集合中
     */
    private static void treeSet() {
        TreeSet<Cat> treeSet = new TreeSet<>(new CatComparator());
        Cat cat = new Cat("miaomiao", 5, 1);
        Cat cat1 = new Cat("huahua", 2, 3);
        Cat cat2 = new Cat("tom", 3, 2);
        Cat cat3 = new Cat("miaomiao", 4, 4);
        Cat cat4 = new Cat("beibei", 3, 3);
        treeSet.add(cat);
        treeSet.add(cat1);
        treeSet.add(cat2);
        treeSet.add(cat3);
        treeSet.add(cat4);

        System.out.println(treeSet.size());

        for (Cat c : treeSet) {
            System.out.println(c);
        }
    }
}
