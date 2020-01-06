package base.day11_反射与内省.reflection;

import org.junit.Test;

import java.lang.reflect.*;

/**
 * @author xiao儿
 * @date 2019/9/6 12:02
 * @Description ClasDemo
 */
public class ClassDemo {
    /**
     * 获取Class对象的三种形式
     */
    @Test
    public void test1() {
        // 通过对象的getClass()方法
        Dog dog = new Dog("二哈", 5, "白色");
        Class dogClass = dog.getClass();

        // 通过类.class
        Class aClass = Dog.class;

        // 通过Class.forName()方法
        try {
            Class forName = Class.forName("day11_反射与内省.reflection.Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过反射来实例化对象
     */
    @Test
    public void test2() {
        Class<Dog> dogClass = Dog.class;
        try {
            // 通过Class对象实例化类对象，调用了默认无参的构造方法
            Dog dog = (Dog) dogClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取所有的构造方法
     */
    @Test
    public void test3() {
        Class<Dog> dogClass = Dog.class;
        Constructor<?>[] constructors = dogClass.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i].getName());
            System.out.println(constructors[i].getParameterCount());
        }
        try {
            // 获取一个指定的构造方法
            Constructor<Dog> constructor = dogClass.getConstructor(String.class, int.class, String.class);
            // 调用有参数的构造方法来实例化对象
            Dog dog = constructor.newInstance("哈士奇", 4, "黑色");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取的所有属性
     */
    @Test
    public void test4() {
        Class<Dog> dogClass = Dog.class;
        // 获取非私有的属性
        Field[] fields = dogClass.getFields();
        System.out.println(fields.length);
        System.out.println("------------------");
        // 获取所有属性（包括私有属性）
        Field[] declaredFields = dogClass.getDeclaredFields();
        System.out.println(declaredFields.length);
        System.out.println("-------------------");
        for (int i = 0; i < declaredFields.length; i++) {
            int modifiers = declaredFields[i].getModifiers();
            Class<?> type = declaredFields[i].getType();
            String name = declaredFields[i].getName();
            System.out.println(Modifier.toString(modifiers) + " " + type + " " + name);
        }
    }

    @Test
    public void test5() {
        Dog dog = new Dog("拉布拉多", 5, "黄色");
        Class<Dog> dogClass = Dog.class;
        // 获取类的包名
        Package aPackage = dogClass.getPackage();
        System.out.println(aPackage.getName());
        System.out.println("-------------------");
        // 获取公共的方法，包括继承的公有方法
        Method[] methods = dogClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
            if (methods[i].getName().equals("toString")) {
                try {
                    String s = (String) methods[i].invoke(dog);
                    System.out.println(s);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("-------------------");
        // 访问私有方法，获取到本类中定义的所有方法（不包括父类）
        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i]);
            if (declaredMethods[i].getName().equals("set")) {
                // 设置方法可以被访问（去除访问修饰符的检查）
                declaredMethods[i].setAccessible(true);
                try {
                    declaredMethods[i].invoke(dog);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test6() {
        Dog dog = new Dog("拉布拉多", 4, "灰色");
        Class<Dog> dogClass = Dog.class;
        try {
            Field name = dogClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(dog, "二哈");
            System.out.println("修改后的名字为：" + dog.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
