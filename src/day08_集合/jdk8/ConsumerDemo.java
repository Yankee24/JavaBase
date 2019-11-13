package day08_集合.jdk8;

import java.util.function.Consumer;

/**
 * @author xiao儿
 * @date 2019/9/2 8:31
 * @Description ConsumerDemo
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        consumer();
    }

    // 消费者接口
    private static void consumer() {
        strToUpp("xiaoer", str -> System.out.println(str.toUpperCase()));
    }

    public static void strToUpp(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }
}
