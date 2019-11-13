package day08_集合.guava;

import java.text.SimpleDateFormat;
import java.util.*;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.*;
import com.google.common.collect.Table.Cell;
import org.junit.Test;

/**
 * @author xiao儿
 * @date 2019/9/3 10:01
 * @Description GuavaDemo
 */
public class GuavaDemo {
    /**
     * 设置只读
     */
    @Test
    public void testGuava1() {
        System.out.println("test Guava1");
        // List<String> list = Arrays.asList("Tom", "Lily", "Bin", "Jack");
        // list.add("Job");
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Tom");
        list.add("Lily");
        list.add("Bin");
        // List<String> readList = Collections.unmodifiableList(list);
        // readList.add("Vince");

        // ImmutableList<String> iList = ImmutableList.of("Jack", "Lily", "Tom", "Bin");
        // iList.add("Job");
    }

    /**
     * 过滤器
     */
    @Test
    public void testGuava2() {
        List<String> list = Lists.newArrayList("Java", "H5", "JavaScript", "Python", "PHP");
        Collection<String> result = Collections2.filter(list, (e) -> e.startsWith("J"));
        result.forEach((value) -> System.out.println(value));
    }

    /**
     * 转换
     */
    @Test
    public void testGuava3() {
        Set<Long> timeSet = Sets.newHashSet(20121212L, 20190901L, 20180808L);
        Collection<String> timeCollection = Collections2.transform(timeSet, (e) -> new SimpleDateFormat("yyyy-MM-dd").format(e));
        timeCollection.forEach(System.out::println);
    }

    /**
     * 组合式函数编程
     */
    @Test
    public void testGuava4() {
        List<String> list = Lists.newArrayList("Java", "H5", "JavaScript", "Python", "PHP");
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.length() > 4 ? input.substring(0, 4) : input;
            }
        };
        Function<String, String> function1 = new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        };

        Function<String, String> function2 = Functions.compose(function, function1);
        Collection<String> collection = Collections2.transform(list, function2);
        collection.forEach(System.out::println);
    }

    /**
     * 加入约束：非空、长度验证
     */
    @Test
    public void testGuava5() {
        // Set<String> set = Sets.newHashSet();
        // 14版本可用
        // Constraint<String> constraint = new Constraint<>() {
        // 	@Override
        // 	public String checkElement(String element) {
        //
        // 	}
        // };
        // Preconditions.checkArgument(expression);
        // Preconditions.checkNotNull(reference);
    }

    /**
     * 集合操作：交集、差集、并集
     */
    @Test
    public void testGuava6() {
        Set<Integer> set = Sets.newHashSet(1, 2, 3);
        Set<Integer> set1 = Sets.newHashSet(3, 4, 5);
        // 交集
        Sets.SetView<Integer> view = Sets.intersection(set, set1);
        view.forEach(System.out::println);
        System.out.println("----------------");
        // 差集
        Sets.SetView<Integer> view1 = Sets.difference(set, set1);
        view1.forEach(System.out::println);
        System.out.println("----------------");
        // 并集
        Sets.SetView<Integer> view2 = Sets.union(set, set1);
        view2.forEach(System.out::println);
    }

    /**
     * Multiset：无序可重复
     */
    @Test
    public void testGuava7() {
        String s = "good good study day day up";
        String[] strings = s.split(" ");
        HashMultiset<String> hashSet = HashMultiset.create();
        for (String str : strings) {
            hashSet.add(str);
        }
        Set<String> set = hashSet.elementSet();
        for (String str : set) {
            System.out.println(str + "：" + hashSet.count(str));
        }
    }

    /**
     * Multimap：key可以重复
     */
    @Test
    public void testGuava8() {
        Map<String, String> map = new HashMap<>();
        map.put("Java从入门到放弃", "Bin");
        map.put("Android从入门到放弃", "Bin");
        map.put("PHP从入门到放弃", "Jack");
        map.put("笑看人生", "Job");

        Multimap<String, String> multimap = ArrayListMultimap.create();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            multimap.put(entry.getValue(), entry.getKey());
        }

        Set<String> keySet = multimap.keySet();
        for (String key : keySet) {
            Collection<String> value = multimap.get(key);
            System.out.println(key + "->" + value);
        }
    }

    /**
     * BiMap：双向Map(bidirectional Map)键与值不能重复
     */
    @Test
    public void testGuave9() {
        BiMap<String, String> map = HashBiMap.create();
        map.put("finally_test", "1820232384233");
        map.put("bin_test", "23234342343");
        map.put("tom_test", "4324334234234");
        String name = map.inverse().get("4324334234234");
        System.out.println(name);

        System.out.println(map.inverse().inverse() == map);
    }

    /**
     * 双键的Map-->Table-->rowKey + columnKey + value
     */
    @Test
    public void testGuava10() {
    	Table<String, String, Integer> table = HashBasedTable.create();
    	table.put("Jack", "Java", 80);
    	table.put("Tom", "Python", 90);
    	table.put("Bin", "PHP", 70);
    	table.put("Lily", "JavaScript", 30);

    	Set<Cell<String, String, Integer>> cells = table.cellSet();
    	for (Cell c : cells) {
			System.out.println(c.getRowKey() + "-" + c.getColumnKey() + "-" + c.getValue());
		}
    }
}
