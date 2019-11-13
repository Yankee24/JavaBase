package day08_集合.collection.set;

import java.util.Comparator;

/**
 * @author xiao儿
 * @date 2019/9/1 22:05
 * @Description CatComparator
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }
}
