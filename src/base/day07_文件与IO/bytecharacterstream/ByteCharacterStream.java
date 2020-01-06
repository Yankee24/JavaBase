package base.day07_文件与IO.bytecharacterstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * @author xiao儿
 * @date 2019年8月29日 下午7:01:30
 * @description 字节字符转换流
 * 
 * OutputStreamWriter：可以将输出的字符流转换为字节流的输出形式
 * InputStreamReader：将输入的字节流转换为字符流输入形式
 */
public class ByteCharacterStream {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream input = new FileInputStream("./src/day07_文件与IO/bytecharacterstream/bytecharacterstream.txt");
		read(input);
		OutputStream output = new FileOutputStream("./src/day07_文件与IO/bytecharacterstream/bytecharacterstream.txt", true);
		write(output);
	}
	
	private static void read(InputStream input) {
		Reader reader = new InputStreamReader(input, Charset.forName("UTF-8"));
		char[] chars = new char[1024];
		int len = -1;
		try {
			while ((len = reader.read(chars)) != -1) {
				System.out.println(new String(chars, 0, len));
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void write(OutputStream output) {
		Writer writer = new OutputStreamWriter(output, Charset.forName("UTF-8"));
		try {
			writer.write("开开心心来玩耍");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
