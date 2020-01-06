package base.day12_泛型;

import org.junit.Test;

import java.util.*;

/**
 * @author xiao儿
 * @date 2019/9/3 19:16
 * @Description GenericDemo
 */
public class GenericDemo {
    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        // list.add(10);
        // list.add(new Object());

        for (int i = 0; i <list.size(); i++) {
            // 如果我们不确定集合中的元素类型，那么我们需要在处理元素时进行判断元素的类型，才可以执行不同的操作
        }
    }

    @Test
    public void test2() {
        Node<Number> numberNode = new Node<>();
        Node<Integer> integerNode = new Node<>();
    }

    @Test
    public void test3() {
        Node<Number> numberNode = new Node<>(10);
        Node<Integer> integerNode = new Node<>(20);

        getData(numberNode);
        // 不支持赋值
        // getData(integerNode);
        // numberNode = integerNode;
        getDate2(integerNode);
        getUpperNumberData(numberNode);
        getUpperNumberData(integerNode);
    }

    public static void getData(Node<Number> node) {
        System.out.println(node.getData());
    }

    /**
     * 使用通配符定义泛型类型，此时只能输出，不能修改
     * @param node
     */
    public static void getDate2(Node<?> node) {
        // node.setData(20);
        System.out.println(node.getData());
    }

    public static void getUpperNumberData(Node<? extends Number> data) {
        // 只能是 Number 类或其子类
        System.out.println("data=" + data.getData());
        // data.setData(10);
    }

    /**
     * 泛型方法
     * @param array
     * @param i
     * @param j
     * @param <T>
     * @return
     */
    public static <T> T[] function(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    @Test
    public void test4() {
        String[] arrays = {"Tom", "Lily", "Bin", "Jack"};
        String[] strs = function(arrays, 0, 2);
        System.out.println(Arrays.toString(strs));
    }

    @Test
    public void test5() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tom");
        map.put(2, "Lily");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
