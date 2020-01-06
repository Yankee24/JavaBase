package base.day11_反射与内省.introspector;

import org.junit.Test;

/**
 * @author xiao儿
 * @date 2019/9/10 18:49
 * @Description BeanDemo
 */
public class BeanDemo {
    @Test
    public void getBeanTest() {
        Config bean = (Config) BeanFactory.getBean("bean.name");
        System.out.println(bean);
    }
}
