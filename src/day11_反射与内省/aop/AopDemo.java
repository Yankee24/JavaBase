package day11_反射与内省.aop;

import org.junit.Test;

import java.io.InputStream;

/**
 * @author xiao儿
 * @date 2019/9/10 19:31
 * @Description AopDemo
 */
public class AopDemo {
    @Test
    public void aopTest() {
        // 1.读取配置文件
        InputStream inputStream = Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("day11_反射与内省/aop/bean.properties");
        // 2.创建Bean的工厂对象
        BeanFactory beanFactory = new BeanFactory(inputStream);
        // 3.获取代理对象
        ProxyFactoryBean proxyFactoryBean = (ProxyFactoryBean) beanFactory.getBean("bean");
        IManager proxy = (IManager) proxyFactoryBean.getProxy();
        proxy.add("我是一只喵，名字叫Tom");
    }
}
