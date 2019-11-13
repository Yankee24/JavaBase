package day08_集合.map;

import java.util.Comparator;

/**
 * @author xiao儿
 * @date 2019/9/2 18:17
 * @Description DogComparator
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getId() - o2.getId();
    }
}
