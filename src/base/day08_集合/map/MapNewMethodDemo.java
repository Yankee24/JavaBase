package base.day08_集合.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiao儿
 * @date 2019/9/2 18:38
 * @Description MapNewMethodDemo
 */
public class MapNewMethodDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jack");
        map.put(2, "Tom");
        map.put(3, "Lily");

        String str = map.getOrDefault(4, "null");
        System.out.println(str);
        System.out.println("---------------");

        // String val = map.put(3, "Vince");
        // 只会添加不存在相同key的值
        String val = map.putIfAbsent(3, "Vince");
        System.out.println(val);
        map.forEach((key, value) -> System.out.println(key + "->" + value));
        System.out.println("---------------");

        // 根据键和值都匹配时才会删除
        boolean b = map.remove(1, "Lily");
        System.out.println("是否删除：" + b);
        System.out.println("----------------");

        // 替换
        String string  = map.replace(3, "Vince");
        System.out.println(string);
        map.forEach((key, value) -> System.out.println(key + "->" + value));
        System.out.println("-----------------");

        // 替换
        boolean b1 = map.replace(3, "Vince", "Lily");
        System.out.println("是否替换成功：" + b1);
        System.out.println("------------------");

        String string1 = map.compute(1, (key, value) -> value + "1");
        System.out.println(string1);
        System.out.println("-------------------");

        String string2 = map.computeIfAbsent(4, value -> value + "test");
        System.out.println(string2);
        System.out.println("-------------------");

        String string3 = map.merge(1, "888", (oldValue, newValue) -> oldValue.concat(newValue));
        System.out.println(string3);
    }
}
