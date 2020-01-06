package base.day07_文件与IO.print;

import java.io.*;

/**
 * @author xiao儿
 * @date 2019/9/1 9:41
 * @Description PrintStreamDemo
 *
 * 字节打印流：在字节打印时，可以增强输出功能
 */
public class PrintStreamDemo {
    private static final String pathname_eclipse = "./src/day07_文件与IO/print/printStream.txt";
    private static final String pathname_idea = "./Java入门/src/day07_文件与IO/print/printStream.txt";

    public static void main(String[] args) {
        printStream();
    }

    private static void printStream() {
        File file = new File(pathname_idea);
        try {
            OutputStream out = new FileOutputStream(file);
            // 缓存
            BufferedOutputStream bos = new BufferedOutputStream(out);
            // 增强打印功能
            PrintStream ps = new PrintStream(bos);
            ps.println("小河流水甜甜");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
