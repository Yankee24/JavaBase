package day08_集合.jdk8;

import java.util.function.Function;

/**
 * @author xiao儿
 * @date 2019/9/2 8:21
 * @Description FunctionDemo
 */
public class FunctionDemo {
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        String s = strToUpp("xiaoer", str -> str.toUpperCase());
        System.out.println(s);
    }

    public static String strToUpp(String str, Function<String, String> f) {
        return f.apply(str);
    }
}
