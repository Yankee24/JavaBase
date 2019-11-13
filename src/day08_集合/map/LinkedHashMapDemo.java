package day08_集合.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author xiao儿
 * @date 2019/9/2 17:59
 * @Description LinkedHashMapDemo
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        linkedHashMap();
    }

    /**
     * LinkedHashMap
     * 1.LinkedHashMap 是 HashMap 的子类，由于 HashMap 不能保证顺序恒久不变，此类使用双重链表来维护元素添加的顺序
     */
    private static void linkedHashMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one", "Lily");
        map.put("two", "Tom");
        map.put("three", "Bin");

        map.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });
    }
}
