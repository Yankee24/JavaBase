package day07_文件与IO.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author xiao儿
 * @date 2019年8月31日 下午9:24:46
 * @description CharacterBufferStreamDemo
 *
 * 字符流：
 * 1.加入字符缓存流，增强读取功能（readLine）
 * 2.更高效的读取数据
 * FileReader：内部使用 InputStreamReader (sun.nio.cs.StreamDecoder)，解码过程：byte->char，默认缓存大小为8KB
 * BufferedReader：默认缓存大小是8KB，但可以手动指定缓存大小，把数据直接读取到缓存中，减少每次转换过程，效率更高
 * BufferedWriter：同上
 */
public class CharacterBufferDemo {
    private static final String pathname_eclipse = "./src/day07_文件与IO/bufferstream/bufferstream.txt";
	private static final String pathname_idea = "./Java入门/src/day07_文件与IO/bufferstream/bufferstream.txt";

    public static void main(String[] args) {
        charWriter();
        charReader();
    }

    private static void charWriter() {
        File file = new File(pathname_idea);
        try {
            Writer writer = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(writer);
            String info = "，村花到我家。";
            buffer.write(info);
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void charReader() {
        File file = new File(pathname_idea);
        try {
            Reader reader = new FileReader(file);
            // 为字符流提供缓存，已达到高效读取的目的
            BufferedReader buffer = new BufferedReader(reader);
            char[] chars = new char[1024];
            int len = -1;
            while ((len = buffer.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
