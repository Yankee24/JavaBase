package base.day07_文件与IO.objectstream;

import java.io.*;
import java.util.Arrays;

/**
 * @author xiao儿
 * @date 2019/9/1 11:11
 * @Description ObjectsStreamDemo
 */
public class ObjectsStreamDemo {
    private static final String pathname_eclipse = "./src/day07_文件与IO/objectstream/dog.obj";
    private static final String pathname_idea = "./Java入门/src/day07_文件与IO/objectstream/dog.obj";

    public static void main(String[] args) {
        writeObjects();
        readObjects();
    }

    private static void writeObjects() {
        Dog dog = new Dog("旺旺", 2, "母");
        Dog dog2 = new Dog("万万", 3, "公");
        Dog dog3 = new Dog("旺财", 1, "母");
        Dog[] dogs = {dog, dog2, dog3};
        File file = new File(pathname_idea);
        try {
            OutputStream output = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(output);
            oos.writeObject(dogs);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readObjects() {
        File file = new File(pathname_idea);
        try {
            InputStream input = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(input);
            Dog[] dogs = (Dog[]) ois.readObject();
            System.out.println(Arrays.toString(dogs));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
