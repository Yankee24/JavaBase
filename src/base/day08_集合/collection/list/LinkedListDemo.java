package base.day08_集合.collection.list;

import java.util.LinkedList;

/**
 * @author xiao儿
 * @date 2019/9/1 17:16
 * @Description LinkedListDemo
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        linkedList();
    }

    /**
     * LinkedList
     * 1.实现原理：采用双向链表结构实现
     * 2.适合插入或删除操作，性能高
     * 3.线程不安全
     */
    private static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("旺仔");
        linkedList.add("真果粒");
        linkedList.add("蒙牛");
        linkedList.add("银桥");

        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
