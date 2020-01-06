package base.day08_集合.optional;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author xiao儿
 * @date 2019/9/3 7:50
 * @Description OptionalDemo
 */
public class OptionalDemo {
    public static void main(String[] args) {
        // 创建 Optional 对象的方式
        Optional<String> optional = Optional.of("Bin");
        Optional<String> optional2 = Optional.ofNullable("Bin");
        Optional<String> optional3 = Optional.empty();

        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        optional.ifPresent(value -> System.out.println(value));

        System.out.println(optional.orElse("nihao"));

        System.out.println(optional.orElseGet(() -> "default"));

        // try {
        //     System.out.println(optional3.orElseThrow(Exception::new));
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        Optional<String> optional4 = optional.map((value) -> value.toUpperCase());
        System.out.println(optional4.orElse("没有"));

        Optional<String> optional5 = optional.flatMap((value) -> Optional.of(value.toUpperCase()));
        System.out.println(optional5.orElse("无"));

        Optional<String> optional6 = optional.filter((value) -> value.length() > 3);
        System.out.println(optional6.orElse("长度小于等于3"));
    }
}
