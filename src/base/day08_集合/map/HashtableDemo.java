package base.day08_集合.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author xiao儿
 * @date 2019/9/2 17:34
 * @Description Hashtable
 */
public class HashtableDemo {
    public static void main(String[] args) {
        hashtable();
    }

    /**
     * Hashtable
     * 1.JDK1.0开始
     * 2.基于哈希表实现（数组+链表）
     * 3.默认数组大小是11，加载因子0.75
     * 4.扩充方式：原数组大小<<1（*2） + 1
     * 5.线程安全的，用在多线程访问时
     */
    private static void hashtable() {
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("one", "Lily");
        hashtable.put("two", "Tom");
        hashtable.put("three", "Bin");

        hashtable.forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
