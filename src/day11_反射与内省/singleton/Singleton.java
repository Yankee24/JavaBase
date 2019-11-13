package day11_反射与内省.singleton;

import java.io.Serializable;

/**
 * @author xiao儿
 * @date 2019/9/10 20:10
 * @Description SingleTon
 * 单例模式
 * 1.多线程访问的安全问题
 * 2.加上volatile关键字，保证变量的一致性
 * 3.防止反射私有化构造方法
 * 4.让单例类序列化安全
 */
public class Singleton implements Serializable {
    private volatile static Singleton singleton = null;

    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("此类对象为单例模式，已经被实例化");
        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
