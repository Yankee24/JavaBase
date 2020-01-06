package base.day08_集合.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author xiao儿
 * @date 2019/9/2 8:50
 * @Description PredicateDemo
 */
public class PredicateDemo {
    public static void main(String[] args) {
        predicate();
    }

    // 断言接口
    private static void predicate() {
        List<String> list = Arrays.asList("Lily", "Tom", "Job", "Curly");
        List<String> result = filter(list, s -> s.contains("C"));
        result.forEach(System.out::println);
    }

    private static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {// 测试是否符合要求
                result.add(s);
            }
        }
        return result;
    }
}
