package base.day07_文件与IO.print;

import java.io.*;

/**
 * @author xiao儿
 * @date 2019/9/1 9:52
 * @Description PrintWriterDemo
 *
 * 字符打印流：
 */
public class PrintWriterDemo {
    private static final String pathname_eclipse = "./src/day07_文件与IO/print/printWriter.txt";
    private static final String pathname_idea = "./Java入门/src/day07_文件与IO/print/printWriter.txt";

    public static void main(String[] args) {
        printWriter();
    }

    private static void printWriter() {
        File file = new File(pathname_idea);
        try {
            Writer writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("小哥你好");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
