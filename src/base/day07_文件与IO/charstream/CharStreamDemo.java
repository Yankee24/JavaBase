package base.day07_文件与IO.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author xiao儿
 * @date 2019年8月28日 下午9:41:01
 * @description 字符输入输出流
 * 
 * 输入流：Reader，对文件的操作使用子类：FiLeReader
 * 输出流：Writer，对文件的操作使用子类：FileWriter
 * 
 * 每次操作的单位是一个字符
 * 文件字符操作类会自带缓存，默认大小为1024字节，在缓存满后，或手动刷新缓存，或关闭流时会把数据写入文件
 */
public class CharStreamDemo {
	public static void main(String[] args) {
		out();
		in();
	}
	
	private static void out() {
		File file = new File("./src/day07_文件与IO/charstream/charstream.txt");
		try {
			Writer writer = new FileWriter(file, true);
			writer.write("小河流水哗啦啦");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void in() {
		File file = new File("./src/day07_文件与IO/charstream/charstream.txt");
		try {
			Reader reader = new FileReader(file);
			char[] cs = new char[1];
			int len = -1;
			StringBuilder builder = new StringBuilder();
			while ((len = reader.read(cs)) != -1) {
				builder.append(new String(cs, 0, len));
			}
			reader.close();
			System.out.println(builder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
