package base.day06_常用类库.runtime;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) {
		// 获取Java运行时相关的运行时对象
		Runtime runtime = Runtime.getRuntime();
		System.out.println("处理器数量：" + runtime.availableProcessors() + "个");
		System.out.println("JVM总内存数：" + runtime.totalMemory() + " byte");
		System.out.println("JVM空闲内存数：" + runtime.freeMemory() + " byte");
		System.out.println("JVM可用最大内存数：" + runtime.maxMemory() + " byte");
		
		// 在单独的进程中执行指定的字符串命令
		try {
			runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 加载C、C++编写的类库
		// System.loadLibrary(libname);
	}
}
