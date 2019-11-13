package day11_反射与内省.proxy;

import org.junit.Test;

/**
 * @author xiao儿
 * @date 2019/9/10 8:20
 * @Description ProxyDemo
 */
public class ProxyDemo {
    @Test
    public void testProxy() {
        CreateProxy p = new CreateProxy();// 用来创建代理对象的对象
        // Subject person = new Person();
        // Subject proxy = (Subject) p.create(person);
        // proxy.shopping();// invoke
        Hotel person = new Person();
        Hotel proxy = (Hotel) p.create(person);
        proxy.reserve();
    }
}
