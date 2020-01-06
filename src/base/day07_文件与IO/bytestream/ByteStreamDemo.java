package base.day07_文件与IO.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author xiao儿
 * @date 2019年8月28日 下午7:24:16
 * @description 字节输入输出流
 * 输入流：超类 InputStream，对文件的输入流使用子类：FileInputSteam
 * 输出流：超类 OutputStream，对文件的输出流使用子类：FileOutputStream
 * 
 * 输入输出字节流：每次只会操作一个字节（从文件读取或写入）
 * 字节操作流，默认每次执行写入操作会直接把数据写入文件
 */
public class ByteStreamDemo {
	public static void main(String[] args) {
		out();
		in();
	}
	
	private static void out() {
		// 0.确定目标文件
		File file = new File("./src/day07_文件与IO/bytestream/bytestream.txt");
		// 1.构建文件输出流对象
		try {
			OutputStream outputStream = new FileOutputStream(file, true);// append 为 true表示追加内容
			// 2.输出的内容
			String info = "小河流水哗啦啦\r\n";
			// String line = System.getProperty("line.separator");// 获取换行符
			// 3.把内容写入到文件
			outputStream.write(info.getBytes());
			// 4.关闭流
			outputStream.close();
			System.out.println("write success.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void in() {
		// 0.确定目标文件
		File file = new File("./src/day07_文件与IO/bytestream/bytestream.txt");
		// 1.创建一个输入流对象
		try {
			InputStream inputStream = new FileInputStream(file);
			byte[] bytes = new byte[1024];
			// 如果上次读取完的剩余字符不足下次的长度，后面的剩余空间将由上次的内容继续填充
//			byte[] bytes = new byte[10];
			StringBuilder builder = new StringBuilder();
			int len = -1;
			// 把数据读入到数组中，并返回读取的字节数，当不等于-1时，表示读取到数据，等于-1时表示已经读完
			while ((len = inputStream.read(bytes)) != -1) {
				// 根据读取到的字节数组，再转换为字符串内容，添加到 StringBuilder 中
				builder.append(new String(bytes, 0, len));
			}
			// 输出内容
			System.out.println(builder);
			// 关闭输入流
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
