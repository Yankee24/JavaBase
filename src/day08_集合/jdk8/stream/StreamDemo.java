package day08_集合.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xiao儿
 * @date 2019/9/2 9:14
 * @Description StreamDemo
 * <p>
 * Stream接口：不是存储的数据结构，数据源可以是一个集合，为了函数式编程创造
 * 惰式执行，数据只能被消费一次
 * <p>
 * 两种类型的操作方法：
 * 1.中间操作（生成一个 Stream）
 * 2.结束操作（执行计算操作）
 */
public class StreamDemo {
    public static void main(String[] args) {
        // foreach方法
        Stream<String> stream = Stream.of("good", "good", "study", "day", "day", "up");
        // stream.forEach((str) -> {
        //     System.out.println(str);
        // });
        // System.out.println("------------");

        // filter
        // stream.filter((s) -> s.length() > 3).forEach(System.out::println);
        // System.out.println("----------------");

        // distinct
        // stream.distinct().forEach(s -> System.out.println(s));

        // map
        // stream.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        // flatMap
        // Stream<List<Integer>> num = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        // num.flatMap(list -> list.stream()).forEach(s -> System.out.println(s));

        // reduce
        // Optional<String> optionalS = stream.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        // System.out.println(optionalS.get());

        // collect
        List<String> list = stream.collect(Collectors.toList());
        list.forEach(s -> System.out.println(s));

        // :: 方法的引用
        // 引用静态的方法 Integer::valueOf
        // 引用对象的方法 list::add
        // 引用构造方法 Arrayalist::new
    }
}
