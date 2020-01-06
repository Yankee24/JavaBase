package base.day08_集合.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author xiao儿
 * @date 2019/9/2 8:40
 * @Description SupplierDemo
 */
public class SupplierDemo {
    public static void main(String[] args) {
        supplier();
    }

    // 代表结果供应商
    private static void supplier() {
        List<Integer> list = getNums(10, () -> (int) (Math.random() * 100));
        list.forEach((i) -> {
            System.out.println(i);
        });
        System.out.println("------------");
        list.forEach(System.out::println);
    }

    public static List<Integer> getNums(int num, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(supplier.get());
        }
        return list;
    }
}
