package base.day07_文件与IO.file;

import java.io.File;

/**
 * @author xiao儿
 * @date 2019年8月28日 下午5:49:10
 * @description 在指定的目录下查找文件
 */
public class FindFile {
	public static void main(String[] args) {
		findFile(new File("./src"), ".java");
	}
	
	// 查找文件的方法
	private static void findFile(File target, String ext) {
		if (target == null) 
			return;
		// 如果文件是目录
		if (target.isDirectory()) {
			File[] files = target.listFiles();
			if (files != null) {
				for (File file : files) {
					findFile(file, ext);// 递归调用
				}
			}
		} else {
			// 此处表示 File 是一个文件
			String name = target.getName().toLowerCase();
			if (name.endsWith(ext)) {
				System.out.println(target.getAbsolutePath());
			}
		}
	}
}
