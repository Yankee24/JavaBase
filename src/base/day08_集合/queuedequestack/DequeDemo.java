package base.day08_集合.queuedequestack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author xiao儿
 * @date 2019/9/3 8:25
 * @Description DequeDemo
 *
 * Deque接口：双端队列
 */
public class DequeDemo {
    public static void main(String[] args) {
        deque();
    }

    private static void deque() {
        Deque<String> deque = new LinkedList<>();
        deque.add("Tom");
        deque.add("Job");
        deque.add("Jack");
        deque.add("Bin");

        System.out.println(deque.size());

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
