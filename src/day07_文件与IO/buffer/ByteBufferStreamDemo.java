package day07_文件与IO.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author xiao儿
 * @date 2019年8月31日 下午8:09:18
 * @description BufferStreamDemo
 * 缓存的目的：
 * 解决在写入文件操作时，频繁的操作文件所带来的性能降低的问题
 * BufferedOutputStream 内部默认的缓存大小是8KB，每次写入时先存储到缓存中的byte数组中，
 * 当数组存满，会把数组中的数据写入文件，并且缓存下标归零
 */
public class ByteBufferStreamDemo {
	private static final String pathname_eclipse = "./src/day07_文件与IO/bufferstream/bufferstream.txt";
	private static final String pathname_idea = "./Java入门/src/day07_文件与IO/bufferstream/bufferstream.txt";

	public static void main(String[] args) {
		byteWriter();
		byteReader();
		byteReader2();
	}

	private static void byteWriter() {
		File file = new File("./src/day07_文件与IO/bufferstream/bufferstream.txt");
		try {
			OutputStream output = new FileOutputStream(file);
			// 构造一个字节缓冲流
			BufferedOutputStream buffer = new BufferedOutputStream(output);
			String info = "小河流水哗啦啦";
			buffer.write(info.getBytes());
			buffer.close();
			// output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void byteReader() {
		File file = new File("./src/day07_文件与IO/bufferstream/bufferstream.txt");
		try {
			InputStream input = new FileInputStream(file);
			BufferedInputStream buffer = new BufferedInputStream(input);
			byte[] bytes = new byte[1024];
			int len = -1;
			while ((len = buffer.read(bytes)) != -1) {
				System.out.println(new String(bytes, 0, len));
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void byteReader2() {
		File file = new File("./src/day07_文件与IO/bufferstream/bufferstream.txt");
		try (BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file))) {
			byte[] bytes = new byte[1024];
			int len = -1;
			while ((len = buffer.read(bytes)) != -1) {
				System.out.println(new String(bytes, 0, len));
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
