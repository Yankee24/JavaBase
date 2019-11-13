package day11_反射与内省.bean;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * @author xiao儿
 * @date 2019/9/10 9:44
 * @Description
 */
public class BeanDemo {
    @Test
    public void test() {
        // 从客户端获取到的数据
        String name = "bin";
        String age = "18";
        String salary = "20000";

        Employee employee = new Employee();
        try {
            BeanUtils.setProperty(employee, "name", name);
            BeanUtils.setProperty(employee, "age", age);
            BeanUtils.setProperty(employee, "salary", salary);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(employee.getInfo());
    }
}
