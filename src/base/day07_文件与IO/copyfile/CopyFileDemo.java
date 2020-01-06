package base.day07_文件与IO.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author xiao儿
 * @date 2019年8月29日 下午6:55:12
 * @description 文件的复制
 */
public class CopyFileDemo {
	public static void main(String[] args) {
		System.out.println("start copy...");
		copy("./src/day07_文件与IO/charstream/charstream.txt", "./src/day07_文件与IO/copyfile/charstream.txt");
		System.out.println("copy success!");
	}

	private static void copy(String src, String target) {
		File srcFile = new File(src);
		File targetFile = new File(target);
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(srcFile);
			output = new FileOutputStream(targetFile);
			byte[] bytes = new byte[1024];
			int len = -1;
			while ((len = input.read(bytes)) != -1) {
				output.write(bytes, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (input != null) {
					input.close();
				}
				if (output != null) {
					output.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
