package base.day07_文件与IO.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author xiao儿
 * @date 2019年8月28日 上午10:15:42
 * @description File类基本使用
 */
public class FileDemo {
	public static void main(String[] args) {
		// File 类表示一个文件或目录
		File file = new File("./src/day07_文件与IO/file/file.txt");
		// File file = new File("." + File.separator + "test" + File.separator +
		// "file.txt");
		if (!file.exists()) { // 判断文件是否存在
			try {
				file.createNewFile();// 创建文件
				System.out.println("文件创建成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 判断是否为文件夹
		System.out.println("是否为文件夹：" + file.isDirectory());

		// 创建文件夹
		File file2 = new File("./src/day07_文件与IO/file/my");
		boolean b = file2.mkdir();
		System.out.println("my文件夹创建成功：" + b);

		// 创建文件
		File file3 = new File("./src/day07_文件与IO/file/my/my.txt");
		if (!file3.exists()) {
			try {
				file3.createNewFile();
				System.out.println("my.txt文件创建成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 删除文件
		boolean b2 = file3.delete();
		System.out.println("my.txt文件是否删除：" + b2);

		// 删除文件夹时需要里面为空
		boolean b3 = file2.delete();
		System.out.println("my文件夹是否删除成功：" + b3);

		// 列出文件夹中的文件：列出当前目录下的文件名
		File file4 = new File("./src");
		String[] lists = file4.list();
		System.out.println(Arrays.toString(lists));

		// 列出文件夹中所有的文件：列出当前目录下的所有文件，以 File 对象返回
		File[] listFiles = file4.listFiles();
		System.out.println(Arrays.toString(listFiles));
		for (File file5 : listFiles) {
			System.out.println("name=" + file5.getName() + "；length=" + file5.length() + "；path=" + file5.getPath()
					+ "；absolutePath=" + file5.getAbsolutePath() + "；hidden=" + file5.isHidden() + "；read="
					+ file5.canRead() + "；lastModified="
					+ new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date(file5.lastModified())));
		}

		// 为文件重命名
		boolean b4 = file.renameTo(new File("./src/day07_文件与IO/file/my.txt"));
		System.out.println("file.txt重命名是否成功：" + b4);
		System.out.println(file.getName());
		
		// 返回文件大小
		System.out.println("file.txt文件大小为：" + file.length());

		// 返回路径名字符串
		String pathname = file.getPath();
		System.out.println("file.txt的文件路径为：" + pathname);
		
		// 过滤器
//		File[] files = file4.listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".md");
//			}
//		});
		File[] files = file4.listFiles((name) -> name.getName().endsWith(".md"));
		System.out.println(Arrays.toString(files));
	}
}
