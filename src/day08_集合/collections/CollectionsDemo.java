package day08_集合.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/2 20:50
 * @Description CollectionsDemo
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        List<String> sList = Collections.emptyList();
        sList.add("13");
    }
}
