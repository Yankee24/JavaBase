package base.day08_集合.queuedequestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiao儿
 * @date 2019/9/3 8:14
 * @Description QueueDemo
 * <p>
 * Queue接口：队列，是一种先进先出的线性数据结构
 * LinkedList 类实现了 Queue 接口
 * 请求队列，消息队列
 */
public class QueueDemo {
    public static void main(String[] args) {
        queue();
    }

    private static void queue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tom");
        queue.add("Lily");
        queue.add("Job");
        queue.add("Jack");

        System.out.println(queue.size());
        // 取出对头，但并不删除
        System.out.println(queue.peek());
        System.out.println(queue.size());
        // 移除对头
        System.out.println(queue.poll());
        System.out.println(queue.size());

        System.out.println(queue);
    }
}
