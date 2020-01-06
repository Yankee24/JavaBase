package base.day08_集合.collection.list;

import java.util.Vector;

/**
 * @author xiao儿
 * @date 2019/9/1 16:46
 * @Description VectorDemo
 */
public class VectorDemo {
    public static void main(String[] args) {
        vector();
    }

    /**
     * Vector
     * 1.实现原理：采用动态对象数组实现，默认构造方法创建了一个大小为10的对象数组
     * 2.扩充的算法：当增量为0时，扩充为原来大小的两倍，当增量大于0时，扩充为原来大小+增量
     * 3.不适合删除或插入操作
     * 4.为了防止数组动态扩充次数过多，建议创建 Vector 时给定初始容量
     * 5.线程安全，适合在多线程访问时使用，在单线程下使用效率较低
     */
    private static void vector() {
        Vector<String> vector = new Vector<>();
        vector.add("旺仔");
        vector.add("真果粒");
        vector.add("蒙牛");
        vector.add("银桥");

        int size = vector.size();
        for (int i = 0; i < size; i++) {
            System.out.println(vector.get(i));
        }
    }
}
