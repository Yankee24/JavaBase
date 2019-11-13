package day15_注解;

import java.lang.annotation.*;

/**
 * @author xiao儿
 * @date 2019/9/11 9:30
 * @Description 自定义注解
 */
// 用于生成文档
@Documented
// 表示该注解的作用范围在运行时存在
@Retention(value = RetentionPolicy.RUNTIME)
// 用于表示注解的引用范围（类型，方法，属性，构造器，参数，局部变量，包，Annotation）
@Target(value = ElementType.TYPE)
@Inherited
public @interface MyAnnotation {
    // 定义变量
    public String name();
    public int age() default 2;// 给变量设置默认值
    public String[] like();// 定义一个数组变量
    public Color color();// 定义一个枚举类型的变量
}

