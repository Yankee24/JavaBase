package base.day11_反射与内省.aop;

import java.util.ArrayList;

/**
 * @author xiao儿
 * @date 2019/9/10 19:03
 * @Description IManagerImpl
 */
public class IManagerImpl implements IManager {
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public void add(String item) {
        // System.out.println("add start " + System.currentTimeMillis());
        list.add(item);
        System.out.println(item);
        // System.out.println("add end " + System.currentTimeMillis());
    }
}
