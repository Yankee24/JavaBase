package day08_集合.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/2 20:08
 * @Description CollectionsSearch
 *
 * 主要针对Collection接口相关
 */
public class CollectionsSearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Lily");
        list.add("Jack");

        // 排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------------");

        System.out.println("Tom：" + Collections.binarySearch(list, "Tom"));
        System.out.println("---------------");

        System.out.println("max：" + Collections.max(list));
        System.out.println("---------------");

        System.out.println("min：" + Collections.min(list));
        System.out.println("---------------");

        Collections.fill(list, "Bin");
        System.out.println("fill：" + list);
        System.out.println("---------------");

        System.out.println("Bin：" + Collections.frequency(list, "Bin"));
        System.out.println("---------------");

        Collections.replaceAll(list, "Bin", "Lily");
        System.out.println(list);
        System.out.println("---------------");
    }
}
