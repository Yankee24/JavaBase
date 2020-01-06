package base.day08_集合.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author xiao儿
 * @date 2019/9/2 10:00
 * @Description HashMapDemo
 *
 * Map接口：
 * 1.键值对存储一组对象
 * 2.Key保证唯一，不能重复；Value可以重复
 * 3.具体的实现类：HashMap、TreeMap 和 Hashtable LinkedHashMap
 */
public class HashMapDemo {
    public static void main(String[] args) {
        hashMap();
    }

    /**
     * HashMap 的实现原理：
     * 1.基于哈希表（数组+链表+二叉树（红黑树））
     * 2.默认负载因子：0.75，默认数组大小是16
     * 3.把对象存储到哈希表中，如何存储？
     * 把key对象通过hash方法计算哈希值，然后用哈希值对数组长度取余（默认是16），来决定该key对象在数组中存储的位置，
     * 当这个位置有多个对象时，以链表存储，JDK1.8后，当链表长度大于8时，链表将转换为二叉树（红黑树）
     * 这样的目的：为了取值更快，存储的数据量越大，性能的表现越明显
     * 4.扩充原理：当数组的容量超过了75%，那么表示该数组需要扩充，如何扩充？
     * 扩充的算法：当前的数组容量<<1（相当于是乘以2），扩大1倍，扩充次数过多会影响性能，每次扩充表示哈希表重新散列
     * （重新计算每个对象的存储位置），我们在开发中尽量要减少扩充次数带来的性能问题
     * 5.线程不安全，适合在单线程中使用
     */
    private static void hashMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tom");
        map.put(2, "Jack");
        map.put(3, "Lily");
        map.put(4, "Bin");

        System.out.println("size=" + map.size());
        // 从map中取值
        System.out.println(map.get(1));
        System.out.println("------------");

        // map的遍历
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry e : entrySet) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }
        System.out.println("------------");

        // keySet：遍历键，可以通过键查找值
        Set<Integer> keys = map.keySet();
        for (Integer i : keys) {
            String value = map.get(i);
            System.out.println(i + "->" + value);
        }
        System.out.println("------------");

        // values：遍历值，不能通过值查找键
        Collection<String> values =  map.values();
        for (String s : values) {
            System.out.println(s);
        }
        System.out.println("------------");

        // foreach
        map.forEach((key, value) -> System.out.println(key + "->" + value));

        System.out.println(map.containsKey(7));
        System.out.println("------------");

        // hash
        Integer key = 1314;
        int h;
        int hashCode = (key.hashCode());
        int hash = (h = key.hashCode()) ^ (h >>> 16);
        int count = hash & 15;
        System.out.println(hashCode);
        System.out.println(hash);
        System.out.println(count);
    }
}
