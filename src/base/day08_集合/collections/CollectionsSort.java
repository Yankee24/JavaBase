package base.day08_集合.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/2 19:59
 * @Description CollectionsSort
 *
 * 主要针对List接口相关
 */
public class CollectionsSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Lily");
        list.add("Tom");
        Collections.reverse(list);
        System.out.println("reverse：" + list);
        System.out.println("-----------------");

        Collections.shuffle(list);
        System.out.println("shuffle：" + list);
        System.out.println("-----------------");

        Collections.sort(list);
        System.out.println("sort：" + list);
        System.out.println("-----------------");

        Collections.swap(list, 1, 2);
        System.out.println("swap：" + list);
        System.out.println("-----------------");

        Collections.rotate(list, 2);
        System.out.println("rotate：" + list);
        System.out.println("-----------------");
    }
}
