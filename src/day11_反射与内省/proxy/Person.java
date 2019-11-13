package day11_反射与内省.proxy;

/**
 * @author xiao儿
 * @date 2019/9/10 8:12
 * @Description Person
 */
public class Person implements Subject, Hotel {
    @Override
    public void shopping() {
        System.out.println("付款，买到心仪的衣服");
    }

    @Override
    public void reserve() {
        System.out.println("付预定款，打飞机前往目的地");
    }
}
