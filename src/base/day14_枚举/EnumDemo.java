package base.day14_枚举;

import org.junit.Test;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;

/**
 * @author xiao儿
 * @date 2019/9/4 8:22
 * @Description EnumDemo
 */
public class EnumDemo {
    public static final int RED = 0x1;
    public static final int GREEN = 0x2;
    public static final int BLUE = 0x3;
    private int color;

    @Test
    public void test1() {
        color = RED;
        color = 4;
        System.out.println(color);
    }

    public Color colorEnum;

    @Test
    public void test2() {
        // colorEnum = Color.RED;
        colorEnum = Color.BLUE;
        System.out.println(colorEnum);
        System.out.println(colorEnum.name());
        System.out.println(colorEnum.ordinal());
        System.out.println(colorEnum.toString());

        Color[] values = Color.values();
        System.out.println(Arrays.toString(values));
    }

    @Test
    public void test3() {
        EnumSet<Color> set = EnumSet.allOf(Color.class);
        for (Color c : set) {
            System.out.println(c);
        }

        EnumMap<Color, String> map = new EnumMap<>(Color.class);
        map.put(Color.RED, "red");
        map.put(Color.BLUE, "blue");
        map.put(Color.GREEN, "green");

        map.forEach((key, value) -> System.out.println(key + "-" + value));
    }

    @Test
    public void test4() {
        System.out.println(Color.RED);
    }

    @Test
    public void test5() {
        System.out.println(Color.GREEN.getColor());
    }

    @Test
    public void test6() {
        System.out.println(Color.GREEN.getColor2());
    }

    // 使用枚举实现单例设计模式
    @Test
    public void test7() {
        Singleton.SINGLETON.method();
    }
}
