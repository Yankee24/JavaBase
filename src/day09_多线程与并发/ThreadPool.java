package day09_多线程与并发;

import java.util.concurrent.*;

/**
 * @author xiao儿
 * @date 2019/9/5 18:57
 * @Description ThreadPool
 * <p>
 * JDK1.5之后线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 创建线程池（4种）
        // 1.创建一个单线程的线程池
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // 2.创建一个固定大小的线程池
        // ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 3.创建一个可缓存的线程池。大小无限制，取决去JVM，如果线程池的大小超过了处理任务所需要的线程，会自动
        //  回收超过60秒未被使用的线程
        // ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(new MyRunnable6());
        // executorService.execute(new MyRunnable6());
        // executorService.execute(new MyRunnable6());
        // executorService.shutdown();// 结束
        // 4.创建一个无限大小的线程池
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new MyRunnable6(), 3000, TimeUnit.MILLISECONDS);
        scheduledExecutorService.shutdown();
    }
}

class MyRunnable6 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}