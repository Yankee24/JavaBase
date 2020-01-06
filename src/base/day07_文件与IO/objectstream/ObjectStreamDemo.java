package base.day07_文件与IO.objectstream;

import java.io.*;

/**
 * @author xiao儿
 * @date 2019/9/1 10:13
 * @Description ObjectStreamDemo
 */
public class ObjectStreamDemo {
    private static final String pathname_eclipse = "./src/day07_文件与IO/objectstream/dog.obj";
    private static final String pathname_idea = "./Java入门/src/day07_文件与IO/objectstream/dog.obj";

    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    /**
     * 对象序列化
     * 把对象写入文件：实际写入的是类名、属性名、属性类型、属性的值等
     */
    private static void writeObject() {
        Dog dog = new Dog("旺旺", 2, "母");
        File file = new File(pathname_idea);
        try {
            OutputStream output = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(output);
            oos.writeObject(dog);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反序列化
     * 从文件中把对象的内容读取出来，还原成一个对象
     */
    private static void readObject() {
        File file = new File(pathname_idea);
        try {
            InputStream input = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(input);
            Dog dog = (Dog) ois.readObject();
            ois.close();
            System.out.println(dog.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
