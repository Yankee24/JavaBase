package day08_集合.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author xiao儿
 * @date 2019/9/2 18:09
 * @Description TreeMapDemo
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        treeMap();
    }

    /**
     * TreeMap
     * 1.基于二叉树的红黑树实现
     */
    private static void treeMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("one", "Lily");
        map.put("two", "Tom");
        map.put("three", "Bin");

        map.forEach((key, value) -> System.out.println(key + "->" + value));
        System.out.println("---------------");

        Map<Dog, String> dogs = new TreeMap<>(new DogComparator());
        dogs.put(new Dog(1, "二哈", 3), "dog1");
        dogs.put(new Dog(2, "三哈", 2), "dog2");
        dogs.put(new Dog(3, "四哈", 4), "dog3");

        dogs.forEach((dog, value) -> System.out.println(dog + "->" + value));
    }
}
